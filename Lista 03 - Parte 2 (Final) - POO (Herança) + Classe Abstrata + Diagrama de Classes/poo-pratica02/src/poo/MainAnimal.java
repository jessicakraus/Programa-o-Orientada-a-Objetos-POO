package poo;

public class MainAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Mel", "Golden Retriever", 1.2f, 4, "golden", "Dom�stico");

		System.out.println("Cachorro");
		System.out.println(cachorro);

		Gato gato = new Gato("Fred", "Siam�s", 35f, 4, "cinza com branco", "Dom�stico");

		System.out.println("\nGato");
		System.out.println(gato);

	}

}