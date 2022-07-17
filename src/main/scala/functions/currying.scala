package functions

/**
 * It is a technique of transforming a function that takes multiple arguments
 * into a function that takes a single argument.
 */

object currying {

  private def add(x: Int, y: Int): Int = x + y

  //  Currying Function
  private def add2(x: Int) = (y: Int) => x + y

  //  Simple Currying Function
  private def subtract(x: Int)(y: Int) = x - y

  def main(args: Array[String]): Unit = {

    println(add(20, 10))
    println(add2(20)(30))

    println("----------------------------------------------------")
    val sumWith50 = add2(50)
    println(sumWith50(20)) // here we are doing partially applied func tech also.

    println("----------------------------------------------------")
    println(subtract(50)(10))
    val subWith100 = subtract(100)(_)
    println(subWith100(25)) // here we are doing partially applied func tech also.

  }
}
