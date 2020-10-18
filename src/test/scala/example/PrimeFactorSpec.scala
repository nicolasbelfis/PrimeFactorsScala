package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PrimeFactorSpec extends AnyFlatSpec with Matchers {
  "The Prime factor object" should "return a list of prime factors" in {
    PrimeFactors.of(1) shouldBe List()
    PrimeFactors.of(2) shouldBe List(2)
    PrimeFactors.of(3) shouldBe List(3)
    PrimeFactors.of(4) shouldBe List(2,2)
    PrimeFactors.of(6) shouldBe List(2,3)
    PrimeFactors.of(8) shouldBe List(2,2,2)
    PrimeFactors.of(9) shouldBe List(3,3)
    PrimeFactors.of(25) shouldBe List(5,5)
    PrimeFactors.of(49) shouldBe List(7,7)
    PrimeFactors.of(2*2*7*11*13*17*17) shouldBe List(2,2,7,11,13,17,17)

  }
}
