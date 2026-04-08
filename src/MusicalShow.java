import java.util.ArrayList;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, ArrayList<Actor> listOfActors, Director director, int duration, String musicAuthor, String librettoText) {
        super(title, listOfActors, director, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
