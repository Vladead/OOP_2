import java.lang.IllegalArgumentException
import kotlin.math.sqrt

class Triangle(val a: Double, val b: Double, val c: Double) : Shape {
    init {
        if (a + b > c || a + c > b || b + c > a)
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