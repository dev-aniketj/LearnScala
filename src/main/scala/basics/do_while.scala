package basics

object do_while {
  def main(args: Array[String]): Unit = {
    var x = 1
    do {
      print(s"$x  ")
      x += 1
    } while (x <= 10)
  }
}
