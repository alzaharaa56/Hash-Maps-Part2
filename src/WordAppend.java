import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String appendWords(String[] inputWords) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String result = "";

        for (String currentWord : inputWords) {
            int count = wordCounts.getOrDefault(currentWord, 0) + 1;
            wordCounts.put(currentWord, count);

            if (count % 2 == 0) {
                result = result + currentWord;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        WordAppend task = new WordAppend();

        String[] exampleInput = {"a", "b", "a", "c", "a", "d", "a"};
        String finalResult = task.appendWords(exampleInput);

        System.out.println(finalResult);
    }
}
