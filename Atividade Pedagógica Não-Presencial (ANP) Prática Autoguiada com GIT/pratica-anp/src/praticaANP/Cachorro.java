package praticaANP;

public class Cachorro extends Mamifero {

	private boolean tipoLatido;

	public boolean isTipoLatido() {
		return tipoLatido;
	}

	public void setTipoLatido(boolean tipoLatido) {
		this.tipoLatido = tipoLatido;
	}

	public void setLateAlto() {
		if (this.tipoLatido == true) {
			System.out.println("O cachorro late alto.");
		}
	}

	public void setLateBaixo() {
		if (this.tipoLatido == false) {
			System.out.println("O cachorro late baixo.");
		}
	}

	public void falar() {
		System.out.println("Au au au!");
	}
}