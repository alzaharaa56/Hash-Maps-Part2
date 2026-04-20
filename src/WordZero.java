import java.util.HashMap;
import java.util.Map;

public class WordZero {

    public Map<String, Integer> createWordZeroMap(String[] inputWords) {
        Map<String, Integer> wordResults = new HashMap<>();

        for (String currentWord : inputWords) {
            wordResults.put(currentWord, 0);
        }

        return wordResults;
    }

    public static void main(String[] args) {
        WordZero task = new WordZero();

        String[] exampleInput = {"a", "b", "a", "c", "b"};
        Map<String, Integer> finalMap = task.createWordZeroMap(exampleInput);

        System.out.println(finalMap);
    }
}
