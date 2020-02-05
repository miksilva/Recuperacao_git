package br.edu.ifal.SistemaDoAluno;

public class Estudante {

	private Disciplina disciplina;
	private String nome;
	private Endereco endereco;
	private ControleNotas controlenotas;
	private int idade;
	private double nota1;
	private double nota2;

	public Estudante() {

	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public ControleNotas getControlenotas() {
		return controlenotas;
	}


	public void setControlenotas(ControleNotas controlenotas) {
		this.controlenotas = controlenotas;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public double getNota1() {
		return nota1;
	}


	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}


	public double getNota2() {
		return nota2;
	}


	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
}
