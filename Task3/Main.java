package Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        System.out.println(isUnique(map)); // true

        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");

        System.out.println(isUnique(map)); // true

        map.put("Виктор", "Иванов");
        map.put("Вадим", "Петров");

        System.out.println(isUnique(map)); // false
    }

    public static boolean isUnique(Map<String, String> map) {
        if (map.isEmpty()) {
            return true;
        }
        List<String> valueList = new ArrayList<>(map.values());
        valueList.addAll(map.keySet());

        Set<String> valueSet = new HashSet<>();

        for (String value : valueList) {
            if (!valueSet.add(value)) {
                return false;
            }
        }
        return true;
    }
}
