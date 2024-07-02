class Ellipse(
    private var center : Point,
    private var radius1 : Double,
    private var radius2 : Double

): Shape {
    override fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
    fun getCenter(): Point { return center.copy() }
    fun getRadius1(): Double { return radius1 }
    fun getRadius2(): Double { return radius2 }
    fun getArea(center: Point, radius1: Double, radius2: Double): Double {
        //TODO
        return 0.0
    }
}