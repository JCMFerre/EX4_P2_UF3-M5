package ex4_p2_uf3.m5;

/**
 *
 * @author Joan Creus Martin
 */
public class MainTest {

    public static void main(String[] args) {
        Animal animal1 = new Vaca("Animal 1", "Vaca");
        Animal animal2 = new Vaca("Animal 2", "Vaca");
        Animal animal3 = new Cocodril("Animal 3", "Cocodril");
        Animal animal4 = new Cocodril("Animal 4", "Cocodril");
        // Proves vaca
        System.out.println(animal1.alimentarse(animal1) + "\n"
                + animal1.alimentarse(null) + "\n"
                + animal1.alimentarse(animal2) + "\n"
                + animal1.alimentarse(animal3));
        // Proves cocodril
        System.out.println(animal3.alimentarse(animal3) + "\n"
                + animal3.alimentarse(null) + "\n"
                + animal3.alimentarse(animal4) + "\n"
                + animal3.alimentarse(animal1));
    }

}
