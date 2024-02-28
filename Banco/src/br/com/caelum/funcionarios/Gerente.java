package br.com.caelum.funcionarios;

public class Gerente extends FuncionarioAutenticavel {

	private int numeroFuncionariosGerenciados;

	// ------------------- methods -------------------------

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	// -------------------------- constructor -------------------

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);
		// TODO Auto-generated constructor stub
	}
	// ----------------- getters and setters ----------------------

	public int getNumeroFuncionariosGerenciados() {
		return numeroFuncionariosGerenciados;
	}

	public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}

	@Override
	public double getBonificacao() {
		return getSalario() * 0.15;
	}

}
