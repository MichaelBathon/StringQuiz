package bathon.michael.stringquiz;

import java.util.ArrayList;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class PalindromePlus {

    boolean isItAPalindrome(String sentence){
        boolean palindromeOrNot = false;
        ArrayList<Character> palindromeList = new ArrayList<Character>();
        String lowerSentence = sentence.toLowerCase();

        for(int i = 0; i < sentence.length(); i++){
            if(Character.isLetterOrDigit(lowerSentence.charAt(i))){
                palindromeList.add(lowerSentence.charAt(i));
            }
        }

        for(int j = 0, k = palindromeList.size()-1; j < palindromeList.size()/2; j++, k--){
            if(palindromeList.get(j) == palindromeList.get(k)){
                palindromeOrNot = true;
            }
            else{
                palindromeOrNot = false;
                return palindromeOrNot;
            }
        }
        return palindromeOrNot;
    }
}
