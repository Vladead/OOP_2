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
        "Минимальная площадь: ${areas.minOrNull()} \n" +
                "Максимальная площадь: ${areas.maxOrNull()} \n" +
                "Минимальный периметр: ${perimeters.minOrNull()} \n" +
                "Максимальный периметр: ${perimeters.maxOrNull()} \n" +
                "Сумма площадей: ${list.sumByDouble { it -> it.calcArea() }}"
    )

}