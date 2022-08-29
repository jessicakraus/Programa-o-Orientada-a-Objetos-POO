package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex11 {

	/*
	 * 11. Crie uma lista de sal�rio (n�meros reais R) usando um tipo primitivo
	 * adequado. Preencha 100 elementos nesta lista de forma aleat�ria (valores
	 * entre 1000 e 5000) utilizando m�todos nativos do Java. Liste o maior sal�rio,
	 * o menor sal�rio e a m�dia dos sal�rios.
	 */

	public static void main(String[] args) {

		ArrayList<Integer> listInt = new ArrayList<Integer>();
		int teste2 = 0;

		Random valorAleatorio = new Random();

		for (int i = 0; i <= 99;) {
			int valor = valorAleatorio.nextInt();
			if (valor >= 1000 && valor <= 5000) {
				listInt.add(valor);

				//Soma dos sal�rios
				teste2 = teste2 + listInt.get(i);
				i++;
			}
		}

		System.out.println("A m�dia dos sal�rios � " + teste2 / 100);
		Collections.sort(listInt);
		System.out.println("Maior sal�rio: " + listInt.get(99));
		Collections.sort(listInt, Collections.reverseOrder());
		System.out.println("Menor Sal�rio: " + listInt.get(99));

	}
}
