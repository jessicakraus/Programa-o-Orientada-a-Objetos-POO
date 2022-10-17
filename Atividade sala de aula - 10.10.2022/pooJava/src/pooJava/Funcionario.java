package pooJava;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

	private Integer nrRegistro;
	private String dataContratacao;

	public Integer getNrRegistro() {
		return nrRegistro;
	}

	public void setNrRegistro(Integer nrRegistro) {
		this.nrRegistro = nrRegistro;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public void pedirDemissao() {

	}

	public void serContratado() {

	}

	public Funcionario() {

	}

	public Funcionario(String nome, LocalDate dataNasc, String email, Integer nrRegistro, String dataContratacao) {

		this.setNome(nome);
		this.setDataNasc(dataNasc);
		this.setEmail(email);
		this.setNrRegistro(nrRegistro);
		this.setDataContratacao(dataContratacao);

	}

	public String toString() {
		return "Nome: " + this.getNome() + "\nData de nascimento: " + this.getDataNasc() + "\nE-mail: "
				+ this.getEmail() + "\nNúmero do registro: " + this.getNrRegistro() + "\nData da contratação: "
				+ this.getDataContratacao();
	}

}
