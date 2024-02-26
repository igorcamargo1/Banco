package br.com.caelum.funcionarios;

public class Presidente extends Funcionario {

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return getSalario() * 0.20 + 1000;
	}

	// -------------------------- constructor -------------------
	public Presidente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

}
