import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testPointConstruction() {
        val point = Point(25.0,-10.0)
        assertEquals(25.0, point.getX())
        assertEquals(-10.0, point.getY())
    }
    @Test
    fun testMove() {
        val point = Point(25.0,-10.0)
        point.move(25.0, -10.0)
        assertEquals(50.0, point.getX())
        assertEquals(-20.0, point.getY())
    }
    @Test
    fun testCopy() {
        val point = Point(25.0,-10.0)
        val copy = point.copy()
        assertEquals(25.0, copy.getX())
        assertEquals(-10.0, copy.getY())

    }
}