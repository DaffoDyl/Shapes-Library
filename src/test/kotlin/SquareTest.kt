import kotlin.test.Test
import kotlin.test.assertEquals

class SquareTest {
    @Test
    fun testSquareConstruction() {
        val square = Square(Point(0.0, 5.0), 10.0)
        assertEquals(0.0, square.getLowestPoint().getX())
        assertEquals(5.0, square.getLowestPoint().getY())
        assertEquals(10.0, square.getXLength())
        assertEquals(10.0, square.getYLength())
    }
    @Test
    fun testMove() {
        val square = Square(Point(0.0, 5.0), 10.0)
        square.move(10.0,-10.0)
        assertEquals(10.0, square.getLowestPoint().getX())
        assertEquals(-5.0, square.getLowestPoint().getY())
    }
    @Test
    fun testGetArea() {
        val square = Square(Point(0.0, 5.0), 10.0)
        assertEquals(100.0, square.getArea())
    }
}