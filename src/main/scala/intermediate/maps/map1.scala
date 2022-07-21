package intermediate.maps

/**
 * Map is the collection of key,value pairs.
 *
 * And it store unique elements and does not maintain any order for storing elements.
 */

object map1 {
  val myMap: Map[Int, String] = Map(
    95 -> "Aniket",
    96 -> "Chinmay",
    97 -> "Ayush",
    98 -> "Avi",
    99 -> "Nishank",
    95 -> "Aniket"
  )

  def main(args: Array[String]): Unit = {

    println(myMap)
    println(myMap(96))
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    println("\n--------------------------------")

    myMap.keys.foreach { key =>
      print(f"key : $key\t\t")
      println(f"value : ${myMap(key)}")
    }

    //    checking the value is present in MAP or NOT
    println(myMap.contains(90)) //false
    println(myMap.contains(98)) //true

  }
}
