package bathon.michael.stringquiz;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class CountWords {

    int countNumberOfWords(String sentence){
        int wordCount = 1;

        for(int i = 0; i < sentence.length()-1; i++) {
            String spaces = " ";
            if (sentence.substring(i, i+1).equals(spaces))
                wordCount++;

        }
        return wordCount;
    }


}
