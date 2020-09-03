package exercicios_linguagem_programacao;

public class Profissionais {
	
	private String profissao;
	private String area_trabalho;
	private int experiencia;
	private boolean uniforme;
	private String empresa;
	
	
	public Profissionais (String profissao, int Exp) {
		this.profissao = profissao;
		experiencia = Exp;
	}
	
	
	public void setProfissao (String p) {
		profissao = p;
	}
	public void setArea_trabalho (String at) {
		area_trabalho = at;
	}
	public void setExperiencia (int exp) {
		experiencia = exp;
	}
	public void setUniforme (boolean un) {
		uniforme = un;
	}
	public void setEmpresa (String emp) {
		empresa = emp;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public String getArea_trabalho() {
		return area_trabalho;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public boolean getUniforme() {
		return uniforme;
	}
	public String getEmpresa () {
		return empresa;
	}
	
	
	public void trabalhar() {
		System.out.println("Você não está de férias! Vamos trabalhar");
	}
	public void folgar() {
		System.out.println("Hoje é seu dia de folga.");
	}
	public void reunir() {
		System.out.println("Hoje tem reunião");
	}
	

}
