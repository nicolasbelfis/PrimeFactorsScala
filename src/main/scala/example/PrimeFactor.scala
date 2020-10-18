package example

object PrimeFactors {

  def of(number: Int): List[Int] = {
    if(number > 1) {
      divide(number,2)
    } else List()
  }

  private def divide(number: Int, divisor : Int): List[Int] = {
    if (number % divisor == 0) divisor :: of(number / divisor)
    else divide(number,divisor+1)
  }
}
