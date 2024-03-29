package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo5;

public class Cola <Oveja> {
    private Nodo frente;
    private Nodo finalCola;

    public Cola() {
        frente = null;
        finalCola = null;
    }

    // Método para agregar una persona al final de la cola
    public void encolar(Oveja oveja) {
        Nodo nuevoNodo = new Nodo(oveja);
        if (estáVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.establecerSiguiente(nuevoNodo);
            finalCola = nuevoNodo;
        }
    }

    // Método para eliminar y devolver la persona al frente de la cola
    public Oveja desencolar() {
        if (estáVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        Oveja ovejaDesencolada = (Oveja) frente.obtenerDato();
        frente = frente.obtenerSiguiente();
        if (frente == null) {
            finalCola = null;
        }
        return ovejaDesencolada;
    }

    // Método para verificar si la cola está vacía
    public boolean estáVacia() {
        return frente == null;
    }

    // Método para obtener la persona al frente de la cola sin eliminarla
    public Oveja inicio() {
        if (estáVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return (Oveja) frente.obtenerDato();
    }

    // Método para mostrar el contenido de la cola
    public void mostrar() {
        if (estáVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        Nodo nodoActual = frente;
        while (nodoActual != null) {
SSystem.out.println(nodoActual.obtenerDato());
            nodoActual = nodoActual.obtenerSiguiente();
        }
    }

    protected Cola<Oveja> clonar(){
        Cola<Oveja> nueva=new Cola<>();
        Nodo<Oveja>auxiliar=frente;
        while(auxiliar !=null){
            nueva.encolar(auxiliar.getValorNodo());
            auxiliar=auxiliar.getSiguienteNodo();
        }
        return nueva;
    }
}
