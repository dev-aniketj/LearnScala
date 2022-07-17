package functions

import java.util.Date

object partially_applied_func2 {
  def log(date: Date, msg: String): Unit = {
    println(s"$date \t\t $msg")
  }

  def main(args: Array[String]): Unit = {

    val date = new Date
    val newLogFunc = log(date, _: String)

    newLogFunc("1st message")
    newLogFunc("2nd message")
    newLogFunc("3rd message")
    newLogFunc("4th message")
    newLogFunc("5th message")

  }
}