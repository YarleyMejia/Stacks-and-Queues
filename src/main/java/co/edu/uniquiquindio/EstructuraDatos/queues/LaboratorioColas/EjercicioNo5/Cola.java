package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo5;


import java.util.*;

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

    //Encolar al inicio
    public void encolarAlInicio(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (estaVacia()) {
            nodoPrimero = nuevoNodo;
            nodoUltimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguienteNodo(nodoPrimero);
            nodoPrimero = nuevoNodo;
        }
        tamanio++;
    }

    public void ordenarAscendente(List<T> lista, Cola cola1, Cola cola2) {
        for (int i = 0; i < lista.size() % 2; i++) {
            cola1.encolarAlInicio(lista.get(i));
        }
        for (int i = 0; i > lista.size() % 2 && i <= tamanio; i++) {
            cola2.encolarAlInicio(lista.get(i));
        }
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

    //Inmsertar un valor en un posicion sin cambiar el demas orden
    // https://github.com/vivianamarquez-2013?tab=overview&from=2019-12-01&to=2019-12-31

    public void insertarEnPosicion(T valor, int posicion) {
        if (posicion < 0 || posicion > tamanio) {
            throw new IllegalArgumentException("La posición especificada está fuera de rango");
        }
        if (posicion == tamanio) {
            encolar(valor);
            return;
        }
        Nodo<T> anterior = null;
        Nodo<T> actual = nodoPrimero;
        for (int i = 0; i < posicion; i++) {
            anterior = actual;
            actual = actual.getSiguienteNodo();
        }
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        nuevoNodo.setSiguienteNodo(actual);
        if (anterior == null) {
            nodoPrimero = nuevoNodo;
        } else {
            anterior.setSiguienteNodo(nuevoNodo);
        }
        tamanio++;
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
