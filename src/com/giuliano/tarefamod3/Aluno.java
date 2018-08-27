package com.giuliano.tarefamod3;

public class Aluno {

	protected String matricula;
	protected String nome;
	protected String dataNascimento;
	protected double media;
	protected Float nota1;
	protected Float nota2;

	public Aluno(String matricula, String nome, String dataNascimento, String nota1, String nota2) {
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		nota1 = new Float(nota1).toString();
		nota2 = new Float(nota2).toString();
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public Float getNota1() {
		return nota1;
	}
	
	public Float getNota2() {
		return nota2;
	}
	public double calculaMedia() {
		return media = (nota1 + nota2) / 2;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String toString(){
	 return String.format("Matricula: %s\nNome: %s\nData de Nascimento: %s\nNota1: %s\nNota2: %s\r\n",
	 getMatricula(),
	 getNome(),
	 getDataNascimento(),
	 getNota1(),
	 getNota2());
	 }
}
