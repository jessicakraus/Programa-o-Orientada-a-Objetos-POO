package praticaANP;

public class Animal {

	private String nome;
	protected String classe;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void imprime() {
		System.out.println("Nome: " + this.getNome() + " \nClasse: " + this.getClasse());
	}

	public void falar() {
		System.out.println("Alguns animais podem falar, ex: Corvo e Papagaio.");
	}
}