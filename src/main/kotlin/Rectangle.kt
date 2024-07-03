import kotlin.math.abs

open class Rectangle(
    private var lowestPoint : Point,
    private var xLength : Double,
    private var yLength : Double = xLength,
): Shape {
    override fun move(deltaX: Double, deltaY: Double) {
        lowestPoint.move(deltaX, deltaY)
    }
    fun getLowestPoint(): Point { return lowestPoint.copy() }
    fun getXLength(): Double { return xLength }
    fun getYLength(): Double { return yLength }
    fun getArea(): Double {
        return abs(xLength * yLength)
    }
}