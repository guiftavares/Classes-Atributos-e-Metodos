package exercicios_linguagem_programacao;

public class Sapatos {
	
	private String tipo;
	private int tamanho;
	private String cor;
	private String material;
	private char sexo;
	
	public Sapatos (String tipo, int tamanho, char sexo) {
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.sexo = sexo;
		}
	
	public void setTipo (String t) {
		tipo = t;
	}
	public void setTamanho (int tm) {
		tamanho = tm;
	}
	public void setCor (String c) {
		cor = c;
	}
	public void setMaterial (String mt) {
		material = mt;
	}
	public void setSexo (char sx) {
		sexo = sx;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public String getCor() {
		return cor;
	}
	public String getMaterial() {
		return material;
	}
	public char getSexo() {
		return sexo;
	}
	
	
	public void calçar() {
		System.out.println("Calcei os sapatos");
	}
	public void comprar() {
		System.out.println("Comprei sapatos novos");
	}
	public void lavar() {
		System.out.println("É importante lavar os sapatos");
	}

}
