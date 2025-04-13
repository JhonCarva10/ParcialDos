public abstract class Criatura {
    private String nombre;
    private int salud;
    private int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);
    public boolean estaViva(){
        return salud > 0;
    }

    public int getSalud() {
        return salud;
    }

    public String getNombre(){
        return nombre;
    }

    public int getFuerza(){
        return fuerza;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
