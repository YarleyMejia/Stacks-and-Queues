package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Oveja> establo = new ArrayList<>();
        establo.add(new Oveja(100));
        establo.add(new Oveja(7));
        establo.add(new Oveja(13));
        establo.add(new Oveja(10));
        establo.add(new Oveja(29));
        establo.add(new Oveja(16));
        establo.add(new Oveja(17));
        establo.add(new Oveja(18));
        establo.add(new Oveja(19));
        establo.add(new Oveja(20));
        establo.add(new Oveja(43));
        establo.add(new Oveja(35));
        establo.add(new Oveja(23));

        establo.sort(Comparator.comparing((Oveja a) -> a.getPeso(), Comparator.reverseOrder()));

        Cola<Oveja> establoUno = new Cola<>();
        Cola<Oveja> establoDos = new Cola<>();
        establoUno.ordenarEstablo(establo, establoUno, establoDos);
        System.out.println("=============================================");

        System.out.println("Establo Completo: " + establo);
        System.out.println("=============================================");
        System.out.println("Establo Uno:");
        establoUno.forEach(System.out::println);
        System.out.println("=============================================");
        System.out.println("Establo Dos:");
        establoDos.forEach(System.out::println);
        System.out.println("=============================================");
        System.out.println("Desencolando elementos del establo uno:");
        while (!establoUno.estaVacia()) {
            System.out.println("Elemento desencolado: " + establoUno.desencolar());
        }
        System.out.println("=============================================");
        System.out.println("Desencolando elementos del establo dos:");
        while (!establoDos.estaVacia()) {
            System.out.println("Elemento desencolado: " +establoDos.desencolar());
        }
    }


    }