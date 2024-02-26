package br.com.caelum.funcionarios;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;

	// ------------------- methods -------------------------

	public abstract double getBonificacao();

	// -------------------------- constructor -------------------

	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	// ----------------- getters and setters ----------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
