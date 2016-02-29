package bathon.michael.stringquiz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecDashedString {

    DashedString dashie;
    String testString = "I never saw a purple cow";

    @Before
    public void setUp(){
        dashie =  new DashedString();
    }

    @Test
    public void testSpellItOut(){
        String expected = "I N-E-V-E-R S-A-W A P-U-R-P-L-E C-O-W";
        String actual = dashie.spellItOut(testString);

        assertEquals("Fails if it doesn't insert dashes between the letters of words", expected, actual);



    }





}
