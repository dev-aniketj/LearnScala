package basics

object Variables2 {
  def main(args: Array[String]) {
    val name: String = "Aniket"
    val age: Int = 22

    // String Interpolation

    println(s"My name is $name " + s"My age is $age")
    println(f"My name is $name%s and my age is $age%d")

    println(s"Hello \nWorld")
    println(raw"Hello \nWorld")

  }
}
