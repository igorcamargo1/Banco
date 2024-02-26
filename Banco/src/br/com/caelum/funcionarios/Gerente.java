package br.com.caelum.funcionarios;

public class Gerente extends Funcionario {

	private int senha;
	private int numeroFuncionariosGerenciados;

	// ------------------- methods -------------------------

	public boolean autenticaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso negaado!");
			return false;
		}
	}

	// -------------------------- constructor -------------------
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
		// TODO Auto-generated constructor stub
	}

	// ----------------- getters and setters ----------------------

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

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
