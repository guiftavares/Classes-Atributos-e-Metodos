package exercicios_linguagem_programacao;

public class AlunosSJC {
	
	private String nome;
	private String curso;
	private int periodo;
	private float rendimento;
	private String universidade;
	
	
	public AlunosSJC (String Nome, String curso, String universidade) {
		nome = Nome;
		this.curso = curso;
		this.universidade = universidade;
		}
	
	public void setNome (String n) {
		nome = n;
	}
	public void setCurso (String c) {
		curso = c;
	}
	public void setPeriodo (int p) {
		periodo = p;
	}
	public void setRendimento (float r) {
		rendimento = r;
	}
	public void setUniversidade (String u) {
		universidade = u;
	}
	
	public String getNome(){
		return nome;
	}
	public String getCurso() {
		return curso;
	}
	public int getPeriodo() {
		return periodo;
	}
	public float getRendimento() {
		return rendimento;
	}
	public String getUniversidade() {
		return universidade;
	}
	
	public void estudar() {
		System.out.println("Você tem aula hoje");
	}
	public void reprovar() {
		System.out.println("Você foi reprovado nesta disciplina");
	}
	public void aprovar() {
		System.out.println("Você foi aprovado!");
	}
}


