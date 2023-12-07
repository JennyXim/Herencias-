public class Bailar extends HOBBY {

    String Genero;
    String ritmo;

    public String getGenero() {
        return Genero;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public Bailar (String nombre, String dia){super (nombre, dia);}

}
