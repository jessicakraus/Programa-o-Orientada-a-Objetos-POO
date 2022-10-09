package ex8;

import java.util.Scanner;
import java.util.Arrays;

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * 8. Crie um vetor de String com tamanho definido e limitado. Preencha este
		 * vetor utilizando algum la�o de repeti��o (for each, for ou while). Em
		 * seguida, exiba no console os dados do vetor (um a um), o tamanho dele e
		 * verifique se est� vazio. Al�m disso, exiba apenas o �ltimo elemento
		 * acessando-o diretamente.
		 */

		String valor = "";
		String[] arrayString = new String[3];

		Scanner teste = new Scanner(System.in);

		int j = 1;
		for (int i = 0; i <= 2; i++) {
			System.out.println("Informe o " + (i + j) + "� conte�do: ");
			valor = teste.nextLine();
			arrayString[i] = valor;
		}

		if (arrayString[0].isEmpty() && arrayString[1].isEmpty() && arrayString[2].isEmpty()) {
			System.out.println("Array est� vazio");
		} else {
			System.out.println("Array n�o est� vazio");
		}

		System.out.println("Tamanho do array: " + arrayString.length);
		System.out.println("Primeiro item: " + arrayString[0]);
		System.out.println("Segundo item: " + arrayString[1]);
		System.out.println("Terceiro item: " + arrayString[2]);
		System.out.println("�ltima posi��o do array: " + arrayString[2]);
		System.out.println("Informa��es do Array: " + Arrays.toString(arrayString));
	}
}