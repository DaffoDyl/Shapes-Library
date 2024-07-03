import kotlin.test.Test
import kotlin.test.assertEquals

class RectangleTest {
    @Test
    fun testRectangleConstruction() {
        val rectangle = Rectangle(Point(0.0, 5.0), 10.0, 20.0)
        assertEquals(0.0, rectangle.getLowestPoint().getX())
        assertEquals(5.0, rectangle.getLowestPoint().getY())
        assertEquals(10.0, rectangle.getXLength())
        assertEquals(20.0, rectangle.getYLength())
    }
    @Test
    fun testMove() {
        val rectangle = Rectangle(Point(0.0, 5.0), 10.0, 20.0)
        rectangle.move(10.0,-10.0)
        assertEquals(10.0, rectangle.getLowestPoint().getX())
        assertEquals(-5.0, rectangle.getLowestPoint().getY())
    }
    @Test
    fun testGetArea() {
        val rectangle = Rectangle(Point(0.0, 5.0), 10.0, 20.0)
        assertEquals(200.0, rectangle.getArea())
    }
}