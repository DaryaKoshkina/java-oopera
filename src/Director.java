public class Director extends Person {
    int numberOfShows;

    public Director(String name, Gender gender, String surname, int numberOfShows) {
        super(name, gender, surname);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}

