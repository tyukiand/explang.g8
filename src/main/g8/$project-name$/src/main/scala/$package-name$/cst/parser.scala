package $package-name$.cst

import fastparse.*
import NoWhitespace.*

/*
See the excellent documentation at
https://com-lihaoyi.github.io/fastparse/#FastParse3.1.1
for more details & examples.
*/
private def number[\$: P]: P[Cst] = P(CharIn("0-9").rep(1).!.map(s => Cst.Num(s.toInt)))
private def parens[\$: P]: P[Cst] = P("(" ~/ addSub ~/ ")").map(t => Cst.Par(t))
private def factor[\$: P]: P[Cst] = P(number | parens)
private def divMul[\$: P]: P[Cst] = P(factor ~ (CharIn("*/").! ~/ factor).rep).map(combineReps)
private def addSub[\$: P]: P[Cst] = P(divMul ~ (CharIn("+\\\\-").! ~/ divMul).rep).map(combineReps)
private def expr[\$: P]: P[Cst] = P(addSub ~ End)

private def combineReps(first: Cst, rest: Seq[(String, Cst)]): Cst =
  rest.foldLeft(first) { case (acc, (op, c)) => op match
    case "+" => Cst.Add(acc, c)
    case "-" => Cst.Sub(acc, c)
    case "*" => Cst.Mul(acc, c)
    case "/" => Cst.Div(acc, c)
  }

def parseExpr(code: String): Either[String, Cst] = parse(code, p => expr(using p)) match
  case Parsed.Success(cst, _) => Right(cst)
  case Parsed.Failure(expected, failIdx, extra) => {
    val longAggMsg = extra.trace().longAggregateMsg
    Left(longAggMsg)
  }

