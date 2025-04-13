public class Dragon extends Criatura implements Volador {
    private String escamas;
    private Arma arma;

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void volar() {
        System.out.println("La criatura: " + getNombre() + "Está volando");
    }

    @Override
    public void aterrizar() {
        System.out.println(getNombre() + " aterriza.");
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() * 2;
        if (arma != null) {
            daño += arma.getDañoAdicional();
        }
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + " causando " + daño + " de daño.");
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
