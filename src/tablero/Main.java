package tablero;

public class Main {

	public void prueba() {

		Tablero a = new Tablero();
		a.mostrarTablero();
		a.añadirFicha(1, Ficha.AZUL);
		a.mostrarTablero();
		a.añadirFicha(2, Ficha.AZUL);
		a.mostrarTablero();
		a.añadirFicha(2, Ficha.AMARILLA);
		a.añadirFicha(2, Ficha.VERDE);
		a.añadirFicha(2, Ficha.AMARILLA);
		a.añadirFicha(2, Ficha.VERDE);
		a.añadirFicha(2, Ficha.AMARILLA);
		a.añadirFicha(2, Ficha.VERDE);
		a.añadirFicha(2, Ficha.VERDE);
		a.añadirFicha(2, Ficha.VERDE);
		a.mostrarTablero();
	}

	public static void main(String[] args) {
		new Main().prueba();
	}
}
