package oops.classes

// Class with Constructor

class Student(var name: String, var age: Int, var roll_no: Int) {

  def setData(name: String, age: Int, roll_no: Int): Unit = {
    this.name = name
    this.age = age
    this.roll_no = roll_no
  }

  def getData(): String = f"----------------------------------------------\nName : $name\tAge : $age\tRoll no : $roll_no\n"

}

object class2 {
  def main(args: Array[String]): Unit = {

    val stud1 = new Student("Aniket", 22, 101)
    val stud2 = new Student("Ayush", 21, 102)
    val stud3 = new Student("Chinmay", 24, 104)
    val stud4 = new Student("Chirag", 22, 110)

    println(stud1.getData())
    println(stud2.getData())
    println(stud3.getData())
    println(stud4.getData())

    //    We can also change the value of student object by using setData() method.
    stud1.setData("Aniket", 23, 95)
    println(stud1.getData())

  }
}
