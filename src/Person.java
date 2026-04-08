public class Person {
    private final String name;
    private final String surname;
    private final Gender gender;

    public Person(String name, Gender gender, String surname) {
        this.name = name;
        this.gender = gender;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
}
