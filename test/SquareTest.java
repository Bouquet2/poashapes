import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Valentin on 04/10/2016.
 */
public class SquareTest {

    @Test(expectedExceptions = RectangleException.class)
    public void testConstructor() throws Exception {
        Square s = new Square(5,10);
    }
}