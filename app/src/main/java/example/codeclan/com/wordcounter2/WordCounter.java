package example.codeclan.com.wordcounter2;

/**
 * Created by user on 18/04/2017.
 */

public class WordCounter {

    public String getWordCount (String sentence) {
        if(sentence.isEmpty())
            return "zero";

        int wordCount = 0;
        for(int i = 0; i < sentence.length(); i++ ){
            if(sentence.charAt(i) != ' ' ) {
                wordCount++;
                while(sentence.charAt(i) != ' ' && i < sentence.length() - 1 ){
                    i++;
                }
            }

        }
        return "The sentence has " + wordCount + " words";
    }

}
