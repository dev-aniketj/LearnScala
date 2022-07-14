package basics

object Variables1 {
  def main(args: Array[String]) {
    var a = 10
    var b = 20
    val sum = a + b
    println("Sum of (a + b) : " + sum)

    a = 11
    b = 5
    println("Subtraction of (a - b) : " + (a - b))

  }
}
