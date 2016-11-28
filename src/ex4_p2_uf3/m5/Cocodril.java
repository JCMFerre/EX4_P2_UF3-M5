package ex4_p2_uf3.m5;

/**
 *
 * @author Joan Creus Martin
 */
public class Cocodril extends Animal {

    public Cocodril(String nombre, String tipusAnimal) {
        super(nombre, tipusAnimal);
    }

    @Override
    public String moures() {
        return "Un cocodril neda estany amunt, estany avall";
    }

    @Override
    public String expressarse() {
        return "Un cocodril obre una boca plena de dents.";
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Sóc un Cocodril.");
    }

    @Override
    public String alimentarse(Animal animal) {
        return (animal == null || animal == this ? "Un cocodril busca a qui es pot menjar"
                : (animal instanceof Cocodril ? "Un cocodril es menja un altre cocodril!"
                        : "Un cocodril es menja una vaca"));
    }

}
