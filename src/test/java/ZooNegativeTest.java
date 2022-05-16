import org.testng.Assert;
import org.testng.annotations.Test;
import zoo.fish.*;
import static org.testng.AssertJUnit.fail;

public class ZooNegativeTest {

    @Test(groups = "Negative test")
    public void checkMethodEatTest() {
        Pike pike = new Pike();
        pike.eat();
        Assert.assertEquals(pike.eat(), "Питается пряниками");
    }

    @Test(groups = "Negative test")
    public void checkMethodLiveTest() {
        Сatfish catfish = new Сatfish();
        catfish.live();
        Assert.assertNotEquals(catfish.live(), "Живёт на дне рек в ямах");
    }

    @Test(groups = "Negative test")
    public void collapseTest() {
        fail();
    }
}
