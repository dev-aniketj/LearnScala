package lists

object list1 {

  val list1: List[Int] = List(1, 2, 3, 5, 'A')
  var list2: List[String] = List("aniket", "ayush", "avi")

  def main(args: Array[String]): Unit = {

    //    Printing the lists
    println(list1)
    println(list2)

    //    List are immutable so be can't change/add it's value.
    //    list2 (2) = "chirag"

    //    But we can pre pend the list value at printing
    println("chirag" :: list2)


    //    we can also get the first and other values from the lists using head/tail
    println(list1.head) // 1
    println(list2.head) // aniket

    /**
     * tail is the remaining elements after removing the first/head element.
     * So, that's why the below lists printing the fully list except the first head element.
     */

    println(list1.tail) // 2, 3, 5, 65
    println(list2.tail) // ayush, avi

    //    using isEmpty we can check list is Empty or Not
    println(list1.isEmpty) // false

    //    using reverse method we can Reverse the given list.
    println(list1.reverse)
    println(list2.reverse)

    //    using fill method we can automatically create the list by passing the (no of elements)(value)
    println(List.fill(5)(2))
    println(List.fill(3)(1, 2, 3)) // creating 2D Array

    //    using max/min find the Maximum and Minimum element in the given list.
    println(list1.max)
    println(list1.min)

    println("------------------------------------------------------")
    //    print list using foreach()
    val list3 = List(1, 2, 3, 4, 5)
    list3.foreach(print)

    //    the SUM all the elements of list3
    var sum: Int = 0
    list3.foreach(sum += _)
    println(f"\nThe total SUM of list3 elements is $sum")

  }
}
