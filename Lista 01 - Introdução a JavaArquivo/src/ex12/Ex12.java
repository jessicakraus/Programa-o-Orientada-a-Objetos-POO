package ex12;

import java.util.ArrayList;

public class Ex12 {

	/*
	 * Crie uma lista de dez nomes (alfanuméricos) usando uma wrapper class.
	 * Atualize um dos nomes da lista.
	 */

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>(10) {};

		arrayList.add("Jessica");
		arrayList.add("Lucas");
		arrayList.add("Pedro");
		arrayList.add("Guilherme");
		arrayList.add("Luiz");
		arrayList.add("Joana");
		arrayList.add("Mario");
		arrayList.add("Anderson");
		arrayList.add("Felipe");
		arrayList.add("Maria");

		System.out.println("Lista anterior: " + arrayList);

		arrayList.set(2, "Paulo");

		System.out.println("Lista atualizada: " + arrayList);
	}
}