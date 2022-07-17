package arrays

import scala.Array._

object array1 {

  private val array1: Array[Int] = new Array[Int](5)
  private val array2 = new Array[Int](4)
  private val array3 = Array(2, 4, 6, 8, 10)

  def main(args: Array[String]): Unit = {
    //    Assign values in array1
    for (i <- array1.indices)
      array1(i) = (i + 1) * 10
    //      Printing values of array1
    for (i <- array1.indices)
      print(f"${array1(i)}\t")


    println()
    //    Printing values of array2
    for (i <- 0.until(array2.length)) //by default the value is 0 in each element.
      print(f"${array2(i)}\t")


    println()
    //    Printing values of array3
    for (i <- 0.to(array3.length - 1)) //by default the value is 0 in each element.
      print(f"${array3(i)}\t")

    println()
    val array4 = concat(array1, array3)
    //    Printing values of array4 (array1 + array3)
    for (i <- array4.indices)
      print(f"${array4(i)}\t")

  }
}
