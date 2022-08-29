package ex4;

public class Ex4 {

	public static void main(String[] args) {

		/*
		 * 4. Crie duas Strings com o mesmo conte�do. Compare as vari�veis de tr�s
		 * formas: utilizando os m�todos nativos equals() e equalsIgnoreCase() e o
		 * operador ==. Quais s�o os resultados? Todas as tr�s formas s�o v�lidas e
		 * adequadas para comparar Strings?
		 */

		String palavra1 = "Exemplo";
		String palavra2 = "Exemplo";

		System.out.println(palavra1.equals(palavra2));

		System.out.println(palavra1.equalsIgnoreCase(palavra2));

		if (palavra1 == palavra2) {
			System.out.println(palavra1 == palavra2);
		}

		// Resposta: Os resultados foi "true", as tr�s formas s�o v�lidas e adequadas
		// para comparar Strings.
	}
}
