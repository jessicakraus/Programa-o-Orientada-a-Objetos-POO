package ex6;

import java.util.Scanner;
import java.util.Arrays;

public class Ex6 {

	/*
	 * 6. Crie um programa que leia dez salários e armazene em um vetor de tipo
	 * primitivo. Em seguida, exiba os dados do vetor em ordem crescente e também
	 * decrescente - utilizando métodos nativos do Java.
	 */

	public static void main(String[] args) {

		float salario = 0;
		float vetor[] = new float[10];
		float vetor2[] = new float[10];

		Scanner leitura = new Scanner(System.in);

		int j = 1;
		for (int i = 0; i <= 9; i++) {
			System.out.println("Informe o " + (i + j) + "° salário: ");
			salario = leitura.nextFloat();
			vetor[i] = salario;
			vetor2[i] = salario;
		}

		Arrays.sort(vetor);

		// Primeiro for para percorrer todo o vetor, segundo for para percorrer o vetor
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

		System.out.println("Array de forma crescente" + Arrays.toString(vetor));
		System.out.println("Array de forma decrescente" + Arrays.toString(vetor2));
	}

}
