package bathon.michael.stringquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecSubCipher {

    SubCipher sypher;
    String testString = "Hello World";

    @Before
    public void setUp(){
        sypher = new SubCipher();
    }

    @Test
    public void testCipherBuilder(){

        String expected = "8,5,12,12,15 23,15,18,12,4";
        String actual = sypher.cipherBuilder(testString);

        assertEquals("Fails if it doesn't convert the string to a sequence of coeded numbers", expected, actual);


    }


}
