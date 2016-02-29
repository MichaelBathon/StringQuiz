package bathon.michael.stringquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecReverseString {

    ReverseString backwards;
    String testString = "I never saw a purple cow";

    @Before
    public void setUp(){
        backwards = new ReverseString();
    }

    @Test
    public void testReverseStringMethod(){
        String expected = "woc elprup a was reven I";
        String actual = backwards.createReverseString(testString);

        assertEquals("Fails if it doesn't output the string in reverse", expected, actual);
    }

}
