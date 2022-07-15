package basics


object Operators {

  def main(args: Array[String]): Unit = {
    //    arithmetic()
    //    assignment()
    //    relational()
    //    logical()
    bitwise()
  }


  def arithmetic(): Unit = {
    //    Arithmetic (+, -, /, *, %)
    val a: Int = 7
    val b = 3

    //    addition
    println(s"Addition is ${a + b}")
    //    subtraction
    println(s"Subtraction is ${a - b}")
    //    Multiplication
    println(s"Multiplication is ${a * b}")
    //    Division
    println(s"Division is ${a / b}")
    //    Remainder
    println(s"Remainder is ${a % b}")
  }

  def assignment(): Unit = {
    //    Assignment (=, +=, -=, /=, *=, %=)
    var x = 5
    x += 5
    println(x) //10
    x -= 2
    println(x) //8
    x *= 2
    println(x) //16
  }

  def relational(): Unit = {
    //    Relational (<, >, <=, >=, ==, !=)
    val x = 20
    val y = 15
    println(x == y)
    println(x != y)
    println(x < y)
    println(x > y)
  }

  def logical(): Unit = {
    //    Logical (&&, ||, !)
    var x: Int = 12
    val y = 23
    if (x > 10 && y % 2 == 1) {
      println("x is greater than 10, and y is not fully divisible by 2.")
    }

    val z: Boolean = true
    if (z) {
      println("z is true")
    }

    x = 65 //true
    val x1 = x.asInstanceOf[Char]
    println(x1)
    val x2 = x.asInstanceOf[Boolean] //error
    println(x2)
    if (x2) {
      println(s"Hello, $x1, $x")
    }
  }

  def bitwise(): Unit = {
    //    Bitwise ( &(AND), |(OR), ~(Not), ^(XOR) )
    val a = 7
    val b = 3

    println(a & b) // 11(3)
    println(a | b) //111(7)
    println(~a) //(8)
    println(a ^ b) //100(4)
  }
}
