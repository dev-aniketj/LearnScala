package basics

object for_loop1 {
  def main(args: Array[String]): Unit = {

    for (x <- 1 to 20) {
      print(s"$x  ")
    }

    println()
    for (i <- 1 until (10)) {
      print(s"$i  ")
    }

    //    for loop for List
    println()
    val list = List(1, 2, 5, 1, 3, 5, 3, 2, 6, 8, 4, 10)
    for (i <- list) {
      print(s"$i\t")
    }

    //    for loop with if condition
    println()
    for (i <- list; if (i <= 4)) {
      print(s"$i\t")
    }

    //    for loop for expression
    println('\n')
    val square = for {i <- 1 to 10 if i <= 5 if i > 1} yield {
      i * i
    }
    print(square)
    print("\nEnter the number : ")
    val num = scala.io.StdIn.readInt()
    val table = (for {j <- 1.to(10) if j <= num} yield {
      j * num
    }).toList
    print(table)


  }
}
