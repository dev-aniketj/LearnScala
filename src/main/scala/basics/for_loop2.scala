package basics

object for_loop2 {
  def main(args: Array[String]): Unit = {
    rhombus_pattern(4)
  }

  def loop1(): Unit = {
    //    Multiple loops
    println()
    for (i <- 1 to 4; j <- 1.to(2)) {
      println(s"[$i, $j]")
    }
  }

  def pattern1(n: Int): Unit = {
    for (i <- 1.to(n); j <- 1 to i)
      if (i - j == 0) print("* \n") else print("* ")
  }

  def pattern2(n: Int): Unit = {
    for (i <- 1.to(n); j <- 1 to n)
      if (i + j <= n) print("  ") else if (j == n) println("* ") else print("* ")
  }

  def pattern3(n: Int): Unit = {
    for (i <- n.to(1) by -1; j <- 1.to(i))
      if (j == i) println("* ") else print("* ")
  }

  def pattern4(n: Int): Unit = {
    for (i <- n.to(1) by -1; j <- n.to(1) by -1)
      if (j == 1) println("* ") else if (j <= i) print("* ") else print("  ")
  }

  def rhombus_pattern(n: Int): Unit = {
    for (i <- 1.until(n * 2); j <- 1.until(n * 2))
      if (i <= n) {
        if (i + j > n && j - i < n)
          if (j - i == n - 1) println("* ")
          else print("* ")
        else if (j <= n) print("  ")
      }
      else {
        if (i - j <= n - 1 && i + j < (n * 3))
          if (i + j == (n * 3) - 1) println("* ")
          else print("* ")
        else if (j <= n) print("  ")
      }
  }

}
