public class Guerrero extends Criatura {
    private String arma;
    private Arma armaLetal;

    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }


    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        if (arma != null) {
            daño += armaLetal.getDañoAdicional();
        }
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + " causando "
                + daño + "con arma: " + arma + " de daño.");
        objetivo.defender(daño);

    }

    @Override
    public void defender(int daño) {
        int saludActual = getSalud();
        saludActual -= daño;
        setSalud(saludActual);
        System.out.println(getNombre() + " recibe " + daño + " de daño. Salud actual: " + getSalud());
    }
}
