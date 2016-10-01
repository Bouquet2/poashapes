import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Valentin on 01/10/2016.
 */
public class CuboidTest {
    @Test
    public void testSurface() throws Exception {
        Cuboid c = new Cuboid(2,4,6);
        assertEquals(c.surface(), 88.0);

        Cuboid c2 = new Cuboid(0,0,0);
        assertEquals(c2.surface(), 0.0);

        Point3D p = new Point3D(5,9,15);
        Cuboid c3 = new Cuboid(p,4,6,8);
        assertEquals(c3.surface(), 208.0);

        Cuboid c4 = new Cuboid(4,7,9);
        assertNotEquals(c4.surface(), 94.025);
    }

    @Test
    public void testVolume() throws Exception {
        Cuboid c = new Cuboid(2,4,6);
        assertEquals(c.volume(), 88.0);

        Cuboid c2 = new Cuboid(0,0,0);
        assertEquals(c2.volume(), 0.0);

        Point3D p = new Point3D(5,9,15);
        Cuboid c3 = new Cuboid(p,4,6,8);
        assertEquals(c3.volume(), 208.0);

        Cuboid c4 = new Cuboid(4,7,9);
        assertNotEquals(c4.volume(), 94.025);
    }

}