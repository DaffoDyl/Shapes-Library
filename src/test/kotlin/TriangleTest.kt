import kotlin.test.Test
import kotlin.test.assertEquals

class TriangleTest {
    @Test
    fun testTriangleConstruction() {
        val triangle = Triangle(Point(0.0, 1.0), Point(3.0, 1.0), Point(3.0, 5.0))
        assertEquals(0.0, triangle.getPoint1().getX())
        assertEquals(1.0, triangle.getPoint1().getY())
        assertEquals(3.0, triangle.getPoint2().getX())
        assertEquals(1.0, triangle.getPoint2().getY())
        assertEquals(3.0, triangle.getPoint3().getX())
        assertEquals(5.0, triangle.getPoint3().getY())
    }
    @Test
    fun testMove() {
        val triangle = Triangle(Point(0.0, 1.0), Point(3.0, 1.0), Point(3.0, 5.0))
        triangle.move(10.0, -10.0)
        assertEquals(10.0, triangle.getPoint1().getX())
        assertEquals(-9.0, triangle.getPoint1().getY())
        assertEquals(13.0, triangle.getPoint2().getX())
        assertEquals(-9.0, triangle.getPoint2().getY())
        assertEquals(13.0, triangle.getPoint3().getX())
        assertEquals(-5.0, triangle.getPoint3().getY())
    }
    @Test
    fun testGetArea() {
        val triangle = Triangle(Point(0.0, 1.0), Point(3.0, 1.0), Point(3.0, 5.0))
        assertEquals(6.0, triangle.getArea())
    }
}