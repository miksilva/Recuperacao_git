package br.edu.ifal.SistemaDoAluno;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private String nome;
	private int cargaHoraria;
	private List<Estudante> estudantes = new ArrayList<Estudante>();
	
public Disciplina() {
		
	}
	
	public Disciplina(String nome, int cargaHoraria, List<Estudante> estudantes) {
		this.cargaHoraria = cargaHoraria;
		this.estudantes = estudantes;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
	
	}

