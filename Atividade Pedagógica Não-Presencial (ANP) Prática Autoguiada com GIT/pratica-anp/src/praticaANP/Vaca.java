package praticaANP;

public class Vaca extends Mamifero {

	private boolean permiteOrdenha;

	public boolean isPermiteOrdenha() {
		return permiteOrdenha;
	}

	public void setPermiteOrdenha(boolean permiteOrdenha) {
		this.permiteOrdenha = permiteOrdenha;
	}

	public void ordenhar() {
		if (this.permiteOrdenha == true) {
			System.out.println("A vaca pode ser ordenhada.");
		} else {
			System.out.println("A vaca não pode ser ordenhada.");
		}
	}

	public void falar() {
		System.out.println("Muuu!");
	}
}