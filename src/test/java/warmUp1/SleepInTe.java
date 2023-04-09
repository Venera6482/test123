package warmUp1;

import org.testng.Assert;
import org.testng.annotations.Test;
import warmUp.SleepIn;

public class SleepInTe {
    @Test
    public void holiday(){
        Assert.assertTrue(SleepIn.sleepIn(false,false));
    }
}
