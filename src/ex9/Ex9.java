package ex9;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex9 {

	public static void main(String[] args) {
		/*
		 * 9. Crie uma lista de String usando a estrutura de dados ArrayList. Preencha
		 * esta lista com a mesma quantidade de elementos utilizados no Exerc�cio 08. Em
		 * seguida, exiba no console: os dados da lista (um a um), o tamanho da lista e
		 * verifique se est� vazia. Al�m disso, exiba apenas o �ltimo elemento
		 * acessando-o diretamente.
		 */

		String valor = "";
		ArrayList<String> listString = new ArrayList<String>(3);

		Scanner teste = new Scanner(System.in);

		int j = 1;
		for (int i = 0; i <= 2; i++) {
			System.out.println("Informe o " + (i + j) + "� conte�do: ");
			valor = teste.nextLine();
			listString.add(valor);
		}

		if (listString.get(0).isEmpty() && listString.get(3).isEmpty() && listString.get(2).isEmpty()) {
			System.out.println("Lista est� vazia");
		} else {
			System.out.println("Lista n�o est� vazia");
		}

		System.out.println("Tamanho da lista: " + listString.size());
		System.out.println("Primeiro item: " + listString.get(0));
		System.out.println("Segundo item: " + listString.get(1));
		System.out.println("Terceiro item: " + listString.get(2));
		System.out.println("�ltima posi��o da lista: " + listString.get(2));
		System.out.println("Informa��es da Lista: " + listString);
	}
}