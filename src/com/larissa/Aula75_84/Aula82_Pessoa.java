package com.larissa.Aula75_84;

public class Aula82_Pessoa {
	
	private int cod;
	private String nome;
	private int idade;
	
	
	
	public Aula82_Pessoa() {
		super();
	}
	
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
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Aula82_Pessoa(int cod, String nome, int idade) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.idade = idade;
	}
    public int getCod() {
    	return cod; 	
  
	}

	@Override
	public String toString() {
		return "Pessoa [cod=" + cod + ", nome=" + nome + ", idade=" + idade + "]";
	}
    
    
	
}
