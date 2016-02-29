package bathon.michael.stringquiz;

import java.util.ArrayList;
import java.util.regex.*;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class CipherDecoder {

    String decode(String cipher){
        String decodedCipher = "";
        String tempholder = "";
        String lastEleHolder = "";
        for(int i = 0; i < cipher.length()-1; i++){

            if(cipher.charAt(i) == ' '){
                decodedCipher += " ";
            }
            else if(Character.isDigit(cipher.charAt(i))){
                tempholder += cipher.charAt(i);
                if(cipher.charAt(i +1) == ' '){
                    decodedCipher += (char)(Integer.parseInt(tempholder)+96);
                    tempholder = "";
                }
            }
            else if(!(Character.isDigit(cipher.charAt(i))) && cipher.charAt(i) != ' '){
                decodedCipher += (char)(Integer.parseInt(tempholder)+96);
                tempholder = "";
            }

        }
        lastEleHolder = tempholder + Character.toString(cipher.charAt(cipher.length()-1));
        decodedCipher += (char)(Integer.parseInt(lastEleHolder)+96);
        return decodedCipher;
    }

}
