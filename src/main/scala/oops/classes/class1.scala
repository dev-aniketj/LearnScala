package oops.classes

class StudentClass() {
  val name = "Aniket"
  val age = 22
}

object class1 {
  def main(args: Array[String]): Unit = {
    val student = new StudentClass()

    println(f"My name is ${student.name}.")
    println(f"My age is ${student.age}.")

  }
}