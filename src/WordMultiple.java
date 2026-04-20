import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public Map<String, Boolean> checkWordMultiple(String[] inputWords) {
        Map<String, Boolean> multipleResults = new HashMap<>();

        for (String currentWord : inputWords) {
            if (!multipleResults.containsKey(currentWord)) {
                multipleResults.put(currentWord, false);
            } else {
                multipleResults.put(currentWord, true);
            }
        }

        return multipleResults;
    }

    public static void main(String[] args) {
        WordMultiple task = new WordMultiple();

        String[] exampleInput = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> finalMap = task.checkWordMultiple(exampleInput);

        System.out.println(finalMap);
    }
}