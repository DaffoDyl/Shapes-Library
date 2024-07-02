class Square(
    private var point1 : Point,
    private var point2 : Point
): Shape {
    override fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
    fun getPoint1(): Point { return point1.copy() }
    fun getPoint2(): Point { return point2.copy() }
    fun getArea(point1: Point): Double {
        //TODO
        return 0.0
    }
}