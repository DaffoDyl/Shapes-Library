class Point(
    private var x: Double,
    private var y: Double
) : Shape {

    override fun move(deltaX: Double, deltaY: Double) {
        x+=deltaX
        y+=deltaY
    }
    fun getX(): Double { return x }
    fun getY(): Double { return y }
    fun copy() : Point { return Point(x,y) }
}