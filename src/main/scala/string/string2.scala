package string

// String Interpolation

object string2 {
  def main(args: Array[String]): Unit = {

    val num1: Int = 10
    val num2: Float = 10.2543f
    val str1: String = "Hello world"

    //    1st way
    printf("%d --- %.2f --- %s\n", num1, num2, str1)

    //    2nd way
    println("%d --- %.2f --- %s".format(num1, num2, str1))

    //    3rd way
    println(s"$num1 --- ${num2} --- $str1")

  }
}
