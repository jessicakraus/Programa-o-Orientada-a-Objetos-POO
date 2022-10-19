package pooJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Instanciar dois objetos da classe Cliente e adicioná-los em um ArrayList
2. Instanciar dois objetos da classe Funcionario e adicioná-los em um ArrayList
3. Demonstrar que os métodos sacar, depositar e mostrarSaldo funcionam
4. Exibir os clientes e funcionários do ArrayList em um for each
*/

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>(3);
		ArrayList<Integer> listControl = new ArrayList<Integer>();
		ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>(2);

		Cliente cliente1 = new Cliente("Robson", LocalDate.of(1987, 12, 14), "SeuRobson@gmail.com", 18475926, 2413.23);
		Cliente cliente2 = new Cliente("Pedro", LocalDate.of(1993, 05, 11), "Predinho123@gmail.com", 84657291, 4642.19);

		Funcionario funcionario1 = new Funcionario("Camile", LocalDate.of(1998, 11, 05), "Camile23551@gmail.com",
				881864585, "01/12/2017");
		Funcionario funcionario2 = new Funcionario("João", LocalDate.of(1991, 02, 01), "Joaozinho3321@gmail.com",
				430664644, "15/03/2020");

		listaCliente.add(cliente1);
		listaCliente.add(cliente2);

		listaFuncionario.add(funcionario1);
		listaFuncionario.add(funcionario2);

		// Exibir os clientes
		System.out.println("Clientes:");
		for (Cliente clientes : listaCliente) {
			System.out.println("\n" + clientes);
		}

		System.out.println("\nFuncionários:");

		for (Funcionario funcionarios : listaFuncionario) {
			System.out.println("\n" + funcionarios);
		}

		int op = 999;
		Scanner opcao = new Scanner(System.in);
		Scanner cadastro = new Scanner(System.in);

		Integer numeroConta = 0;

		double valorDepositar = 0;
		double valorSacar = 0;

		System.out.println("\nPara realizar alguma operação, digite o número da sua conta: ");
		numeroConta = cadastro.nextInt();

		listControl.add(0);

		for (Cliente cliente : listaCliente) {
			if (numeroConta.toString().contains(cliente.getNrConta().toString())) {
				listControl.remove(0);
				listControl.add(cliente.getNrConta());
				// Remover todos os clientes da lista
				listaCliente.removeAll(listaCliente);
				// Adicionar apenas o cliente que possui o número da conta é igual ao informado
				listaCliente.add(cliente);
				break;
			}
		}

		if (listControl.get(0).toString().contains(numeroConta.toString())) {

			while (op > 3 | op < 0) {

				System.out.println("\nBem vindo(a) " + listaCliente.get(0).getNome() + "!");

				System.out.println("\n0 - Sair");
				System.out.println("1 - Mostrar Saldo");
				System.out.println("2 - Depositar");
				System.out.println("3 - Sacar");
				System.out.println("------------------------------------");
				System.out.println("Digite a opção: ");
				op = opcao.nextInt();

				switch (op) {
				case 1:
					System.out.println("Seu saldo é : " + cliente1.mostrarSaldo(listaCliente.get(0).getSaldo()));
					break;

				case 2:
					System.out.println("Digite o valor que deseja depositar: ");
					valorDepositar = opcao.nextInt();
					System.out.println("Valor depositado com sucesso, seu saldo atual é: "
							+ (cliente1.depositar(valorDepositar) + listaCliente.get(0).getSaldo()));
					break;

				case 3:
					System.out.println("Seu saldo é : " + listaCliente.get(0).getSaldo());

					System.out.println("Digite o valor você deseja sacar: ");
					valorSacar = opcao.nextInt();

					if (valorSacar < listaCliente.get(0).getSaldo()) {
						System.out.println("Valor sacado com sucesso, seu saldo atual é: "
								+ (listaCliente.get(0).getSaldo() - cliente1.sacar(valorSacar)));
					} else {
						System.out.println("Saldo insuficiente para realizar essa operação.");
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

		} else {
			System.out.println("Número da conta não encontrado");
		}
		
		opcao.close();
		cadastro.close();
		
	}
}