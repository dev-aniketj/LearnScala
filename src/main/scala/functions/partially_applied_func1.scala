package functions

object partially_applied_func1 {
  def main(args: Array[String]): Unit = {

    val sum = (a: Int, b: Int, c: Int) => a + b + c

    val f = sum(10, 20, _ : Int)

    println(f(30))
    println(f(100))

  }
}
