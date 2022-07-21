package oops.abstract_classes

abstract class Polygon {
  def area: Double
}

object Polygon {
  def main(args: Array[String]): Unit = {

    //    var poly = new Polygon
    //    the above line generate an compiler error, bcoz we can't create abstract class variable
    var rect = new Rectangle(2, 10)
    var tri = new Triangle(4, 5)

    printArea(rect)
    printArea(tri)

  }

  def printArea(p: Polygon): Unit = {
    println(p.area)
  }

}