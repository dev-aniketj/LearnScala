package oops.inheritance.example1

//Single Level

class Programmer(var salary: Double) extends Employee {
  def totalSalary(): Double = salary + (salary * bonus_percentage)
}

object Programmer {
  def main(args: Array[String]): Unit = {

    print("Please enter your salary : ")
    val salary = scala.io.StdIn.readInt()

    val sal_obj = new Programmer(salary)

    println(f"So your total Salary with Bonus is ${sal_obj.totalSalary()}")

  }
}