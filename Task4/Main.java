package Task4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(List.of(new String[]{"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"}));
        set = removeEvenLength(set);

        System.out.println(set);
    }

    public static Set<String> removeEvenLength(Set<String> set) {
        Set<String> resultSet = new HashSet<>();

        for (String value : set) {
            if (value.length() % 2 != 0) {
                resultSet.add(value);
            }
        }
        return resultSet;
    }
}
