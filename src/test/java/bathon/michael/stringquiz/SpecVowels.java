package bathon.michael.stringquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecVowels {

    Vowels andSometimesY;
    String testString = "I never saw a purple cow";

    @Before
    public void setUp(){
        andSometimesY = new Vowels();
    }

    @Test
    public void testVowelReplacement(){
        String expected = "* n*v*r s*w * p*rpl* c*w";
        String actual = andSometimesY.replaceVowels(testString);

        assertEquals("Fails if it doesn't replace the vowels with an *", expected, actual);
    }
}
