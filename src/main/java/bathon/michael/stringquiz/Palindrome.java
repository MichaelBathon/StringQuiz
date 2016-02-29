package bathon.michael.stringquiz;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class Palindrome {

    boolean checkIfStringIsPalindrome(String sentence){
        boolean isOrIsNotPalindrome = false;
        int j = sentence.length()-1;
        for(int i = 0; i < sentence.length()/2; i++, j--){
            if(sentence.charAt(i) == sentence.charAt(j)){
                isOrIsNotPalindrome = true;
            }
            else {
                isOrIsNotPalindrome = false;
                return isOrIsNotPalindrome;
            }
        }
      return isOrIsNotPalindrome;
    }
}
