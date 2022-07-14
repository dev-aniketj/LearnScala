package basics

// (+, -, *, /, %)

object AirthmeticOperators {
  def main(args: Array[String]): Unit = {
    val a: Int = 7
    val b = 3

    //    addition
    println(s"Addition is ${a + b}")
    //    subtraction
    println(s"Subtraction is ${a - b}")
    //    Multiplication
    println(s"Multiplication is ${a * b}")
    //    Division
    println(s"Division is ${a / b}")
    //    Remainder
    println(s"Remainder is ${a % b}")

  }
}
