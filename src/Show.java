import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, ArrayList<Actor> listOfActors, Director director, int duration) {
        this.title = title;
        this.listOfActors = new ArrayList<>();
        this.director = director;
        this.duration = duration;
    }

    public void printDirector(Director director) {
        System.out.println(director);
    }

    public void printListOfActors() {
        System.out.println("Актеры постановки " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Данный актер уже участвует в спектакле!");
        } else {
            listOfActors.add(actor);
            System.out.println(actor.getName() + " " + actor.getSurname() + " добавлен в спектакль " + title);
        }
    }

    public void changeActor(Actor newActor, String surname) {
        boolean isFound = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                isFound = true;
                System.out.println("Актёр с фамилией " + surname + " заменен на " + newActor.toString());
                break;
            }
        }
        if (!isFound) {
            System.out.println("Предупреждение: Актёр с фамилией " + surname + " не найден в постановке " + title);
        }
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }
}

