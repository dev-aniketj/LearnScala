package functions

object functions2 {
  def main(args: Array[String]): Unit = {
    println(Math add(7, 4))
    println(Math.add(7, 2))
    println(Math square 4)
    println(Math.square(5))
  }

  object Math {
    def add(x: Int, y: Int): Int = x + y

    def square(x: Int): Int = x * x
  }
}
