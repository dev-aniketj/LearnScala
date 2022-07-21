package oops.classes

/**
 * Classes - Auxiliary Constructor
 */

class Demo(var name: String, var age: Int) {
  def this() {
    this("Aniket", 22) //Default values.
  }

  def this(name: String) {
    this(name, 22)
  }
}

object class3 {
  def main(args: Array[String]): Unit = {

    val demo1 = new Demo("Ayush", 23)
    println(demo1.name)
    println(demo1.age)

    val demo2 = new Demo("Chirag")
    println(demo2.name)
    println(demo2.age)
  }

}
