class Circle(
    private var center : Point,
    private var radius : Double
): Shape {
    override fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
    fun getCenter(): Point { return center.copy() }
    fun getRadius(): Double { return radius }
    fun getArea(center: Point, radius: Double): Double {
        //TODO
        return 0.0
    }
}