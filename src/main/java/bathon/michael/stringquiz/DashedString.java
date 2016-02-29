package bathon.michael.stringquiz;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class DashedString {

    String spellItOut(String sentence){
        String sequence = "";
        String upperSentence = sentence.toUpperCase();

        for(int i = 0; i < sentence.length()-1; i++){
            if(upperSentence.charAt(i) != ' '){
                if(upperSentence.charAt(i + 1) == ' '){
                    sequence += upperSentence.charAt(i) + " ";
                }
                else{
                    sequence += upperSentence.charAt(i) + "-";
                }
            }
        }
        sequence += upperSentence.charAt(sentence.length()-1);
        return sequence;
    }
}
