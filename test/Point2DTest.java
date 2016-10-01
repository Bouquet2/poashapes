import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Valentin on 01/10/2016.
 */
public class Point2DTest {
    @Test
    public void testTranslate() throws Exception {
        Point2D p = new Point2D(0,0);
        p.translate(5,-3);
        assertEquals(p.getX(), 5.0);
        assertEquals(p.getY(), -3.0);

        Point2D p2 = new Point2D(7,0);
        p2.translate(0,5);
        assertEquals(p2.getX(), 7.0);
        assertEquals(p2.getY(), 5.0);

        Point2D p3 = new Point2D(5,-3);
        p3.translate(0,0);
        assertEquals(p3.getX(), 5.0);
        assertEquals(p3.getY(), -3.0);
    }

    @Test
    public void testIsOrigin() throws Exception {
        Point2D p = new Point2D(0,0);
        assertTrue(p.isOrigin());
        Point2D p2 = new Point2D(5,0);
        assertFalse(p2.isOrigin());
        Point2D p3 = new Point2D(0,5);
        assertFalse(p3.isOrigin());
        Point2D p4 = new Point2D(-5,3);
        assertFalse(p4.isOrigin());
    }

    @Test
    public void testDistance() throws Exception {

    }

}