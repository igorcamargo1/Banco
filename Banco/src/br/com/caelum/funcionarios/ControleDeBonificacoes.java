package br.com.caelum.funcionarios;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario f) {
		System.out.println("Adicionando bonificação ao funcionário: " + f.getNome());
		this.totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}
