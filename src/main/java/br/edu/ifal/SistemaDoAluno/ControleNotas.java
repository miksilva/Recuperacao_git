package br.edu.ifal.SistemaDoAluno;

public class ControleNotas {

	private Estudante estudante;

	public boolean validarNota() {
		
		if(estudante.getNota1() == 10) {
			return true;
		}
		else {
			return false;
		}
	}
	public double mediaPonderada() {
		double media;
		media = (estudante.getNota1() + estudante.getNota2())/2;
		return media;
	}
	
	public boolean aprovacao() {
		if(estudante.getControlenotas().mediaPonderada() >= 6) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void getSituacao() {
		if(estudante.getControlenotas().mediaPonderada() <4) {
			System.out.println("O aluno esta reprovado!");
		}
		else if(estudante.getControlenotas().mediaPonderada() <=6) {
			System.out.println("O aluno esta em recuperacao!");
		}
		else {
			System.out.println("Parabens, voce esta aprovado!");
		}
	}
	
	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	
}
