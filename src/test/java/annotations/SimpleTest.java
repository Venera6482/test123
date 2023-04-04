package annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class SimpleTest {

    @Test
    public void demoTest1(){
        System.out.println("Demo test");
    }

    public void demoTest2(){
        System.out.println("Demo test2");
        Assert.assertEquals("100", "101");
    }
    @BeforeMethod
    public void demoBefore(){
        System.out.println("Demo before");
    }
    @AfterMethod
    public void demoAfter(){
        System.out.println("Demo after");
    }

    @BeforeClass
    public void demoBeforeClass(){
        System.out.println("Demo after class");
    }
    @BeforeTest
    public void demoBeforeTest(){
        System.out.println("Demo before test");
    }

    @AfterTest
    public void demoAfterTest(){
        System.out.println("Demo before test");
    }
    @AfterSuite
    public void demoAfterSuite(){
        System.out.println("Demo After Suite");
    }
    @BeforeSuite
    public void demoBeforeSuite(){
        System.out.println("Demo Before Suite");
    }
    @BeforeGroups(groups = "group")
    //работает если разделить на группы
    public void DemoBeforeGroup(){
        System.out.println("Demo Before Group");
    }

    @AfterGroups(groups = "groups")
    public void DemoAfterGroup(){
        System.out.println("Demo After Group");
    }


}
