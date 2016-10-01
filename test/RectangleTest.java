import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Valentin on 01/10/2016.
 */
public class RectangleTest {
    @Test
    public void testPerimeter() throws Exception {
        Rectangle r = new Rectangle(10,5);
        assertEquals(r.perimeter(), 30.0);

        Rectangle r2 = new Rectangle(0,0);
        assertEquals(r2.perimeter(), 0.0);

        Point2D p = new Point2D(5,10);
        Rectangle r3 = new Rectangle(3,7);
        assertEquals(r3.perimeter(), 20.0);
    }

    @Test
    public void testSurface() throws Exception {

    }

}