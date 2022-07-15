package basics

object match2 {
  def main(args: Array[String]): Unit = {
    val x = 1
    println(search(x))
    println(search("two"))
  }

  private def search(a: Any): Any = a match {
    case 1 => "one"
    case "one" => 1
    case 2 => "two"
    case "two" => 2
  }
}
