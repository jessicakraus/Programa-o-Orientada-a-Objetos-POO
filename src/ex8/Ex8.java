package ex8;

import java.util.Scanner;
import java.util.Arrays;

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * 8. Crie um vetor de String com tamanho definido e limitado. Preencha este
		 * vetor utilizando algum laço de repetição (for each, for ou while). Em
		 * seguida, exiba no console os dados do vetor (um a um), o tamanho dele e
		 * verifique se está vazio. Além disso, exiba apenas o último elemento
		 * acessando-o diretamente.
		 */

		String valor = "";
		String[] arrayString = new String[3];

		Scanner teste = new Scanner(System.in);

		int j = 1;
		for (int i = 0; i <= 2; i++) {
			System.out.println("Informe o " + (i + j) + "° conteúdo: ");
			valor = teste.nextLine();
			arrayString[i] = valor;
		}

		if (arrayString[0].isEmpty() && arrayString[1].isEmpty() && arrayString[2].isEmpty()) {
			System.out.println("Array está vazio");
		} else {
			System.out.println("Array não está vazio");
		}

		System.out.println("Tamanho do array: " + arrayString.length);
		System.out.println("Primeiro item: " + arrayString[0]);
		System.out.println("Segundo item: " + arrayString[1]);
		System.out.println("Terceiro item: " + arrayString[2]);
		System.out.println("Última posição do array: " + arrayString[2]);
		System.out.println("Informações do Array: " + Arrays.toString(arrayString));
	}
}