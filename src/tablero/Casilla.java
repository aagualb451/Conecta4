package tablero;

public class Casilla {

	private boolean rellena = false;

	private Ficha ficha;

	public void setFicha(Ficha ficha) {
		rellena = true;
		this.ficha = ficha;
	}

	public String devolverFicha() {
		return rellena ? ficha.devolverColor() : " . ";
	}

	public boolean isRellena() {
		return rellena;
	}

}
