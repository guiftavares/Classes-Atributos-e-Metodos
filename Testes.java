package exercicios_linguagem_programacao;
import javax.swing.JOptionPane;
public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ARRAY LUGAR

		Lugar[] Lug = new Lugar [5];
		Lug[0] = new Lugar ("Romênia",2020);
		Lug[1] = new Lugar ("Angola", 1998);
		Lug[2] = new Lugar ("Russia", 2007);
		Lug[3] = new Lugar ("Filipinas", 2012);
		Lug[4] = new Lugar ("Argentina", 2017);
		
		for (int i=0; i<4; i++) {
			
			System.out.println("Fui para "+ Lug[i].getPais() + " no ano de " + Lug[i].getAno());
		}
			
		
		//ARRAY PESSOA
		
		Pessoa[] Pes = new Pessoa [5];
		Pes[0] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 27, 'F');
		Pes[1] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 15, 'F');
		Pes[2] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 23, 'M');
		Pes[3] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 36, 'F');
		Pes[4] = new Pessoa(JOptionPane.showInputDialog("Nome:"), 41, 'M');
		
		for (int i=0; i<4; i++) {
			
			System.out.println("Meu nome é " + Pes[i].getNome() + ", eu tenho " + Pes[i].getIdade() + " anos. E sou do sexo " + Pes[i].getSexo());
		}
		
		
		//ARRAY ALUNOS SJC
		AlunosSJC[] Al = new AlunosSJC[5];
		Al[0] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		Al[1] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		Al[2] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		Al[3] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		Al[4] = new AlunosSJC(JOptionPane.showInputDialog("Nome:"), JOptionPane.showInputDialog("Curso:"), JOptionPane.showInputDialog("Universidade:"));
		
		for (int i=0; i<4; i++) {
			System.out.println("Meu nome é " + Al[i].getNome() + ", faço o curso de " + Al[i].getCurso() + " na " + Al[i].getUniversidade());
		}		
		
		
		//ARRAY INSTRUMENTOS
		InstrumentoMusical[] Inst = new InstrumentoMusical[5];
		Inst[0] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		Inst[1] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		Inst[2] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		Inst[3] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		Inst[4] = new InstrumentoMusical (JOptionPane.showInputDialog("Instrumento:"), JOptionPane.showInputDialog("Estilo Musical:"));
		
		for (int i=0; i<4; i++) {
			
			System.out.println("Este é um " + Inst[i].getNome() + ", usado para tocar " + Inst[i].getEstilo_musical());
		}
			
		
		//ARRAY PROFISSIONAIS
		Profissionais[] Prof = new Profissionais[5];
		Prof[0]= new Profissionais (JOptionPane.showInputDialog("Profissão:"), 3);
		Prof[1]= new Profissionais (JOptionPane.showInputDialog("Profissão:"), 5);
		Prof[2]= new Profissionais (JOptionPane.showInputDialog("Profissão:"), 12);
		Prof[3]= new Profissionais (JOptionPane.showInputDialog("Profissão:"), 23);
		Prof[4]= new Profissionais (JOptionPane.showInputDialog("Profissão:"), 7);
		
		for (int i=0; i<4; i++) {			
			
			System.out.println("Eu sou " + Prof[i].getProfissao() + " há " + Prof[i].getExperiencia() + " anos.");
						
		}
		
		//ARRAY SAPATOS
		Sapatos[] Sap = new Sapatos[5];
		Sap[0]= new Sapatos ("mocassim", 41, 'M');
		Sap[1]= new Sapatos ("tamanco", 39, 'F');
		Sap[2]= new Sapatos ("sandália", 33, 'F');
		Sap[3]= new Sapatos ("scarpin", 37, 'F');
		Sap[4]= new Sapatos ("bota", 43, 'M');
				
		for (int i=0; i<4; i++) {			
					
			System.out.println("Comprei um " + Sap[i].getTipo() + " tamanho " + Sap[i].getTamanho());
				}
	}

}
