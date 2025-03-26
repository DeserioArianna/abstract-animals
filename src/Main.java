import org.lessons.java.animals.Aquila;
import org.lessons.java.animals.Cane;
import org.lessons.java.animals.Delfino;
import org.lessons.java.animals.Passerotto;
import org.lessons.java.animals.interfaces.Fly;
import org.lessons.java.animals.interfaces.Swimming;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane("Rex", "Dog", 5, "Big", "Brown", "Golden Retriever");
        System.out.println(cane.toString());
        cane.eat();
        cane.makeSound();
        cane.sleep();

        Passerotto passerotto = new Passerotto("Pippo", "Bird", 1, "Small", "Green", "Sparrow");
        System.out.println(passerotto.toString());
        passerotto.eat();
        passerotto.makeSound();
        passerotto.sleep();

        Aquila aquila = new Aquila("Aquila", "Bird", 3, "Big", "Brown", "Eagle");
        System.out.println(aquila.toString());
        aquila.eat();
        aquila.makeSound();
        aquila.sleep();

        Delfino delfino = new Delfino("Delfino", "Mammal", 10, "Big", 0, "Grey", "Dolphin");
        System.out.println(delfino.toString());
        delfino.eat();
        delfino.makeSound();
        delfino.sleep();

        animalFly(aquila);
        animalFly(passerotto);
        animalSwim(delfino);

    }

    // Polimorfismo
    static void animalFly(Fly animalFly) {
        animalFly.fly();
    }

    static void animalSwim(Swimming animalSwim){
        animalSwim.swim();
    }
}
