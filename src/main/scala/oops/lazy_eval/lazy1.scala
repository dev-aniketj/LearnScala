package oops.lazy_eval

/**
 * Scala - Lazy Evaluation
 */
class Strict {
  val e = {
    println("Strict Class")
    9
  }
}

class LazyEval {
  lazy val l = {
    println("Lazy Class")
    10
  }
}

object lazy1 {
  def main(args: Array[String]): Unit = {
    val x = new Strict
    val y = new LazyEval

    println(x.e)
    println(y.l)  // the var l is only creates when we call LazyEval class.
  }
}
