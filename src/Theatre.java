import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor actorIvanov = new Actor("Дмитрий", Gender.Male, "Иванов", "180");
        Actor actorPavlova = new Actor("Анна", Gender.Female, "Павлова", "160");
        Actor actorPetrov = new Actor("Иван", Gender.Male, "Петров", "185");

        Director operaDirector = new Director("Джакомо", Gender.Male, "Пуччини", 9);
        Director balletDirector = new Director("Мариус", Gender.Male, "Петипа", 19);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Лев Иванов";

        ArrayList<Actor> listOfActors = new ArrayList<>();

        Show show = new Show("Гамлет", listOfActors, operaDirector, 60);
        Opera opera = new Opera("Богема", listOfActors, operaDirector, 70, musicAuthor, "Сюжет основан на трагедии Шекспира", 12);
        Ballet ballet = new Ballet("Лебединое озеро", listOfActors, balletDirector, 90, musicAuthor, "История о принце Зигфриде, влюбившемся в королеву-лебедь Одетту", choreographer);

        opera.addActor(actorPavlova);
        opera.addActor(actorIvanov);

        show.addActor(actorPetrov);
        show.addActor(actorPavlova);
        show.addActor(actorIvanov);

        ballet.addActor(actorPetrov);
        ballet.addActor(actorPavlova);

        opera.printListOfActors();
        show.printListOfActors();
        ballet.printListOfActors();

        opera.changeActor(actorPetrov, "Иванов");
        opera.changeActor(actorPetrov, "Галов");

        opera.printListOfActors();

        System.out.println(opera.librettoText);
        System.out.println(ballet.librettoText);

    }
}
