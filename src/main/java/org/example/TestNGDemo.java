package org.example;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void createNewUserTest(){
        User firstUser = new User("John", 30);
        Assert.assertNotNull(FirstUser);
    }
    @Test
    public void loginTest(){

    }
}
