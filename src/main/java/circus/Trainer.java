package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
<<<<<<< HEAD:src/main/java/circus/Trainer.java
=======
import circus.animal.Parrot;
>>>>>>> 8149490d17fb8c4450de7fb0ea91099477b47b75:src/main/java/Trainer.java

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

<<<<<<< HEAD:src/main/java/circus/Trainer.java
        train(new Duck());
        // train(new Parrot());

=======
        train(new Duck("Daisy"));
        // train(new animal.Parrot());
>>>>>>> 8149490d17fb8c4450de7fb0ea91099477b47b75:src/main/java/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
