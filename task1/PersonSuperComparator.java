package task1;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Сравниваем по возрасту
        int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
        if (ageComparison != 0) {
            return ageComparison; // Если возраст разный, возвращаем результат сравнения
        }
        // Если возраст одинаковый, сравниваем по имени
        return p1.getName().compareTo(p2.getName());
    }
}
