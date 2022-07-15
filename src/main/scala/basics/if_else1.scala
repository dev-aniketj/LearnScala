package basics

object if_else1 {
  def main(args: Array[String]): Unit = {
    var x = 21

    //    1st way
    //    if (x == 20) {
    //      println("x is equal to 20.")
    //    } else {
    //      println("x not equal to 20.")
    //    }

    //    2nd way
    var res = ""
    if (x == 20) {
      res = "x is equal to 20."
    } else {
      res = "x is not equal to 20."
    }
    println(res)

    //    3rd way
    x = 20
    res = if (x == 20) "x is equal to 20." else "x is not equal to 20."
    println(res)

    //    4th way
    println(if (x == 20) "x is equal to 20." else "x is not equal to 20.")


  }
}
