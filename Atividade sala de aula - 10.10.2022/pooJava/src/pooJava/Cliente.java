package pooJava;

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

	public Double sacar(Double valor) {
		return valor;

	}

	public void depositar(Double valor) {

	}

	public Double mostrarSaldo() {

		return saldo;

	}

}
