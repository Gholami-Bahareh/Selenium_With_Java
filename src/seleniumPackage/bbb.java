package seleniumPackage;


import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;

public class bbb {


    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(result, 5, "Addition test failed!");
    }
}
