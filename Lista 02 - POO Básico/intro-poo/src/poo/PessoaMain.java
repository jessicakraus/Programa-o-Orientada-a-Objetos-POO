package poo;

import java.util.ArrayList;

public class PessoaMain {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Ana");
		p1.setCpf(12458671);
		p1.setIdade(20);
		listaPessoas.add(p1);
		
		Pessoa p2 = new Pessoa();
		p1.setNome("Bruno");
		p1.setCpf(1287671);
		p1.setIdade(25);
		listaPessoas.add(p2);
		
		Pessoa p3 = new Pessoa();
		p1.setNome("Carlos");
		p1.setCpf(17858671);
		p1.setIdade(30);
		listaPessoas.add(p3);
		
		Pessoa p4 = new Pessoa();
		p1.setNome("Daniel");
		p1.setCpf(1788671);
		p1.setIdade(40);
		listaPessoas.add(p4);
		
		Pessoa p5 = new Pessoa();
		p1.setNome("Emma");
		p1.setCpf(12448671);
		p1.setIdade(50);
		listaPessoas.add(p5);
		
		int op = 999;
		
		while(op!=0) {
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Listar");
		}
		
		
		

	}

}
