package basics

object while_loop {
  def main(args: Array[String]): Unit = {
    var x = 1

    while (x <= 10) {
      print(s"$x  ")
      x += 1
    }
  }
}
