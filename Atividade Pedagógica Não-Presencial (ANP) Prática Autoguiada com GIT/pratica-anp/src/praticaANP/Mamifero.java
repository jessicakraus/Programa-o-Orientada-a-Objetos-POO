package praticaANP;

public class Mamifero extends Animal {

	private int velocidade;

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void correr() {
		System.out.println("Este mamífero corre à uma velocidade de " + this.velocidade + "Km/h.");
	}
}