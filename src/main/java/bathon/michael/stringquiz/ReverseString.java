package bathon.michael.stringquiz;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class ReverseString {

    String createReverseString(String sentence){
        String sequence = "";
        for(int i = sentence.length() -1; i >=0; i--){
            sequence += Character.toString(sentence.charAt(i));
        }
        return sequence;
    }
}
