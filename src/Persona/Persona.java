package Persona;

import tablero.Ficha;

public abstract class Persona {
	
	protected String nombre;
	protected Ficha ficha;
	
	public abstract void jugada(int turno);
}
