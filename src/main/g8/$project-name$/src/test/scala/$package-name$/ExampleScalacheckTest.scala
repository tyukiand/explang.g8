package $package-name$

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object ExampleScalacheckTest extends Properties("Addition") {
  
  property("commutative") = forAll { (a: Int, b: Int) =>
    a + b == b + a
  }
  
  // Handle potential overflows with bounded values
  property("commutative with bounded values") = forAll { (a: Int, b: Int) =>
    // Avoid values that might cause overflow
    val boundedA = a % 1000000
    val boundedB = b % 1000000
    
    boundedA + boundedB == boundedB + boundedA
  }
}

