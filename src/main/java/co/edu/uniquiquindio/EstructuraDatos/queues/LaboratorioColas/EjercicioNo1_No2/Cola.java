package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo1_No2;


import java.util.Iterator;

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

    @Override
    public Iterator iterator() {
        return new IteradorCola (nodoPrimero);
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
