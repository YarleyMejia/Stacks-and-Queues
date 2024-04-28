package co.edu.uniquiquindio.EstructuraDatos.Taller_Diapositivas.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = generarSecuenciaAleatoria(10);
        Pila<Integer> pila = convertirListaEnPila(lista);

        // Imprimir la secuencia original y la pila
        System.out.println("Secuencia original:");
        imprimirLista(lista);
        System.out.println("\nPila:");
        imprimirPila(pila);
    }

    public static ListaSimple<Integer> generarSecuenciaAleatoria(int longitud) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        Random rand = new Random();
        for (int i = 0; i < longitud; i++) {
            int numero = rand.nextInt(100); // Números aleatorios entre 0 y 99
            lista.agregarfinal(numero);
        }
        return lista;
    }

    public static Pila<Integer> convertirListaEnPila(ListaSimple<Integer> lista) {
        Pila<Integer> pila = new Pila<>();
        for (Integer elemento : lista) {
            pila.push(elemento);
        }
        return pila;
    }

    public static void imprimirLista(ListaSimple<Integer> lista) {
        lista.imprimirLista();
    }

    public static void imprimirPila(Pila<Integer> pila) {
        pila.imprimir();
    }
}
}
