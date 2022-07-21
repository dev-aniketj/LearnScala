package maps

object map_and_filter {

  val list = List(2, 4, 6, 8, 10, 12)
  val myMap = Map(1 -> "tom", 2 -> "max", 3 -> "john", 4 -> "aniket", 5 -> "ayush")

  def main(args: Array[String]): Unit = {

    println(list.map(_ * 2))
    println(list.map(x => x * 2))

    println("------------------------------------------------")
    println(list.map(_ + 2))
    println(list.map(y => y + 2))

    println("------------------------------------------------")
    println(list.map(x => "hi" + x + " "))
    println(list.map(x => "hi" * x))

    println("------------------------------------------------")
    println(myMap.map(x => "hi" + x))
    println("hello".map(_.toUpper))

    println("------------------------------------------------")
    println(List(List(1, 2, 3), List(3, 'a', 4, 5)).flatten)
    println(list.flatMap(x => List(x, x + 1)))




  }
}
