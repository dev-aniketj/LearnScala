package basics

object Variables1 {
  def main(args: Array[String]) {
    var a = 10
    var b = 20
    val c = a + b
    print("Sum of a+b : " + c)

    a = 11
    b = 5
    print("Subtraction of a-b : " + (a - b))
  }
}
