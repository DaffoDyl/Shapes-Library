import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals

class EllipseTest {
    @Test
    fun testEllipseConstruction() {
        val ellipse = Ellipse(Point(0.0,5.0), 5.0,10.0)
        assertEquals(0.0, ellipse.getCenter().getX())
        assertEquals(5.0, ellipse.getCenter().getY())
        assertEquals(5.0, ellipse.getRadius1())
        assertEquals(10.0, ellipse.getRadius2())
    }
    @Test
    fun testMove() {
        val ellipse = Ellipse(Point(0.0,5.0), 5.0,10.0)
        ellipse.move(10.0, -10.0)
        assertEquals(10.0, ellipse.getCenter().getX())
        assertEquals(-5.0, ellipse.getCenter().getY())
    }
    @Test
    fun testGetArea() {
        val ellipse = Ellipse(Point(0.0,5.0), 5.0,10.0)
        assertEquals(PI * 50, ellipse.getArea())
    }
}