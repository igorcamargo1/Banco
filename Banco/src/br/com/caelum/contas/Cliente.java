package br.com.caelum.contas;

import br.com.caelum.funcionarios.Autenticavel;

public class Cliente implements Autenticavel {
	private String nome;
	private String cpf;
	private int senha;

	public Cliente(String nome, String cpf, int senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	// ------------------ getter and setters ---------------------

	public String getNome() {
		return this.nome;
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

}
