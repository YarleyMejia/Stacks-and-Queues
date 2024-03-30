package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo5;

import java.util.LinkedList;
import java.util.List;

public class Establo {
    private List<Oveja> listaOvejas= new LinkedList<>();

    public Establo() {
    }

    public int tamanio(){
        return listaOvejas.size();
    }

    public Oveja obtener(int i){
        return listaOvejas.get(i);
    }
    public void agregarOveja(Oveja oveja){
        listaOvejas.add(oveja);
    }

    @Override
    public String toString() {
        return "Establo{" +
                "listaOvejas=" + listaOvejas +
                '}';
    }
}
