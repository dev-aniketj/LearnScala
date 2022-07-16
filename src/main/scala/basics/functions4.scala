package basics

object functions4 {
  def main(args: Array[String]): Unit = {

    //    Anonymous Functions : it doesn't have any func name and assign it value to the variable.

    val add = (x: Int, y: Int) => x + y
    println(add(10, 7))
    println(add(3, 7))
  }
}
