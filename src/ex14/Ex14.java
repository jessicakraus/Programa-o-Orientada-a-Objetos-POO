package ex14;

import java.util.Scanner;

public class Ex14 {

	/*
	 * 14. Considere um programa a ser feito no console do Eclipse IDE que deve
	 * calcular a m�dia final (MF) de um(a) discente seguindo a f�rmula dispon�vel
	 * no Plano de Ensino da disciplina de Programa��o Orientada a Objetos. Ao
	 * final, deve informar: Se MF >= 6: Aprovado(a) Se MF >= 4 e < 6: Recupera��o
	 * Se MF < 4: Reprovado(a) Observa��es: o programa n�o deve permitir a entrada
	 * de dados alfanum�ricos ou nulos. Crie um m�todo exclusivo para realizar o
	 * c�lculo da m�dia. Pense nos par�metros que o m�todo deve ter. Realizar
	 * leitura de dados (nomeAluno e notas) pelo teclado via console.
	 */

	public static void main(String[] args) {

		String nomeAluno = "";
		double p1 = 0, p2 = 0, p3 = 0, eci01 = 0, eci02 = 0, eci03 = 0, pgs01 = 0, pgs02 = 0, pgs03 = 0, pgs04 = 0,
				pgs05 = 0, pgs06 = 0;

		Scanner notas = new Scanner(System.in);

		Scanner leituraAluno = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		nomeAluno = leituraAluno.nextLine();

		while (p1 == 0) {
			System.out.println("Digite a nota da P1: ");
			p1 = notas.nextFloat();
		}

		while (eci01 == 0) {
			System.out.println("Digite a nota da ECI01: ");
			eci01 = notas.nextFloat();
		}

		while (pgs01 == 0) {
			System.out.println("Digite a nota da PGS01: ");
			pgs01 = notas.nextFloat();
		}

		while (pgs02 == 0) {
			System.out.println("Digite a nota da PGS02: ");
			pgs02 = notas.nextFloat();
		}

		while (p2 == 0) {
			System.out.println("Digite a nota da P2: ");
			p2 = notas.nextFloat();
		}

		while (eci02 == 0) {
			System.out.println("Digite a nota da ECI02: ");
			eci02 = notas.nextFloat();
		}

		while (pgs03 == 0) {
			System.out.println("Digite a nota da PGS03: ");
			pgs03 = notas.nextFloat();
		}

		while (pgs04 == 0) {
			System.out.println("Digite a nota da PGS04: ");
			pgs04 = notas.nextFloat();
		}

		while (p3 == 0) {
			System.out.println("Digite a nota da P3: ");
			p3 = notas.nextFloat();
		}

		while (eci03 == 0) {
			System.out.println("Digite a nota da ECI03: ");
			eci03 = notas.nextFloat();
		}

		while (pgs05 == 0) {
			System.out.println("Digite a nota da PGS05: ");
			pgs05 = notas.nextFloat();
		}

		while (pgs06 == 0) {
			System.out.println("Digite a nota da PGS06: ");
			pgs06 = notas.nextFloat();
		}

		double mediaFinal = calculoMedia(p1, eci01, pgs01, pgs02, p2, eci02, pgs03, pgs04, p3, eci03, pgs05, pgs06);
		System.out.println("M�dia final do aluno " + nomeAluno
				+ " na unidade curricular de programa��o orientada a objetos � " + mediaFinal);

	}

	public static double calculoMedia(double p1, double eci01, double pgs01, double pgs02, double p2, double eci02,
			double pgs03, double pgs04, double p3, double eci03, double pgs05, double pgs06) {

		double mf = 0, n1 = 0, n2 = 0, n3 = 0;

		n1 = (p1 * 0.5) + (eci01 * 0.25) + (pgs01 * 0.125) + (pgs02 * 0.125);
		n2 = (p2 * 0.5) + (eci02 * 0.30) + (pgs03 * 0.10) + (pgs04 * 0.10);
		n3 = (p3 * 0.5) + (eci03 * 0.40) + (pgs05 * 0.05) + (pgs06 * 0.05);

		mf = (n1 + n2 + n3) / 3;

		return mf;
	}

}