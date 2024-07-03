import kotlin.math.pow
import kotlin.math.sqrt

class Line(
    private var point1 : Point,
    private var point2 : Point
): Shape {
    override fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
    fun getPoint1(): Point { return point1.copy() }
    fun getPoint2(): Point { return point2.copy() }
    fun getSlope() : Double {
        return (point2.getY() - point1.getY())/(point2.getX() - point1.getX())
    }
    fun getLength() : Double {
        return sqrt((point2.getX() - point1.getX()).pow(2) + (point2.getY() - point1.getY()).pow(2))
    }
}