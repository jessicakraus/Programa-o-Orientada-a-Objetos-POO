package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		int op = 999, i = 1;
		Scanner opcao = new Scanner(System.in);
		Scanner cadastro = new Scanner(System.in);

		String nome = "", nomeAtualizar = "";
		int cpf = 0, idade = 0;
		ArrayList<Pessoa> Pessoas = new ArrayList<>();

		while (op != 0) {
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Listar");
			System.out.println("------------------------------------");
			System.out.println("Digite opção: ");
			op = opcao.nextInt();

			switch (op) {
			case 1:
				System.out.println("Nome: ");
				nome = cadastro.nextLine();

				System.out.println("CPF: ");
				cpf = opcao.nextInt();

				System.out.println("Idade: ");
				idade = opcao.nextInt();

				Pessoa teste2 = new Pessoa();
				teste2.setNome(nome);
				teste2.setCpf(cpf);
				teste2.setIdade(idade);
				Pessoas.add(teste2);
				break;

			case 2:

				i = 1;

				for (Pessoa pessoa : Pessoas) {

					System.out.println(i + "° Pessoa");

					System.out.println("Nome: " + pessoa.getNome() + "\n");

					i++;
				}

				System.out.println("Digite o nome da pessoa que você deseja atualizar o cadastro: ");
				nomeAtualizar = cadastro.nextLine();

				for (Pessoa pessoa : Pessoas) {

					if (pessoa.getNome().equals(nomeAtualizar)) {

						Pessoas.remove(pessoa);

						System.out.println("Nome: ");
						nome = cadastro.nextLine();

						System.out.println("CPF: ");
						cpf = opcao.nextInt();

						System.out.println("Idade: ");
						idade = opcao.nextInt();

						Pessoa teste3 = new Pessoa();
						teste3.setNome(nome);
						teste3.setCpf(cpf);
						teste3.setIdade(idade);

						Pessoas.add(teste3);
					}

				}
				break;

			case 3:

				i = 1;

				for (Pessoa pessoa : Pessoas) {

					System.out.println(i + "° Pessoa");

					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("Idade: " + pessoa.getIdade());
					System.out.println("CPF: " + pessoa.getCpf() + " \n");

					i++;
				}
				break;

			case 0:
				System.out.println("Finalizando o sistema.");
				break;

			default:
				System.out.println("Opção inválida, digite novamente: ");
				break;

			}
		}


	}

}
