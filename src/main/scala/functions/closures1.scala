package functions

/**
 * A closure is a function which uses one or more
 * variables declared outside the function.
 */

object closures1 {
  /**
   * So it is know as Impure Closure, because we can change the value of number.
   */
  var number = 10 // free variable
  val add = (x: Int) => x + number

  /**
   * So it is know as Pure Closure, because we can't change the value of num2.
   */
  val num2 = 2
  val mul = (x: Int) => x * num2

  def main(args: Array[String]): Unit = {

    println(add(10))
    number = 5
    println(add(10))

    println("------------------------------------------------------")

    println(mul(5))


    //    It is gives an error bcoz we define num2 as val(const) variable
    //    num2=3
    println(mul(10))

  }
}
