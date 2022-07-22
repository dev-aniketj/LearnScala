package oops.lazy_eval

object lazy2 {

  def method1(n: Int): Unit = {
    println("Method 1")
    println(n)
  }

  def method2(n: => Int): Unit = {
    println("Method 2")
    println(n)
  }

  def main(args: Array[String]): Unit = {

    val add = (a: Int, b: Int) => {
      println("Add")
      a + b
    }

    method1(add(4, 3))
    println("------------------------------------------------")
    method2(add(4, 5))

  }
}
