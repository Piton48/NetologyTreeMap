import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Михаил", "Голенищев-Кутузов-Смоленский", 67));
        people.add(new Person("Эрих", "фон Манштейн", 85));
        people.add(new Person("Михаил", "Салтыков-Щедрин", 63));
        people.add(new Person("Александр", "Пушкин", 37));
        people.add(new Person("Николай", "Миклухо-Маклай", 41));
        people.add(new Person("Сергей", "Селивёрстов", 38));
        people.add(new Person("Андрей", "Астахов", 17));
        people.add(new Person("Василий", "Ермольчик", 10));

        Predicate<Person> isMinor = (p) -> p.getAge() < 18;
        people.removeIf(isMinor);
        people.sort(new PeopleNobilityComporator(3));
        for (Person p : people) System.out.println(p.toString());
    }
}