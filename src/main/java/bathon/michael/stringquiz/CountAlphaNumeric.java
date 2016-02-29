package bathon.michael.stringquiz;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class CountAlphaNumeric {

    int countNumberOfAlphaNumeric(String sentence){
        int alphaNumCounter = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(Character.isLetterOrDigit(sentence.charAt(i))){
                alphaNumCounter++;
            }
        }

        return alphaNumCounter;
    }

}
