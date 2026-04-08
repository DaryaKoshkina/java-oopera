import java.util.Objects;

public class Actor extends Person {
    private final String height;

    public Actor(String name, Gender gender, String surname, String height) {
        super(name, gender, surname);
        this.height = height;
    }

    @Override
    public String toString() {
        return  getName() + " " + getSurname() + " (" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }
}
