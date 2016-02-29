package bathon.michael.stringquiz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/12/16.
 */
public class SpecCipherAndDecode {

    SubCipher obsfucate;
    CipherDecoder decodeThatIsh;



    @Before
    public void setUp(){
        obsfucate = new SubCipher();
        decodeThatIsh = new CipherDecoder();
    }

    @Test
    public void testBuildCipherThenDecodeIt(){
        String testStringToCode = "eat, sleep, dream code";
        String testString = obsfucate.cipherBuilder(testStringToCode);


        String expected = "eat sleep dream code";
        String actual = decodeThatIsh.decode(testString);

        assertEquals("Fails if it doesn't decode the cipher numbers into the string message", expected, actual);


    }





}
