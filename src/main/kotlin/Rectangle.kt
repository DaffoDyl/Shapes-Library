import kotlin.math.abs

class Rectangle(
    private var point1 : Point,
    private var point2 : Point
): Shape {
    override fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
    fun getPoint1(): Point { return point1.copy() }
    fun getPoint2(): Point { return point2.copy() }
    fun getArea(): Double {
        return abs(point2.getX() - point1.getX()) * abs(point2.getY() - point1.getY())
    }
}