package co.edu.uniquiquindio.EstructuraDatos.Taller_Diapositivas.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cadena cadena = new Cadena("anita lava la tina");
        if (cadena.esPalindromo()) {
            System.out.println("La cadena \"" + cadena.getContenido() + "\" es un palíndromo.");
        } else {
            System.out.println("La cadena \"" + cadena.getContenido() + "\" no es un palíndromo.");
        }
    }
}
