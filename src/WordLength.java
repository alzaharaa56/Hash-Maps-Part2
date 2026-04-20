import java.util.HashMap;
import java.util.Map;

public class WordLength {

    public Map<String, Integer> createWordLengthMap(String[] inputWords) {
        Map<String, Integer> wordLengthResults = new HashMap<>();

        for (String currentWord : inputWords) {
            wordLengthResults.put(currentWord, currentWord.length());
        }

        return wordLengthResults;
    }

    public static void main(String[] args) {
        WordLength task = new WordLength();

        String[] exampleInput = {"this", "and", "that", "and"};
        Map<String, Integer> finalMap = task.createWordLengthMap(exampleInput);

        System.out.println(finalMap);
    }
}
