import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> countWords(String[] inputWords) {
        Map<String, Integer> wordCountResults = new HashMap<>();

        for (String currentWord : inputWords) {
            if (!wordCountResults.containsKey(currentWord)) {
                wordCountResults.put(currentWord, 1);
            } else {
                int currentCount = wordCountResults.get(currentWord);
                wordCountResults.put(currentWord, currentCount + 1);
            }
        }

        return wordCountResults;
    }

    public static void main(String[] args) {
        WordCount task = new WordCount();

        String[] exampleInput = {"a", "b", "a", "c", "b"};
        Map<String, Integer> finalMap = task.countWords(exampleInput);

        System.out.println(finalMap);
    }
}
