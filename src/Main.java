import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        map.put("D", 3);
        map.put("E", 2);
        map.put("F", 4);
        System.out.println(map);
        Map<Integer, String> pam = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (pam.containsKey(value)){
                pam.put(value, pam.get(value) + key);
            } else {
                pam.put(value, key);
            }
        }
        System.out.println(pam);
    }
}
