package basics

import scala.util.control.Breaks._

object match3 extends Exception {
  def main(args: Array[String]): Unit = {
    //    Check Even or Odd
    var num = 0

    breakable {
      while (true) {
        print("Enter the number between (1-10) : ")
        num = scala.io.StdIn.readInt()
        num match {
          case 1 | 3 | 5 | 7 | 9 => println(f"$num is Odd number.")
          case 2 | 4 | 6 | 8 | 10 => println(f"$num is Even number.")
          case -1 => break
          case _ => println("Invalid Input.")
        }
      }
    }

    println("While loop is terminated.")

  }
}
