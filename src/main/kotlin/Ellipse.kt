import kotlin.math.PI

open class Ellipse(
    private var center : Point,
    private var radius1 : Double,
    private var radius2 : Double = radius1

): Shape {
    override fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
    fun getCenter(): Point { return center.copy() }
    fun getRadius1(): Double { return radius1 }
    fun getRadius2(): Double { return radius2 }
    fun getArea(): Double {
        return PI * radius1 * radius2
    }
}