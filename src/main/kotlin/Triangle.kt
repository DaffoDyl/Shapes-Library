import kotlin.math.abs

class Triangle(
    private var point1 : Point,
    private var point2 : Point,
    private var point3 : Point,
): Shape, Plain {
    override fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
        point3.move(deltaX, deltaY)
    }
    override fun getArea(): Double {
        return 0.5 * abs((point1.getX() * (point2.getY() - point3.getY()))
        + (point2.getX() * (point3.getY() - point1.getY()))
        + (point3.getX() * (point1.getY() - point2.getY())))
    }
    fun getPoint1(): Point { return point1.copy() }
    fun getPoint2(): Point { return point2.copy() }
    fun getPoint3(): Point { return point3.copy() }
}