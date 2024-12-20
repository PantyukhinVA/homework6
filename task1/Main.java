package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Person10", 18));
        persons.add(new Person("Person2", 20));
        persons.add(new Person("Person11", 43));
        persons.add(new Person("Person13", 12));

        persons.sort(new PersonSuperComparator());

        // Вывод отсортированного списка
        for (Person person : persons) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
    }
}
