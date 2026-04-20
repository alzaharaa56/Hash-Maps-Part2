import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> groupFirstChar(String[] inputWords) {
        Map<String, String> groupResults = new HashMap<>();

        for (String currentWord : inputWords) {
            String firstChar = String.valueOf(currentWord.charAt(0));

            if (!groupResults.containsKey(firstChar)) {
                groupResults.put(firstChar, currentWord);
            } else {
                String existingString = groupResults.get(firstChar);
                groupResults.put(firstChar, existingString + currentWord);
            }
        }

        return groupResults;
    }

    public static void main(String[] args) {
        FirstChar task = new FirstChar();

        String[] exampleInput = {"salt", "tea", "soda", "toast"};
        Map<String, String> finalMap = task.groupFirstChar(exampleInput);

        System.out.println(finalMap);
    }
}
