package bathon.michael.stringquiz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SpecPalindromePlus {

    PalindromePlus pallyPlusPlus;
    String testString = "I never saw a purple cow";
    String testString1 = "Rise to vote, Sir!";


    @Before
    public void setUp(){
        pallyPlusPlus = new PalindromePlus();
    }

    @Test
    public void testPalindromeMethodWithNonAlphaNums(){

        boolean expected1 = false;
        boolean actual1 = pallyPlusPlus.isItAPalindrome(testString);

        boolean expected2 = true;
        boolean actual2 = pallyPlusPlus.isItAPalindrome(testString1);


        assertEquals("Fails if it doesn't disregard the non-alphanumeric characters " +
                "to determine if the string is a palindrome or not", expected1, actual1);

        assertEquals("Fails if it doesn't disregard the non-alphanumeric characters " +
                "to determine if the string is a palindrome or not", expected2, actual2);


    }




}
