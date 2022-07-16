package basics

object functions {
  def main(args: Array[String]): Unit = {
    sentence()
    sum(3, 7)
    println(s"My name is ${myName()}")
    println(s"The greatest number is ${greatestNumber(17, 13, 9)}")
  }

  //  no argument with no return type
  private def sentence(): Unit = {
    println("My name is Aniket.")
  }

  //  argument with no return type
  private def sum(n1: Int, n2: Int): Unit = {
    println(s"The addition of two numbers is ${n1 + n2}")
  }

  //  no argument with return type
  private def myName(): String = "Aniket"

  //  argument with return type
  private def greatestNumber(n1: Int, n2: Int, n3: Int) = {
    if (n1 > n2 && n1 > n3) n1
    else if (n2 > n3) n2
    else n3
  }
}
