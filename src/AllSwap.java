import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 0) {
                String key = String.valueOf(strings[i].charAt(0));

                if (map.containsKey(key)) {
                    int pos = map.get(key);

                    String temp = strings[i];
                    strings[i] = strings[pos];
                    strings[pos] = temp;

                    map.remove(key);
                } else {
                    map.put(key, i);
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        AllSwap task = new AllSwap();
        String[] input = {"ax", "bx", "ay", "by", "ai", "aj"};
        String[] result = task.allSwap(input);

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
