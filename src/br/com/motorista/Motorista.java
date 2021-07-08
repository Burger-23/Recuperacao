package br.com.motorista;

import br.com.veiculo.Veiculo;

public class Motorista {

	private String nome;
	private int idade;
	private String categCNH;
	private Veiculo veiculo = new Veiculo();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCategCNH() {
		return categCNH;
	}

	public void setCategCNH(String categCNH) {
		this.categCNH = categCNH;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
