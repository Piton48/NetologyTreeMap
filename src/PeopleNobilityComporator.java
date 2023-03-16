import java.util.Comparator;

public class PeopleNobilityComporator implements Comparator<Person> {
    protected int maxWordsNumber;

    public PeopleNobilityComporator(int maxWordsNumber) {
        this.maxWordsNumber = maxWordsNumber;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.surnameLenght() > o2.surnameLenght() & o2.surnameLenght() < maxWordsNumber) return 1;
        if (o1.surnameLenght() < o2.surnameLenght() & o1.surnameLenght() < maxWordsNumber) return -1;
        if (o1.surnameLenght() == o2.surnameLenght()
                | (o1.surnameLenght() >= maxWordsNumber & o2.surnameLenght() >= maxWordsNumber)) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else return -1;
        }
        return 0;
    }
}

