package co.edu.uniquiquindio.EstructuraDatos.Taller_Diapositivas.Ejercicio1;

public class Cadena {

    private String contenido;

    public Cadena(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean esPalindromo() {
        // Crear una pila para almacenar los caracteres de la cadena
        Pila<Character> pila = new Pila<>();

        // Meter los caracteres de la cadena en la pila
        for (int i = 0; i < contenido.length(); i++) {
            char caracter = contenido.charAt(i);
            // Ignorar los espacios en blanco
            if (caracter != ' ') {
                pila.push(caracter);
            }
        }

        // Comparar los caracteres de la cadena original con los de la pila
        for (int i = 0; i < contenido.length(); i++) {
            char caracter = contenido.charAt(i);
            // Ignorar los espacios en blanco
            if (caracter != ' ') {
                // Obtener el caracter de la cima de la pila
                char caracterPila = pila.pop();
                // Si los caracteres son diferentes, la cadena no es un palíndromo
                if (caracter != caracterPila) {
                    return false;
                }
            }
        }

        // Si todos los caracteres coinciden, la cadena es un palíndromo
        return true;
    }
}
