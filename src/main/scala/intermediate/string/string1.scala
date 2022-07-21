package intermediate.string

/*
In Scala, the Strings are Immutable.
 */

// String Methods

object string1 {
  def main(args: Array[String]): Unit = {

    val str1 = "Hello"
    val str2 = " World"
    val str3 = "HELLO"
    val str4 = str1 + str2 + ", my name is aniket" //concatenation by using plus operator

    println(str1.length)
    println(str1.concat(str2))
    println(str1.charAt(1)) //e
    println(str1.equalsIgnoreCase(str3)) //true
    println(str1.equals(str3)) //false
    println(str1.compareToIgnoreCase(str3)) //true(0)
    println(str1.compareTo(str3)) //false(non zero value)
    println(str4)
    println(str3.substring(2)) //LLO
    println(str3.substring(0, 2)) //HE

  }
}
