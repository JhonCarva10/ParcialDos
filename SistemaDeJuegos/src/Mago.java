public class Mago extends Criatura implements Magico {

    private String hechizos;
    private Arma arma;

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("Ataca con hechizo: " + hechizos);
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(hechizos + " ha aprendido un nuevo hechizo.");
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
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
