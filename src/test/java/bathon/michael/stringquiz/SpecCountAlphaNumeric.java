package bathon.michael.stringquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecCountAlphaNumeric {

    CountAlphaNumeric alphaNumCountObj;
    String testString = "1984 by George Orwell.";

    @Before
    public void setUp(){
        alphaNumCountObj = new CountAlphaNumeric();
    }

    @Test
    public void testAlphaNumCounter(){
        int expected = 18;
        int actual = alphaNumCountObj.countNumberOfAlphaNumeric(testString);

        assertEquals("Fails if it doesn't count only the alpah or num characters", expected, actual);


    }



}
