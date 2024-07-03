import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals

class CircleTest {
    @Test
    fun testCircleConstruction() {
        val circle = Circle(Point(0.0,5.0), 10.0)
        assertEquals(0.0, circle.getCenter().getX())
        assertEquals(5.0, circle.getCenter().getY())
        assertEquals(10.0, circle.getRadius1())
        assertEquals(10.0, circle.getRadius2())
    }
    @Test
    fun testMove() {
        val circle = Circle(Point(0.0,5.0), 10.0)
        circle.move(10.0, -10.0)
        assertEquals(10.0, circle.getCenter().getX())
        assertEquals(-5.0, circle.getCenter().getY())
    }
    @Test
    fun testGetArea() {
        val circle = Circle(Point(0.0,5.0), 10.0)
        assertEquals(PI * 100, circle.getArea())
    }
}