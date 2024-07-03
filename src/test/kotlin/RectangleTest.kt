import kotlin.test.Test
import kotlin.test.assertEquals

class RectangleTest {
    @Test
    fun testRectangleConstruction() {
        val rectangle = Rectangle(Point(0.0, 5.0), Point(10.0, 15.0))
        assertEquals(0.0, rectangle.getPoint1().getX())
        assertEquals(5.0, rectangle.getPoint1().getY())
        assertEquals(10.0, rectangle.getPoint2().getX())
        assertEquals(15.0, rectangle.getPoint2().getY())
    }
    @Test
    fun testMove() {
        val rectangle = Rectangle(Point(0.0, 5.0), Point(10.0, 15.0))
        rectangle.move(10.0,-10.0)
        assertEquals(10.0, rectangle.getPoint1().getX())
        assertEquals(-5.0, rectangle.getPoint1().getY())
        assertEquals(20.0, rectangle.getPoint2().getX())
        assertEquals(5.0, rectangle.getPoint2().getY())
    }
    @Test
    fun testGetArea() {
        val rectangle = Rectangle(Point(0.0, 0.0), Point(10.0, -20.0))
        assertEquals(200.0, rectangle.getArea())
    }
}