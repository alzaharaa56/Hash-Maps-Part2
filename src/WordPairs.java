import java.util.HashMap;
import java.util.Map;

public class WordPairs {
    public Map<String, String> createWordPairsMap(String[] inputWords) {
        Map<String, String> pairResults = new HashMap<>();

        for (String currentWord : inputWords) {
            if (!currentWord.isEmpty()) {
                String firstChar = String.valueOf(currentWord.charAt(0));
                String lastChar = String.valueOf(currentWord.charAt(currentWord.length() - 1));

                pairResults.put(firstChar, lastChar);
            }
        }

        return pairResults;
    }

    public static void main(String[] args) {
        WordPairs task = new WordPairs();

        String[] exampleInput = {"man", "moon", "main", "good", "night"};
        Map<String, String> finalMap = task.createWordPairsMap(exampleInput);

        System.out.println(finalMap);
    }
}
