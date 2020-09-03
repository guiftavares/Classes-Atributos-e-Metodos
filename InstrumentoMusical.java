package exercicios_linguagem_programacao;

public class InstrumentoMusical {

	private String nome;
	private String tipo;
	private String tamanho;
	private String material;
	private String estilo_musical;
	
	public InstrumentoMusical (String Nome, String estilo) {
		nome = Nome;
		estilo_musical = estilo;
	}
	
	public void setNome (String n) {
		nome = n;
	}
	public void setTipo (String t) {
		tipo = t;
	}
	public void setTamanho (String tm) {
		tamanho = tm;
	}
	public void setMaterial (String m) {
		material = m;
	}
	public void setEstilo_musical (String em) {
		estilo_musical = em;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public String getEstilo_musical() {
		return estilo_musical;
	}
	
	
	public void tocar() {
		System.out.println("Toque uma música para nós.");
	}
	public void afinar() {
		System.out.println("Parece que seu instrumento está desafinado.");
	}
	public void escolher() {
		System.out.println("Escolha um instrumento.");
	}
	
}
