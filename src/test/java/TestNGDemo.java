import org.example.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

        @Test
        public void createNewUserTest(){
            User firstUser = new User("John", 30);
            String result = firstUser.sayHi();
            Assert.assertEquals(result,"Hello from John");
        }
        @Test
        public void loginTest(){
            User firstUser = new User("John", 30);
            Assert.assertEquals(firstUser.login("Venera", "Charoit"), "Login");

        }
    }

