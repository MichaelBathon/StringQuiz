package bathon.michael.stringquiz;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class CountEs {


    int countNumberOfEsInString(String sentence){
        int eCounter = 0;
        char findEs = 'e';
        sentence.toLowerCase();

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == findEs){
                eCounter++;
            }
        }
        return eCounter;
    }

}
