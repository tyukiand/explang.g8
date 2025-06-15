package $package-name$.cst

import munit.*
import fastparse.*

class ParseExprTest extends FunSuite {
  test("2 + 2 should be parseable") {
    assertEquals(Right(Cst.Add(Cst.Num(2), Cst.Num(2))), parseExpr("2+2"))
  }
}

