import java.util.HashMap;
import java.util.Map;

public class FirstSwap {

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 0) {
                String key = String.valueOf(strings[i].charAt(0));

                if (map.containsKey(key)) {
                    int pos = map.get(key);

                    if (pos != -1) {
                        String temp = strings[i];
                        strings[i] = strings[pos];
                        strings[pos] = temp;

                        map.put(key, -1);
                    }
                } else {
                    map.put(key, i);
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        FirstSwap task = new FirstSwap();
        String[] input = {"ax", "bx", "ay", "by", "ai", "aj"};
        String[] result = task.firstSwap(input);

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
