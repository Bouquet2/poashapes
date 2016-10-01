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

    }

    @Test
    public void testLateralSurface() throws Exception {

    }

    @Test
    public void testSurface() throws Exception {

    }

}