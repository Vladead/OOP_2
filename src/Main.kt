
fun main(args: Array<String>)
{
    val testRectangle = Rectangle(5.0, 2.0)
    val testCircle = Circle(2.0)

    println("Площадь круга: ${testCircle.calcArea()} \n" +
            "Периметр: ${testCircle.calcPerimeter()}")
    println("Площадь круга: ${testRectangle.calcArea()} \n" +
            "Периметр: ${testRectangle.calcPerimeter()}")
}