import kotlin.math.PI

open class Ellipse(
    private var center : Point,
    private var radius1 : Double,
    private var radius2 : Double = radius1

): Shape, Plain {
    override fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
    override fun getArea(): Double {
        return PI * radius1 * radius2
    }
    fun getCenter(): Point { return center.copy() }
    fun getRadius1(): Double { return radius1 }
    fun getRadius2(): Double { return radius2 }
}