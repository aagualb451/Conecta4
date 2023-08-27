package tablero;

public class Tablero {

	private Casilla[][] miTablero = new Casilla[8][8];

	Tablero() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				miTablero[i][j] = new Casilla();
			}
		}
	}

	public boolean añadirFicha(int posicion, Ficha ficha) {
		int horizontal = posicion - 1, vertical = miTablero.length - 1;
		boolean salida = false, sacada = false;
		do {
			if (vertical < 0) {
				salida = true;
			} else {
				if (!miTablero[vertical][horizontal].isRellena()) {
					salida = true;
					sacada = true;
					miTablero[vertical][horizontal].setFicha(ficha);
				}
				vertical--;
			}
		} while (!salida);
		return sacada;
	}

	public void mostrarTablero() {
		System.out.println();
		for (int i = 0; i < 8; i++) {
			System.out.print(" |");
			System.out.print("\\");
			for (int j = 0; j < 8; j++) {

				System.out.print(miTablero[i][j].devolverFicha());

				if (j < 7) {
					System.out.print("|");
				}

			}
			System.out.print("/");
			System.out.print("|");
			System.out.println();
		}
		System.out.print("   ");
		for (int i = 0; i < 8; i++) {
			if (i < 7)
				System.out.print("----");
			else
				System.out.print("---");
		}
	}
}
