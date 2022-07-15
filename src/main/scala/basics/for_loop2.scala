package basics

object for_loop2 {
  def main(args: Array[String]): Unit = {
    //    loop1()
    pattern1(5)
  }

  def loop1(): Unit = {
    //    Multiple loops
    println()
    for (i <- 1 to 4; j <- 1.to(2)) {
      println(s"[$i, $j]")
    }
  }

  def pattern1(n: Int): Unit = {
    for (i <- 1.to(5); j <- 1 to (i))
      if (i - j == 0) print("* \n") else print("* ")
  }
}
