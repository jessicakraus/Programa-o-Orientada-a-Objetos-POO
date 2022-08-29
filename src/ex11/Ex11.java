package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex11 {

	/*
	 * 11. Crie uma lista de salário (números reais R) usando um tipo primitivo
	 * adequado. Preencha 100 elementos nesta lista de forma aleatória (valores
	 * entre 1000 e 5000) utilizando métodos nativos do Java. Liste o maior salário,
	 * o menor salário e a média dos salários.
	 */

	public static void main(String[] args) {

		ArrayList<Integer> listInt = new ArrayList<Integer>();
		int teste2 = 0;

		Random valorAleatorio = new Random();

		for (int i = 0; i <= 99;) {
			int valor = valorAleatorio.nextInt();
			if (valor >= 1000 && valor <= 5000) {
				listInt.add(valor);

				//Soma dos salários
				teste2 = teste2 + listInt.get(i);
				i++;
			}
		}

		System.out.println("A média dos salários é " + teste2 / 100);
		Collections.sort(listInt);
		System.out.println("Maior salário: " + listInt.get(99));
		Collections.sort(listInt, Collections.reverseOrder());
		System.out.println("Menor Salário: " + listInt.get(99));

	}
}
