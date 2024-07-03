import kotlin.test.Test
import kotlin.test.assertEquals

class LineTest {
    @Test
    fun testLineConstruction() {
        val line = Line(Point(0.0, 1.0), Point(5.0, 10.0))
        assertEquals(0.0, line.getPoint1().getX())
        assertEquals(1.0, line.getPoint1().getY())
        assertEquals(5.0, line.getPoint2().getX())
        assertEquals(10.0, line.getPoint2().getY())
    }
    @Test
    fun testMove() {
        val line = Line(Point(0.0, 1.0), Point(5.0, 10.0))
        line.move(10.0, -10.0)
        assertEquals(10.0, line.getPoint1().getX())
        assertEquals(-9.0, line.getPoint1().getY())
        assertEquals(15.0, line.getPoint2().getX())
        assertEquals(0.0, line.getPoint2().getY())
    }
    @Test
    fun testGetSlope() {
        val positiveLine = Line(Point(0.0, 0.0), Point(5.0, 10.0))
        val negativeLine = Line(Point(0.0, 0.0), Point(-5.0, -10.0))
        val positiveXLine = Line(Point(0.0, 0.0), Point(5.0, -10.0))
        val negativeXLine = Line(Point(0.0, 0.0), Point(-5.0, 10.0))
        assertEquals(2.0, positiveLine.getSlope())
        assertEquals(2.0, negativeLine.getSlope())
        assertEquals(-2.0, positiveXLine.getSlope())
        assertEquals(-2.0, negativeXLine.getSlope())
    }
    @Test
    fun testGetLength() {
        val positiveLine = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        val negativeLine = Line(Point(0.0, 0.0), Point(-3.0, -4.0))
        assertEquals(5.0, positiveLine.getLength())
        assertEquals(5.0, negativeLine.getLength())
    }
}