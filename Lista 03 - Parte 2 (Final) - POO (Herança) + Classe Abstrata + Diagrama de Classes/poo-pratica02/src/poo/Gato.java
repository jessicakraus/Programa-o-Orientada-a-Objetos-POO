package poo;

public class Gato extends Animal {

	public Gato() {

	}

	public Gato(String nome, String raca, Float comprimento, Integer numeroPatas, String cor, String ecossistema) {
		this.setNome(nome);
		this.setRaca(raca);
		this.setComprimento(comprimento);
		this.setNumeroPatas(numeroPatas);
		this.setCor(cor);
		this.setEcossistema(ecossistema);
	}

	public void mia() {

	}

	public String toString() {
		return "Nome: " + this.getNome() + "\nRaça: " + this.getRaca() + "\nComprimento: " + this.getComprimento()
				+ "\nNúmero de patas: " + this.getNumeroPatas() + "\nCor: " + this.getCor() + "\nEcossistema: "
				+ this.getEcossistema();
	}

}
