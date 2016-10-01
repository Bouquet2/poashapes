import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Valentin on 01/10/2016.
 */
public class Point3DTest {
    @Test
    public void testTranslate() throws Exception {
        Point3D p = new Point3D(0,0,0);
        p.translate(5,-3,4);
        assertEquals(p.getX(), 5.0);
        assertEquals(p.getY(), -3.0);
        assertEquals(p.getZ(), 4);

        Point3D p2 = new Point3D(7,0,0);
        p2.translate(0,5,-5);
        assertEquals(p2.getX(), 7.0);
        assertEquals(p2.getY(), 5.0);
        assertEquals(p2.getZ(), -5.0);

        Point3D p3 = new Point3D(5,-3,10);
        p3.translate(0,0);
        assertEquals(p3.getX(), 5.0);
        assertEquals(p3.getY(), -3.0);
        assertEquals(p3.getZ(), 10.0);
    }

    @Test
    public void testIsOrigin() throws Exception {

    }

    @Test
    public void testDistance() throws Exception {

    }

}