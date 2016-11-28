package ex4_p2_uf3.m5;

/**
 *
 * @author Joan Creus Martin
 */
public abstract class Animal implements IAnimal {

    private String nombre;
    private String tipusAnimal;

    public Animal(String nombre, String tipusAnimal) {
        this.nombre = nombre;
        this.tipusAnimal = tipusAnimal;
    }

    public abstract void tipoAnimal();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipusAnimal() {
        return tipusAnimal;
    }

    public void setTipusAnimal(String tipusAnimal) {
        this.tipusAnimal = tipusAnimal;
    }

}
