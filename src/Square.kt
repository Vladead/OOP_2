class Square(private val a: Double) : Shape {
    override fun calcArea(): Double {
        return a * a
    }

    override fun calcPerimeter(): Double {
        return 4 * a
    }
}