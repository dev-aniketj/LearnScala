package tuples

object tuple1 {
  val myTuple1 = (1, 2, "Hello", true)
  val myTuple2 = new Tuple3(1, 2, "Hello")
  val myTuple3 = new Tuple2(2, "Hello")

  def main(args: Array[String]): Unit = {
    println(myTuple2)
    println(myTuple1._1) //1
    println(myTuple1._2) //2
    println(myTuple1._3) //Hello
    println(myTuple1._4) //true

    println("------------------------------------------------")

    myTuple3.productIterator.foreach { i =>
      println(i)
    }

  }
}
