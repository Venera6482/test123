import com.sun.source.tree.AssertTree;
import org.example.Calculator;
import org.example.SomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class CalculatorTest {
   SoftAssert softAssert = new SoftAssert();
    @Test
    public void addTwoNumbersTest(){
        Assert.assertEquals(Calculator.add(2,2), 4);
        System.out.println("1");
        Assert.assertEquals(Calculator.add(2,2),3);
        System.out.println("2");
        Assert.assertEquals(Calculator.add(2,3), 5);
        System.out.println("3");
        Assert.assertEquals(Calculator.add(2,3), 5);
        System.out.println("4");
        Assert.assertEquals(Calculator.add(2,3), 5);
        System.out.println("5");
        Assert.assertEquals(Calculator.add(2,3), 5);
    }
    @Test
    public void testSoftAssert(){
        softAssert.assertEquals(Calculator.add(2,2), 4);
        softAssert.assertEquals(Calculator.add(2,2), 5);
        softAssert.assertEquals(Calculator.add(2,2), 6);
        softAssert.assertEquals(Calculator.add(2,2), 7);
        softAssert.assertEquals(Calculator.add(2,2), 8);
        softAssert.assertAll();
    }
    @Test
    public void testAssertTrue(){
        assertTrue(SomeClass.isFunny(true));
        assertFalse(false);
    }
    @Test
    public void test123(){
    Object obj = new Object();
    obj = null;
    assertNotNull(obj);
    }

    @Test
    public void test(){
        assertTrue(Calculator.sleepIn(true, false));
    }

}
