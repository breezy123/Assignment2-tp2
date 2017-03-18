package assignment2;

/**
 * Created by aubrey on 18/03/2017.
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
public class TestFloatings extends TestCase {

    Floatings floatValues = new Floatings();
    public void testFloatAdd() throws Exception{

        float var = floatValues.floatAdded(6.0f,7.3f);

        Assert.assertEquals(13.300000190734863,var,0.0);
    }
}
