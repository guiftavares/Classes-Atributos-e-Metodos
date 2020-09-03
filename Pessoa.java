package exercicios_linguagem_programacao;

public class Pessoa {
	
	//Atributos da Classe
	
	private String nome;
	private int idade;
	private char sexo;
	private float altura;
	private float peso;
			
	public Pessoa (String Nome, int idade, char sexo) {
		nome = Nome;
		this.idade = idade;
		this.sexo = sexo;
				
	}
			
	public void setNome (String n) {
		nome = n;
	}
	public void setIdade (int i) {
		idade = i;
	}
	public void setSexo (char s) {
		sexo = s;
	}
	public void setAltura (float h) {
		altura = h;
	}
	public void setPeso (float p) {
		peso = p;
	}
			
			
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public char getSexo() {
		return sexo;
	}
	public float getAltura() {
		return altura;
	}
	public float getPeso() {
		return peso;
	}
	
	
	public void conversar() {
		System.out.println("Oi, tudo bem?");
	}
	
	public void agradecer() {
		System.out.println("Obrigado!");
	}
	
	public void despedir() {
		System.out.println("Tchau!");
	}
			
			
			
			
	

}
