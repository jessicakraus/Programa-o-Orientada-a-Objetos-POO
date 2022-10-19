package ex4;

public class Ex4 {

	public static void main(String[] args) {

		/*
		 * 4. Crie duas Strings com o mesmo conteúdo. Compare as variáveis de três
		 * formas: utilizando os métodos nativos equals() e equalsIgnoreCase() e o
		 * operador ==. Quais são os resultados? Todas as três formas são válidas e
		 * adequadas para comparar Strings?
		 */

		String palavra1 = "Exemplo";
		String palavra2 = "Exemplo";

		System.out.println(palavra1.equals(palavra2));

		System.out.println(palavra1.equalsIgnoreCase(palavra2));

		if (palavra1 == palavra2) {
			System.out.println(palavra1 == palavra2);
		}

		// Resposta: Os resultados foi "true", as três formas são válidas e adequadas
		// para comparar Strings.
	}
}
