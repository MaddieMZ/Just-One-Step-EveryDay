package Rutinas;

import java.util.LinkedList;

public abstract class Rutina {

	protected LinkedList<Ejercicio> ejercicios;
	public Rutina() {
		
		ejercicios= new LinkedList<Ejercicio>();
		buildEjercicios();
	}
	
	protected abstract void buildEjercicios();
	
	public LinkedList<Ejercicio> getLista() {
		return ejercicios;
	}
}
