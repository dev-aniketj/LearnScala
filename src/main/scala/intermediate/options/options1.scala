package intermediate.options

object options1 {

  val list = List(1, 2, 3, 4, 5)
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")

  def main(args: Array[String]): Unit = {

    println(list.find(_ > 2).get)
    println(map.get(2).get)

    //    when data is not exist
    println(map.get(10).getOrElse(f"No data found in $list"))
    println(map.getOrElse(11, f"No data found in $list"))

    println("------------------------------------------------")

    var opt: Option[Int] = None
    println(opt.isEmpty)
    opt = Some(20)
    println(opt.get)


  }
}
