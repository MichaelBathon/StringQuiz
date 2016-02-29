package bathon.michael.stringquiz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecChiperDecoder {

    CipherDecoder daVinci;
    String testString = "9 14,5,22,5,18 19,1,23 1 16,21,18,16,12,5 3,15,23";

    @Before
    public void setUp(){
        daVinci = new CipherDecoder();
    }

    @Test
    public void testDecoder(){

        String expected = "i never saw a purple cow";
        String actual = daVinci.decode(testString);

        assertEquals("Fails if it doesn't decode the cipher numbers into the string message", expected, actual);
    }


}
