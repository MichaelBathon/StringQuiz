package bathon.michael.stringquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecPalindrome {

    Palindrome pally;

    String sentence = "I never saw a purple cow";
    String palindrome = "rotavator";

    @Before
    public void setUp(){
        pally =  new Palindrome();
    }

    @Test
    public void testCheckIfPalindrome(){
        boolean expected1 = false;
        boolean actual1 = pally.checkIfStringIsPalindrome(sentence);

        boolean expected2 = true;
        boolean actual2 = pally.checkIfStringIsPalindrome(palindrome);

        assertEquals("Fails if it doesn't return the proper boolean if it is or is not a palindrome", expected1, actual1);

        assertEquals("Fails if it doesn't return the proper boolean if it is or is not a palindrome", expected2, actual2);
    }




}
