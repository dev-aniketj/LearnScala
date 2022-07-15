package basics

import scala.io.StdIn


object match1 {
  def main(args: Array[String]): Unit = {
    print("Enter the day(1-7) : ")
    var x = StdIn.readInt()
    //    way1(x)
    println(way2(x))
  }

  private def way1(x: Int): Unit = {
    x match {
      case 1 => println("Sunday")
      case 2 => println("Monday")
      case 3 => println("Tuesday")
      case 4 => println("Wednesday")
      case 5 => println("Thursday")
      case 6 => println("Friday")
      case 7 => println("Saturday")
      case _ => println("Invalid input") //default case
    }
  }

  private def way2(a: Int): String = a match {
    case 1 => "Sunday"
    case 2 => "Monday"
    case 3 => "Tuesday"
    case 4 => "Wednesday"
    case 5 => "Thursday"
    case 6 => "Friday"
    case 7 => "Saturday"
    case _ => "Invalid input" //default case
  }

}
