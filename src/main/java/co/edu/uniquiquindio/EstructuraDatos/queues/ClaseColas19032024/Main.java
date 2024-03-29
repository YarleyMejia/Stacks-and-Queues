package co.edu.uniquiquindio.EstructuraDatos.queues.ClaseColas19032024;



public class Main {
    public static void main(String[] args) {
        Cola<String> cola= new Cola<>();
        cola.encolar("Juan");
        cola.encolar("María");
        cola.encolar("Carlos");
        cola.encolar("Ana");
        cola.encolar("Pedro");
        System.out.println("PERSONAS EN COLA: ");
        //Se recorre con un for nomal
        for(int i=0;i<cola.getTamanio();i++){

                System.out.println("NOMBRE: " + i + "-->" + cola.obtenerValorNodo(i));
            }


        Cola<String> cola2=cola.clonar(cola);
        System.out.println("CLON");

        for(int i=0;i<cola2.getTamanio();i++){

            System.out.println("NOMBRE: " + i + "-->" + cola2.obtenerValorNodo(i));
        }



    }

    }

