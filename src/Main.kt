fun main(args: Array<String>) {
    val list = arrayListOf(
        Rectangle(5.0, 2.0),
        Circle(2.0),
        Square(5.0),
        Triangle(5.0, 6.0, 7.0)
    )

    val areas = arrayListOf<Double>()
    val perimeters = arrayListOf<Double>()
    for (i in list) {
        areas.add(i.calcArea())
        perimeters.add(i.calcPerimeter())
    }

    println(
        "Минимальная площадь: ${minOf(areas.first(), areas.last())} \n" +
                "Максимальная площадь: ${maxOf(areas.first(), areas.last())} \n" +
                "Минимальная периметр: ${minOf(perimeters.first(), perimeters.last())} \n" +
                "Максимальная периметр: ${maxOf(perimeters.first(), perimeters.last())}"
    )

}