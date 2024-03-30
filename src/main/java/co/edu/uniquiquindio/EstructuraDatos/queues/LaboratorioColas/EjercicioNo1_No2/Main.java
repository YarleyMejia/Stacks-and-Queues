package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo1_No2;

public class Main {
    public static void main(String[] args) {

    Cola<Integer> cola = new Cola<>();

    // Es como una fila, encolando
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        //Imprimir los datos de la Cola
        cola.forEach(System.out::println);


    // Consultar el elemento al inicio
        System.out.println("Elemento en la cabeza de la cola: " + cola.consultar());


    // Desencolar y mostrar los elementos de la cola
        System.out.println("Desencolando elementos de la cola:");
        while (!cola.estaVacia()) {
            System.out.println("Elemento desencolado: " + cola.desencolar());
        }
}
}