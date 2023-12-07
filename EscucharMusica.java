public class EscucharMusica extends HOBBY{

    String Genero;
    String Idioma;

    public String getGenero() {
        return Genero;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setIdioma(String idioma) {
        Idioma = idioma;
    }

    public EscucharMusica (String nombre, String dia){ super (nombre, dia);}

}
