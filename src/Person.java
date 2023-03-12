public class Person {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ". возраст: " + getAge();
    }
}
