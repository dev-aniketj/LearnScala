package intermediate.sets

/**
 * It is used to store unique elements and does not maintain any order for storing elements.
 *
 * By default, all sets are IMMUTABLE
 */


object set1 {
  def main(args: Array[String]): Unit = {
    val s1: Set[Int] = Set(1, 3, 2, 3, 4, 5, 4, 5)

    //  s2 is the MUTABLE Set.
    val s2: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1, 5, 2, 3, 4, 1, 4)

    println(s1)
    println(s2)

    println(s1 + 10)

    //    check 5 is present or not
    println(s1(5)) //true
    //    check 6 is present or not
    println(s1(6)) //false
    //    head - for getting the first ele, tail - for getting the remaining elements.
    println(s1.head)
    println(s1.tail)
    println(s1.isEmpty) //for checking the set is Empty or Not


    val s3: Set[Int] = Set(1, 3, 5, 7, 9)
    val s4: Set[Int] = Set(2, 4, 6, 9, 8)

    println(s3.union(s4))
    println(s3 ++ s4) // ++ is know as UNION

    println(s3.intersect(s4))
    println(s3.&(s4)) // INTERSECTION

    //    for getting max/min element from the set.
    println(s3.max)
    println(s3.min)

    //    Set with loops
    s3.foreach(print)

    println()
    for (value <- s3) {
      print(f"$value\t")
    }


  }
}
