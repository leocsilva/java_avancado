package net.leocsilva.model;

public class Aluno {
	
	
	private int id;
	private String nome;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
