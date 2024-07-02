class Point(
    private var x: Double,
    private var y: Double
) : Shape {
    override fun move(deltaX: Double, deltaY: Double) {
        x+=deltaX
        y+=deltaX
    }
    fun getX(): Double { return x }
    fun getY(): Double { return y }
    fun clone() : Point { return Point(x,y) }
}