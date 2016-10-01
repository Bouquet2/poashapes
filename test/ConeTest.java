import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Valentin on 01/10/2016.
 */
public class ConeTest {
    @Test
    public void testDiameter() throws Exception {
        Cone c = new Cone(5,3);
        assertEquals(c.diameter(), 6.0);

        Cone c2 = new Cone(0,0);
        assertEquals(c2.diameter(), 0.0);

        Cone c3 = new Cone(15,8);
        assertNotEquals(c3.diameter(), 15.0);
    }

    @Test
    public void testVolume() throws Exception {
        Cone c = new Cone(10,3);
        assertEquals(c.volume(), 20.0);

        Cone c2 = new Cone(0,0);
        assertEquals(c2.volume(), 0.0);

        Cone c3 = new Cone(9,55);
        assertNotEquals(c3.volume(), 9.51);
    }

    @Test
    public void testLateralSurface() throws Exception {
        Cone c = new Cone(4,9);
        assertEquals(c.lateralSurface(), 113.09733552923255);

        Cone c2 = new Cone(0,0);
        assertEquals(c2.lateralSurface(), 0.0);

        Cone c3 = new Cone(7,4);
        assertNotEquals(c3.lateralSurface(), 45.0);
    }

    @Test
    public void testSurface() throws Exception {

    }

}