package bathon.michael.stringquiz;

import java.util.ArrayList;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class SubCipher {

    String cipherBuilder(String secretSentence){
        String cipheredSequence = ""; //secretSentence.replaceAll("[a-zA-Z]", "");
        secretSentence = secretSentence.toLowerCase();

        for(int i = 0; i < secretSentence.length()-1; i++){
            char singleCipherElement = secretSentence.charAt(i);

            if(secretSentence.charAt(i) == ' '){
                cipheredSequence += " ";
            }
            if(Character.isLetterOrDigit(singleCipherElement)){
                cipheredSequence += (singleCipherElement -96);
                if(secretSentence.charAt(i +1) != ' '){
                    cipheredSequence += ",";
                }
            }
        }


        cipheredSequence += (secretSentence.charAt(secretSentence.length()-1) -96);
        return cipheredSequence;
    }


}
