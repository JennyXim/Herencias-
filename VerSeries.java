public class VerSeries extends HOBBY {
    String Serie;
    String NumeroCapitulos;

    public String getSerie() {
        return Serie;
    }

    public String getNumeroCapitulos() {
        return NumeroCapitulos;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public void setNumeroCapitulos(String numeroCapitulos) {
        NumeroCapitulos = numeroCapitulos;
    }

    public VerSeries (String nombre, String dia){ super (nombre, dia); }

}
