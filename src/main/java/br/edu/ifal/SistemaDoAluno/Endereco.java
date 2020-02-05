package br.edu.ifal.SistemaDoAluno;

public class Endereco {

	private String cep;
	private String bairro;
	private String estado;
	
	public Endereco() {
		
	}
	
	public Endereco(String cep, String bairro, String estado) {
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
