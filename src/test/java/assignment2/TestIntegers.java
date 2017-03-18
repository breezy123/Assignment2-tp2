package assignment2;

/**
 * Created by aubrey on 17/03/2017.
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class TestIntegers extends TestCase {

    Integers subtract = new Integers();

    //@Test
    public void testSubtraction() throws Exception{

        int intVal = subtract.subIntegers(20,5);
        Assert.assertEquals(15,intVal);
    }
}
