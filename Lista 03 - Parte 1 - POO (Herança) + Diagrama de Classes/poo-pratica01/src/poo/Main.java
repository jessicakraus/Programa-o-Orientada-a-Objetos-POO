package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nome = "", a = "";
		Long cpf = null, matricula = null, siape = null;
		LocalDate dataNasc;
		int dia = 0, mes = 0, ano = 0;

		Scanner leitura = new Scanner(System.in);

		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>(3);
		ArrayList<Professor> listaProfessor = new ArrayList<Professor>(3);

		for (int i = 0; i < listaAluno.size(); i++) {

			Aluno aluno = new Aluno();

			System.out.println("Nome do aluno: ");
			nome = leitura.nextLine();
			aluno.setNome(nome);

			System.out.println("CPF do aluno: ");
			a = leitura.nextLine();
			cpf = Long.valueOf(a);
			aluno.setCpf(cpf);

			System.out.println("Data de nascimento do aluno: Dia: ");
			a = leitura.nextLine();
			dia = Integer.valueOf(a);

			System.out.println("Mês: ");
			a = leitura.nextLine();
			mes = Integer.valueOf(a);

			System.out.println("Ano: ");
			a = leitura.nextLine();
			ano = Integer.valueOf(a);

			dataNasc = LocalDate.of(dia, mes, ano);

			System.out.println("Matrícula do aluno: ");
			a = leitura.nextLine();
			matricula = Long.valueOf(a);
			aluno.setMatricula(matricula);

			listaAluno.add(aluno);
		}

		for (int i = 0; i < listaProfessor.size(); i++) {

			Professor professor = new Professor();

			System.out.println("Nome do professor: ");
			nome = leitura.nextLine();
			professor.setNome(nome);

			System.out.println("CPF do professor: ");
			a = leitura.nextLine();
			cpf = Long.valueOf(a);
			professor.setCpf(cpf);

			System.out.println("Data de nascimento do aluno: Dia: ");
			a = leitura.nextLine();
			dia = Integer.valueOf(a);

			System.out.println("Mês: ");
			a = leitura.nextLine();
			mes = Integer.valueOf(a);

			System.out.println("Ano: ");
			a = leitura.nextLine();
			ano = Integer.valueOf(a);

			dataNasc = LocalDate.of(dia, mes, ano);

			System.out.println("Siape do professor: ");
			a = leitura.nextLine();
			siape = Long.valueOf(a);
			professor.setSiape(siape);

			listaProfessor.add(professor);

		}

		leitura.close();

	}

}
