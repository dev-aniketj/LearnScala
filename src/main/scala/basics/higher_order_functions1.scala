package basics

object higher_order_functions1 {
  def main(args: Array[String]): Unit = {

    var result = math(3, 6, (x, y) => x min y)
    println(result)

    println()
    //    ( _ ) : wild card (it means do something with something)
    result = math(3, 6, _ min _)
    println(result)
    result = math(4, 9, _ max _)
    println(result)
    result = math(7, 12, _ + _)
    println(result)
    result = math(10, 5, _ * _)
    println(result)

  }

  def math(x: Double, y: Double, func: (Double, Double) => Double): Double = func(x, y)

}
