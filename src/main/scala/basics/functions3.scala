package basics

object functions3 {
  def main(args: Array[String]): Unit = {
    println(add(1, 2, 3))
    println(add(4))
    println(add(6, 10, 2))
  }

  //  function with default parameter value
  def add(a: Int = 0, b: Int = 0, c: Int = 0, d: Int = 0, e: Int = 0): Int = a + b + c + d + e

}


