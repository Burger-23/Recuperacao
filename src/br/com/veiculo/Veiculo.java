package br.com.veiculo;

import br.com.marca.Marca;

public class Veiculo extends Marca {

	private String modelo;
	private int anodoveiculo;
	private String tipodecombustivel;
	private String placa;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnodoveiculo() {
		return anodoveiculo;
	}

	public void setAnodoveiculo(int anodoveiculo) {
		this.anodoveiculo = anodoveiculo;
	}

	public String getTipodecombustivel() {
		return tipodecombustivel;
	}

	public void setTipodecombustivel(String tipodecombustivel) {
		this.tipodecombustivel = tipodecombustivel;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
