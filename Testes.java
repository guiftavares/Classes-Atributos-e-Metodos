package exercicios_linguagem_programacao;
import javax.swing.JOptionPane;
public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ARRAY LUGAR

		Lugar[] Lug = new Lugar [5];
		Lug[0] = new Lugar ("Rom�nia",2020);
		Lug[1] = new Lugar ("Angola", 1998);
		Lug[2] = new Lugar ("Russia", 2007);
		Lug[3] = new Lugar ("Filipinas", 2012);
		Lug[4] = new Lugar ("Argentina", 2017);
		
		//ARRAY PESSOA
		
		Pessoa[] Pes = new Pessoa [5];
		Pes[0] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 27, 'F');
		Pes[1] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 15, 'F');
		Pes[2] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 23, 'M');
		Pes[3] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 36, 'F');
		Pes[4] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 41, 'M');
		
		//ARRAY ALUNOS SJC
		AlunosSJC[] Al = new AlunosSJC[5];
		Al[0] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		Al[1] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		Al[2] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		Al[3] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		Al[4] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		
		//ARRAY INSTRUMENTOS
		InstrumentoMusical[] Inst = new InstrumentoMusical[5];
		Inst[0] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		Inst[1] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		Inst[2] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		Inst[3] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		Inst[4] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		
		//ARRAY PROFISSIONAIS
		Profissionais[] Prof = new Profissionais[5];
		Prof[0]= new Profissionais (JOptionPane.showInputDialog("Profiss�o:"), 3);
		Prof[1]= new Profissionais (JOptionPane.showInputDialog("Profiss�o:"), 5);
		Prof[2]= new Profissionais (JOptionPane.showInputDialog("Profiss�o:"), 12);
		Prof[3]= new Profissionais (JOptionPane.showInputDialog("Profiss�o:"), 23);
		Prof[4]= new Profissionais (JOptionPane.showInputDialog("Profiss�o:"), 7);
		
		for (int i=0; i<4; i++) {
			
			System.out.println("Fui para "+ Lug[i].getPais() + " no ano de " + Lug[i].getAno());
			System.out.println("Meu nome � " + Pes[i].getNome() + ", eu tenho " + Pes[i].getIdade() + " anos. E sou do sexo " + Pes[i].getSexo());
			System.out.println("Meu nome � " + Al[i].getNome() + ", fa�o o curso de " + Al[i].getCurso() + " na " + Al[i].getUniversidade());
			System.out.println("Este � um " + Inst[i].getNome() + ", usado para tocar " + Inst[i].getEstilo_musical());
			System.out.println("Eu sou " + Prof[i].getProfissao() + " h� " + Prof[i].getExperiencia() + " anos.");
						
			}
	}

}
