import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class MainTest {
    @Test
    public  void testAdd() {
    Assert.assertEquals(8,Main.add(4,4))    ;
    }


}