import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов", 40));
        people.add(new Person("Иван", "Иванович Иванов", 15));
        people.add(new Person("Максим", "Максимович Максимов", 10));
        people.add(new Person("Антон", "Иванов Безпалов", 5));
        people.add(new Person("Василий", "Бут Мут Гут", 15));
        people.add(new Person("Андрей", "Бут Мут Гут", 20));
        people.add(new Person("Василий", "Иванов", 25));

        Collections.sort(people, new PeopleNobilityComporator(3));
        System.out.println(people.toString());

    }
}