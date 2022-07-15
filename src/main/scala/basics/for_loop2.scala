package basics

object for_loop2 {
  def main(args: Array[String]): Unit = {
    loop1()

  }

  def loop1(): Unit = {
    //    Multiple loops
    println()
    for (i <- 1 to 4; j <- 1.to(2)) {
      println(s"[$i, $j]")
    }
  }
}
