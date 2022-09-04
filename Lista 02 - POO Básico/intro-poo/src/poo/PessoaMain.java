package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {

		ArrayList<Pessoa> listaPessoas = new ArrayList<>();

		Pessoa p1 = new Pessoa();
		p1.setNome("Ana");
		p1.setCpf(12458671);
		p1.setIdade(20);
		listaPessoas.add(p1);

		Pessoa p2 = new Pessoa();
		p2.setNome("Bruno");
		p2.setCpf(1287671);
		p2.setIdade(25);
		listaPessoas.add(p2);

		Pessoa p3 = new Pessoa();
		p3.setNome("Carlos");
		p3.setCpf(17858671);
		p3.setIdade(30);
		listaPessoas.add(p3);

		Pessoa p4 = new Pessoa();
		p4.setNome("Daniel");
		p4.setCpf(1788671);
		p4.setIdade(40);
		listaPessoas.add(p4);

		Pessoa p5 = new Pessoa();
		p5.setNome("Emma");
		p5.setCpf(12448671);
		p5.setIdade(50);
		listaPessoas.add(p5);

		int i = 1;

		for (Pessoa pessoa : listaPessoas) {

			System.out.println(i + "° Pessoa");

			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("CPF: " + pessoa.getCpf() + " \n");

			i++;
		}

	}

}