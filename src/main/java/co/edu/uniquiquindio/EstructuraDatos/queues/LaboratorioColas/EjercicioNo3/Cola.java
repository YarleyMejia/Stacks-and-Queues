package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cola<T> implements Iterable {
    private Nodo<T> nodoPrimero;
    private Nodo<T> nodoUltimo;
    private int tamanio;



    // Constructor
    public Cola() {
        this.nodoPrimero = null;
        this.nodoUltimo = null;
    }

    // Método Basicos
    public boolean estaVacia() {
        return nodoPrimero == null;
    }

    // Método para encolar
    public void encolar(T valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (estaVacia()) {
            nodoPrimero = nuevoNodo;
            nodoUltimo = nuevoNodo;
        } else {
            nodoUltimo.setSiguienteNodo(nuevoNodo);
            nodoUltimo = nuevoNodo;
        }
        tamanio++;
    }

    // Método para desencolar
    public T desencolar() {
        if( !estaVacia() ) {
            Nodo<T> n = nodoPrimero;
            T valor = n.getValorNodo();
            nodoPrimero = n.getSiguienteNodo();
            if(nodoPrimero==null) {
                nodoUltimo = null;
            }
            tamanio--;
            return valor;
        }
        throw new RuntimeException("Lista vac�a");
    }

    //Consulta el elemento pendiente por desencolar, sin desencolarlo.
    public T consultar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return nodoPrimero.getValorNodo();
    }

    //Metodo usando Funciones posibles del anterior parcial
    //Validar si dos listas son iguales
    public <T> boolean validarIgualdad(Cola<T> cola1, Cola<T> cola2) {
        List<T> auxiliar1 = new ArrayList<>();
        List<T> auxiliar2 = new ArrayList<>();
        if (cola1.tamanio != cola2.tamanio) {
            return false;
        }
            for(Object dato: cola1){
                auxiliar1.add((T)dato);
            }
            for(Object dato: cola2){
                auxiliar2.add((T)dato);
            }

        if (auxiliar1.containsAll(auxiliar2)) {
            return  true;
        } else {
            return false;
        }

    }
        @Override
    public Iterator iterator() {
        return new IteradorCola(nodoPrimero);
    }

    public class IteradorCola implements Iterator<T>{
        private Nodo<T> nodo;
        private int posicion;
        /**
         * Constructor de la clase Iterador
         * @param
         */
        public IteradorCola(Nodo<T> nodo) {
            this.nodo = nodo;
            this.posicion = 0;
        }
        @Override
        public boolean hasNext() {
            return nodo!=null;
        }
        @Override
        public T next() {
            T valor = nodo.getValorNodo();
            nodo = nodo.getSiguienteNodo();// i++;
            posicion++;
            return valor;
        }
        /**
         * Posici�n actual de la Cola
         * @return posici�n
         */
        public int getPosicion() {
            return posicion;
        }

    }

    //Me permite imprimir correctamente la cola
    @Override
    public String toString() {
        return "Cola{" +
                "nodoPrimero=" + nodoPrimero +
                ", nodoUltimo=" + nodoUltimo +
                ", tamanio=" + tamanio +
                '}';
    }
}
