import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Valentin on 01/10/2016.
 */
public class SphereTest {
    @Test
    public void testVolume() throws Exception {
        Sphere s = new Sphere(3);
        assertEquals(s.volume(), 113.09733552923255);

        Sphere s2 = new Sphere(0);
        assertEquals(s2.volume(), 0.0);

        Point3D p = new Point3D(5,9,15);
        Sphere s3 = new Sphere(p,4);
        assertEquals(s3.volume(), 268.082573106329);

        Sphere s4 = new Sphere(8);
        assertNotEquals(s2.volume(), 57.0);
    }

    @Test
    public void testSurface() throws Exception {
        Sphere s = new Sphere(6);
        assertEquals(s.surface(), 452.3893421169302);

        Sphere s2 = new Sphere(0);
        assertEquals(s2.surface(), 0.0);

        Point3D p = new Point3D(4,6,-2);
        Sphere s3 = new Sphere(p,2);
        assertEquals(s3.surface(), 50.26548245743669);

        Sphere s4 = new Sphere(7);
        assertNotEquals(s2.surface(), 48.265);
    }

}