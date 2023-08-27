package tablero;

public enum Ficha {

	AZUL("\u001B[34m ○ \u001B[0m"), AMARILLA("\u001B[33m ○ \u001B[0m"), VERDE("\u001B[32m ○ \u001B[0m");

	private String color;

	private Ficha(String color) {
		this.color = color;
	}

	public String devolverColor() {
		return color;
	}
}
