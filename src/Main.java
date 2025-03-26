import org.lessons.java.animals.Aquila;
import org.lessons.java.animals.Cane;
import org.lessons.java.animals.Delfino;
import org.lessons.java.animals.Passerotto;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane("Rex", "Dog", 5, "Big", "Brown", "Golden Retriever");
        System.out.println(cane.toString());
        cane.eat();
        cane.towards();
        cane.sleep();

        Passerotto passerotto = new Passerotto("Pippo", "Bird", 1, "Small", "Green", "Sparrow");
        System.out.println(passerotto.toString());
        passerotto.eat();
        passerotto.towards();
        passerotto.sleep();
        passerotto.fly();

        Aquila aquila = new Aquila("Aquila", "Bird", 3, "Big", "Brown", "Eagle");
        System.out.println(aquila.toString());
        aquila.eat();
        aquila.towards();
        aquila.sleep();
        aquila.fly();

        Delfino delfino = new Delfino("Delfino", "Mammal", 10, "Big", 0, "Grey", "Dolphin");
        System.out.println(delfino.toString());
        delfino.eat();
        delfino.towards();
        delfino.sleep();
        delfino.swim();

    }
}
