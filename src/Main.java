import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Михаил", "Голенищев-Кутузов-Смоленский", 67));
        people.add(new Person("Эрих", "фон Манштейн", 85));
        people.add(new Person("Михаил", "Салтыков-Щедрин", 63));
        people.add(new Person("Александр", "Пушкин", 37));
        people.add(new Person("Николай", "Миклухо-Маклай", 41));
        people.add(new Person("Сергей", "Селивёрстов", 38));
        people.add(new Person("Не", "нашел примера тройной фамилии", 30));
        people.add(new Person("кроме", "Михаила Алексееыича Кутузов Смоленского ", 35));

        people.sort(new PeopleNobilityComporator(3));
        for (Person p : people) System.out.println(p.toString());
    }
}