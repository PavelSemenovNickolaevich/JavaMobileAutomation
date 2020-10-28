import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MainClassTest extends MainClass {


    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Local number != 14!!!", getLocalNumber() == 14);
    }

}
