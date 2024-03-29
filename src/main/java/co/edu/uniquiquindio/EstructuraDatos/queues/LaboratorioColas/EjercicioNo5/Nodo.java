package co.edu.uniquiquindio.EstructuraDatos.queues.LaboratorioColas.EjercicioNo5;


/**
 * Clase nodo aplicando Generics

 * **/


public class Nodo<Oveja> {

	private Nodo<Oveja> siguienteNodo;
	private Oveja valorNodo;
	
	
	/**
	 * Constructor de la clase Nodo
	 * @param valorNodo Elemento que se guarda en el Nodo
	 */
	public Nodo(Oveja valorNodo) {
		this.valorNodo = valorNodo;
	}
	
	
	/**
	 * Constructor de la clase Nodo
	 * @param dato Elemento que se guarda en el Nodo
	 * @param siguiente Enlace al siguiente Nodo
	 */
	public Nodo(Oveja dato, Nodo<Oveja> siguiente) {
		super();
		this.valorNodo = dato;
		this.siguienteNodo = siguiente;
	}
	

	//Metodos get y set de la clase Nodo
	
	public Nodo<Oveja> getSiguienteNodo() {
		return siguienteNodo;
	}


	public void setSiguienteNodo(Nodo<Oveja> siguienteNodo) {
		this.siguienteNodo = siguienteNodo;
	}


	public Oveja getValorNodo() {
		return valorNodo;
	}


	public void setValorNodo(Oveja valorNodo) {
		this.valorNodo = valorNodo;
	}

	public Oveja obtenerDato() {
		return valorNodo;
	}

	public void establecerDato(Oveja dato) {
		this.valorNodo = dato;
	}

	public Nodo obtenerSiguiente() {
		return siguienteNodo;
	}

	public void establecerSiguiente(Nodo siguiente) {
		this.siguienteNodo = siguiente;
	}

}
