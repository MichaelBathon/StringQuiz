package bathon.michael.stringquiz;

/**
 * Created by michaelbathon on 2/11/16.
 */
public class Vowels {

    String replaceVowels(String sentence){
        String sequence = "";
        sequence = sentence.replaceAll("(?i)[aeiou]", "*");

        return sequence;
    }

}
