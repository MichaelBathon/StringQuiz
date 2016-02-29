package bathon.michael.stringquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecCountEs {

    CountEs emoney;
    String testString = "I never saw a purple cow";

    @Before
    public void setUp(){
        emoney = new CountEs();
    }

    @Test
    public void testLetterECounter(){
        int expected = 3;

        int actual = emoney.countNumberOfEsInString(testString);

        assertEquals("Fails if it doesn't accuratesly count the number of E's in the sentence", expected, actual);


    }




}
