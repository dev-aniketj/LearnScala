package basics

object match2 {
  def main(args: Array[String]): Unit = {
    val x = scala.io.StdIn.readInt()
    println(search(x))
    println(search("two"))
  }

  private def search(a: Any): Any = a match {
    case 1 => "one"
    case "one" => 1
    case 2 => "two"
    case "two" => 2
    case 3 => "three"
    case "three" => 3
    case 4 => "four"
    case "four" => 4
    case 5 => "five"
    case "five" => 5
    case _ => "Invalid input" //default case
  }
}
