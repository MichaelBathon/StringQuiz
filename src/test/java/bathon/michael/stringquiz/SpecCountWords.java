package bathon.michael.stringquiz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecCountWords {

    CountWords wordSmith;
    String testString = "I never saw a purple cow";

    @Before
    public void setUp(){
        wordSmith = new CountWords();
    }

    @Test
    public void testWordCountingMethod(){
        int expected = 6;
        int actual = wordSmith.countNumberOfWords(testString);

        assertEquals("Fails if it doesn't accurately count the number of words", expected, actual);
    }


}
