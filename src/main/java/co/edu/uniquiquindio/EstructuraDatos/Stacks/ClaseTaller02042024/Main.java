package co.edu.uniquiquindio.EstructuraDatos.Stacks.ClaseTaller02042024;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila=new Pila<>();
        pila.push(7);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(3);
        pila.push(1);
        System.out.println("======PILA======");
        pila.forEach(System.out::println);


        int cima= pila.cima();
        System.out.println(" La cima es: "+ cima);
        pila.eliminarElementos(pila,2,4);
        System.out.println("Nueva pila");
        pila.forEach(System.out::println);



    }
}
