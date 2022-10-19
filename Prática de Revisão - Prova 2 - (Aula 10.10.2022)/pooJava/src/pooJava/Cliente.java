package pooJava;

import java.time.LocalDate;

public class Cliente extends Pessoa {

	private Integer nrConta;
	private Double saldo;

	public Integer getNrConta() {
		return nrConta;
	}

	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente(String nome, LocalDate dataNasc, String email, Integer nrConta, Double saldo) {

		this.setNome(nome);
		this.setDataNasc(dataNasc);
		this.setEmail(email);
		this.setNrConta(nrConta);
		this.setSaldo(saldo);

	}

	public Double sacar(Double valor) {

		return valor;

	}

	public Double depositar(Double valor) {

		return valor;
	}

	public Double mostrarSaldo(Double valor) {

		return valor;

	}

	public String toString() {
		return "Nome: " + this.getNome() + "\nData de nascimento: " + this.getDataNasc() + "\nE-mail: "
				+ this.getEmail() + "\nNúmero da conta: " + this.getNrConta() + "\nSaldo: " + this.getSaldo();
	}

}
