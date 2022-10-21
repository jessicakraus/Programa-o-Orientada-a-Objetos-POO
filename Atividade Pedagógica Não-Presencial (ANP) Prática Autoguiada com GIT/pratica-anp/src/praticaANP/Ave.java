package praticaANP;

public class Ave extends Animal {

	public void falar() {
		System.out.println("Piu piu!");
	}

	public void voar(int voar) {
		if (voar == 1) {
			System.out.println("O pássaro pode voar.");
		} else {
			System.out.println("O pássaro não pode voar.");
		}
	}
}