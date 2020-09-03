package exercicios_linguagem_programacao;

public class Lugar {
	
	//Atributos da Classe
	
	private String pais;
	private String clima;
	private String ponto_turistico;
	private String hotel;
	private int ano;
	
	public Lugar (String Pais, int ano) {
		pais = Pais;
		this.ano = ano;
	}
	
	
	//Metodo de acesso do tipo setter
	
	public void setPais (String p) {
		pais = p;
	}
	public void setClima (String c) {
		clima = c;
	}
	public void setPonto_Turistico (String pt) {
		ponto_turistico = pt;
	}
	public void setHotel (String h) {
		hotel = h;
	}
	public void setAno (int a) {
		ano = a;
	}
	
	
	//Metodo de acesso do tipo getter
	
	public String getPais() {
		return pais;
	}
	public String getClima() {
		return clima;
	}
	public String getPonto_Turistico() {
		return ponto_turistico;
	}
	public String getHotel() {
		return hotel;
	}
	public int getAno() {
		return ano;
	}
	
	
	//Métodos de Classe
	
	//Viajar
	public void viajar() {
		System.out.println("Vá para o aeroporto!");
	}
	
	
	//Reservar Hotel
	public void reservar() {
		System.out.println("Seu hotel foi reservado");
	}
	
	//Vistar Ponto Turistico
	public void visitar() {
		System.out.println("Você visitou um ponto turístico");
	}
}
