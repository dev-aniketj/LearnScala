package oops.trait_classes

class C extends A with B {
  override def showA(): Unit = println("class A")

  /**
   * do not need to write the override when we use trait class
   *
   * it is an optional to write override
   */

  def showB(): Unit = println("class B")
}

object C {
  def main(args: Array[String]): Unit = {
    val c = new C()

    c.showA()
    c.showB()
    c.nameB()

  }
}
