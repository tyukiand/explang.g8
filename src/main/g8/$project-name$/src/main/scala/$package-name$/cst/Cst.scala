package $package-name$.cst

enum Cst:
  case Num(n: Int)
  case Par(c: Cst)
  case Add(a: Cst, b: Cst)
  case Sub(a: Cst, b: Cst)
  case Mul(a: Cst, b: Cst)
  case Div(a: Cst, b: Cst)

