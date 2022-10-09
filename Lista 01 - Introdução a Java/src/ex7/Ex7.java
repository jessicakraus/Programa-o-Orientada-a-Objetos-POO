package ex7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Ex7 {

	/*
	 * 7. Crie um programa que leia dez números inteiros e armazene em uma lista de
	 * tipo primitivo. Em seguida, exiba os dados da lista em ordem crescente e
	 * também decrescente - utilizando métodos nativos do Java.
	 */

	public static void main(String[] args) {

		int numero = 0;
		int vetor[] = new int[10];
		List<int[]> lista = Arrays.asList(vetor);
		int vetor2[] = new int[10];
		List<int[]> lista2 = Arrays.asList(vetor2);

		Scanner leitura = new Scanner(System.in);

		int j = 1;
		for (int i = 0; i <= 9; i++) {
			System.out.println("Informe o " + (i + j) + "° número: ");
			numero = leitura.nextInt();
			vetor[i] = numero;
			vetor2[i] = numero;
		}

		Arrays.sort(vetor);

		// Primeiro for para percorrer toda a lista, segundo for para percorrer a lista
		// e substituir a posição atual pelo maior valor encontrado
		for (int i = 1; i < vetor2.length; i++) {
			for (int j2 = 0; j2 < i; j2++) {
				if (vetor2[i] > vetor2[j2]) {
					int temp = (int) vetor2[i];
					vetor2[i] = vetor2[j2];
					vetor2[j2] = temp;
				}
			}
		}

		System.out.println("Lista de forma crescente" + Arrays.toString(vetor));
		System.out.println("Lista de forma decrescente" + Arrays.toString(vetor2));
	}
}