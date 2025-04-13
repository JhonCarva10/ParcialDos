public class Arma {

    private String nombre;
    private int dañoAdicional;

    public void atacarConArma(Criatura objetivo){
        objetivo.defender(dañoAdicional);
    }

    public int getDañoAdicional(){
        return dañoAdicional;
    }

    public String getNombre() {
        return nombre;
    }
}
