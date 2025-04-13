public class Main {


    public static void main(String[] args) {
        //Dragon
        Dragon guerreroDragon = new Dragon("Dragon Occidental", 100, 20);
        //Mago
        Mago magoHechizero = new Mago("Mago de oz", 100, 35, "Veneno");

        //Método que simula la batalla entre las criaturas
        simularBatalla(guerreroDragon, magoHechizero);
    }

    public static void simularBatalla(Criatura criatura1, Criatura criatura2) {
        System.out.println("¡Comienza la batalla entre " + criatura1.getNombre() + " y " + criatura2.getNombre() + "!");

        //Ciclo repetitivo que está pendiente si alguna de las criaturas está viva
        //para seguir con la batalla
        while (criatura1.estaViva() && criatura2.estaViva()) {
            criatura1.atacar(criatura2);
            if (!criatura2.estaViva() || !criatura1.estaViva()) break;
            criatura2.atacar(criatura1);
        }

        //Condición que revisa si la criatura está viva, devuelve true si la salud es mayor que cero
        //de lo contrario devuelve false
        if (criatura1.estaViva()) {
            System.out.println(criatura1.getNombre() + " ha ganado la batalla.");
        } else {
            System.out.println(criatura2.getNombre() + " ha ganado la batalla.");
        }
    }
}
