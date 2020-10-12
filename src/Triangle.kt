import java.lang.IllegalArgumentException
import kotlin.math.sqrt

class Triangle(private val a: Double, private val b: Double, private val c: Double) : Shape {
    init {
        if (a + b < c || a + c < b || b + c < a)
            throw IllegalArgumentException("Nonexistent triangle")
    }

    override fun calcArea(): Double {
        val p = calcPerimeter() / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }

    override fun calcPerimeter(): Double {
        return a + b + c
    }
}