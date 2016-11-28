package ex4_p2_uf3.m5;

/**
 *
 * @author Joan Creus Martin
 */
public class Vaca extends Animal {

    public Vaca(String nombre, String tipusAnimal) {
        super(nombre, tipusAnimal);
    }

    @Override
    public String moures() {
        return "Una vaca es posa a dormir";
    }

    @Override
    public String expressarse() {
        return "Una vaca fa mu";
    }

    @Override
    public String alimentarse(Animal animal) {
        return (animal == null || animal == this ? "Una vaca pasta solitària"
                : (animal instanceof Cocodril ? "Una vaca pasta al costat d'un perillós cocodril!"
                        : "Una vaca pasta al costat d'una altra vaca"));
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Sóc una vaca.");
    }

}
