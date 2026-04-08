import java.util.ArrayList;

public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(String title, ArrayList<Actor> listOfActors, Director director, int duration, String musicAuthor, String librettoText, String choreographer) {
        super(title, listOfActors, director, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
