package ex3;

import java.util.Scanner;

public class Ex3 {

	/*
	 * 3. Escreva um método responsável por calcular o abastecimento de um veículo.
	 * O método deve retornar o valor total a ser pago a partir do precoLitro e
	 * quantidadeLitros. Utilize wrapper classes do Java para os tipos usados e
	 * valide - utilizando controle de fluxo - caso valores nulos sejam fornecidos
	 * para precoLitro e quantidadeLitros.
	 */

	public static void main(String[] args) {

		Float precoLitro = (float) 0;
		Float quantidadeLitros = (float) 0;

		Scanner teste = new Scanner(System.in);

		System.out.println("Digite o preço do litro: ");
		precoLitro = teste.nextFloat();

		System.out.println("Digite a quantidade de litros: ");
		quantidadeLitros = teste.nextFloat();

		if (quantidadeLitros == 0) {
			System.out.println("Quantidade precisa ser informada.");
		}

		if (precoLitro == 0) {
			System.out.println("Preço precisa ser informado.");
		}

		Float total = precoLitro * quantidadeLitros;

		if (quantidadeLitros == 0 || precoLitro == 0) {
			System.out.println("O valor para abastecer o veículo não foi calculado digite as informações corretamente.");
		} else {
			System.out.println("O valor para abastecer o veículo ficou em: " + total);
		}

	}

}
