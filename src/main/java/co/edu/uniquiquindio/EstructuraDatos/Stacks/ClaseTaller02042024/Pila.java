package co.edu.uniquiquindio.EstructuraDatos.Stacks.ClaseTaller02042024;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pila<T> implements Iterable {
    private Nodo<T> cima;
    private Nodo<T> nodoUltimo;
    private int tamanio;



    // Constructor
    public Pila() {
        this.cima = null;
        this.nodoUltimo = null;
    }

    // Método Basicos
    public boolean estaVacia() {
        return cima == null;
    }

    // Método para encolar, de


    //Encolar al inicio
    public void push(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (estaVacia()) {
            cima = nuevoNodo;
            nodoUltimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguienteNodo(cima);
            cima = nuevoNodo;
        }
        tamanio++;
    }



    // Método para desenpilar
    public T pop() {
        if( !estaVacia() ) {
            Nodo<T> n = cima;
            T valor = n.getValorNodo();
            cima = n.getSiguienteNodo();
            if(cima ==null) {
                nodoUltimo = null;
            }
            tamanio--;
            return valor;
        }
        throw new RuntimeException("Pila vac�a");
    }

    //Consulta el elemento pendiente por desencolar, sin desencolarlo.
    public T cima() {
        if (estaVacia()) {
            throw new IllegalStateException("La Pila está vacía");
        }
        return cima.getValorNodo();
    }

    //Metodo usando Funciones posibles del anterior parcial
    //Validar si dos listas son iguales
    public <T> boolean validarIgualdad(Pila<T> pila1, Pila<T> pila2) {
        List<T> auxiliar1 = new ArrayList<>();
        List<T> auxiliar2 = new ArrayList<>();
        if (pila2.tamanio != pila2.tamanio) {
            return false;
        }
        for(Object dato: pila1){
            auxiliar1.add((T)dato);
        }
        for(Object dato: pila2){
            auxiliar2.add((T)dato);
        }

        if (auxiliar1.containsAll(auxiliar2)) {
            return  true;
        } else {
            return false;
        }

    }

    public static <T> void eliminarElementos(Pila<T> p, int nivelInf, int nivelSup){
        Pila<T> pilaAux=new Pila<>();
        int nivelActual=1;
        while(!p.estaVacia()&&nivelActual<nivelInf){
            pilaAux.push(p.pop());
            nivelActual++;
        }
        while(!p.estaVacia()&&nivelActual<=nivelSup){
            p.pop();
            nivelActual++;
        }
        while(!p.estaVacia()){
            p.push((pilaAux.pop()));
        }


    }

    @Override
    public Iterator iterator() {
        return new IteradorPila(cima);
    }

    public class IteradorPila implements Iterator<T>{
        private Nodo<T> nodo;
        private int posicion;
        /**
         * Constructor de la clase Iterador
         * @param
         */
        public IteradorPila(Nodo<T> nodo) {
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
        return "PILA: {" +
                "nodoPrimero=" + cima +
                ", nodoUltimo=" + nodoUltimo +
                ", tamanio=" + tamanio +
                '}';
    }
}

