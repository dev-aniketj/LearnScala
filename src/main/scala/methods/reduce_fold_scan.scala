package methods

/**
 * Scala - reduce, fold, scan (left/right)
 *
 * reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
 */

object reduce_fold_scan {

  val list1 = List(1, 2, 3, 4, 5)
  val list2 = List("A", "B", "C")

  def main(args: Array[String]): Unit = {

    println("\n----------------------- REDUCE -------------------------")
    println(list1.reduceLeft(_ - _))
    println(list1.reduceLeft(_ + _))
    println(list1.reduceLeft(_ * _))
    println(list2.reduceLeft(_ + _))

    println("------------------------------------------------")

    println(list1.reduceLeft((x, y) => {
      println(x + y)
      x + y
    }))

    println("------------------------------------------------")

    println(list1.reduceRight(_ - _))

    println("\n----------------------- FOLD -------------------------")
    println(list1.foldLeft(10)(_ + _)) //10+1+2+3+4+5 = 25
    println(list2.foldLeft("Z ")(_ + _)) //Z+A+B+C = Z ABC

    println("\n----------------------- SCAN -------------------------")
    println(list1.scanLeft(100)(_ + _))
    println(list2.scanLeft("x")(_ + _))

  }
}
