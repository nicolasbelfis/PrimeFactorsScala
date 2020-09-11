package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PrimeFactorSpec extends AnyFlatSpec with Matchers {
  "The Prime factor object" should "return a list of prime factors" in {
    PrimeFactor.of(1) shouldBe List()
  }
}
