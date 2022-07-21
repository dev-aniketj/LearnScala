package oops.inheritance.example2

class C extends B {

  def showA_data(): Unit = {
    println(f"A class is having : ${(new A).x}")
  }

  def showB_data(): Unit = {
    println(f"B class is having : ${(new B).x}, ${(new B).y}")
  }

  def sum(): Unit = {
    println(f"So the Sum of x + y : ${x + y}")
  }
}

object C {
  def main(args: Array[String]): Unit = {

    val c_obj = new C()

    c_obj.showA_data() //10
    c_obj.showB_data() // 10, 20
    c_obj.sum() //30

  }
}