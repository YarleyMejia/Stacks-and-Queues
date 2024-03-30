package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo3;

public class Main {
    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        // Es como una fila, encolando
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        Cola<Integer> cola2 = new Cola<>();

        // Es como una fila, encolando
        cola2.encolar(1);
        cola2.encolar(2);
        cola2.encolar(3);

        System.out.println(" Las Colas son iguales? R/= "+ cola.validarIgualdad(cola, cola2));

        System.out.println("==============VALIDANDO FUNCIONAMIENTO SIN AFECTACION DE COLAS ORIGINALES===================");
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