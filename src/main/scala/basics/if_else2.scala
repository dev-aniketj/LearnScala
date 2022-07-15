package basics

import scala.io.StdIn

object if_else2 {
  def main(args: Array[String]) {
    print("Enter the value of x : ")
    val x = StdIn.readInt()
    print("Enter the value of y : ")
    val y = StdIn.readInt()
    print("Enter the value of z : ")
    val z = StdIn.readInt()

    if (x > y && x > z) {
      println(s"$x is greater than $y, $z.")
    } else if (y > z) {
      println(s"$y is greater than $x, $z.")
    } else {
      println(s"$z is greater than $x, $y.")
    }
  }
}
