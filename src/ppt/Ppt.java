package ppt;

public class Ppt {
	
	private Jogador jogador;
	private Computador computador;
	private int pontosJogador;
	private int pontosComputador;
	

	//Construtor 
	public Ppt() {
		jogador = new Jogador();
		computador = new Computador();
		pontosJogador = 0;
		pontosComputador = 0;
		
	}
	public static void main(String[] args) {

		Ppt ppt = new Ppt();
		ppt.getNomeJogador();
		ppt.iniciarJogo();
	}
	
	
	public void iniciarJogo() {
		int escolhaJogador = jogador.escolhaJogada();
		Regras.display(jogador.getNome(), escolhaJogador);
	
		int computerinput = computador.getInput();
		Regras.display("Computador", computerinput);
		
		int compareResult=Regras.compararEscolhas(escolhaJogador, computerinput);
		switch (compareResult) {
		case 0: // Empate
			System.out.println("Empate");
			break;
		case 1: // Jogador Ganha
			System.out.println(jogador.getNome()+ " Ganhou do " + "Computador" +", Você Venceu!");
			pontosJogador++;
			break;
		case -1: // Computador Ganha
			System.out.println("Computador" +" Ganhou de "+ jogador.getNome()+", Você Perdeu!");
			pontosComputador++;
			break;
		}
		
		if(pontosJogador==3)
		{
			System.out.println(jogador.getNome()+" Ganhou na melhor de três");
			new Ppt();
		}
		if(pontosComputador==3)
		{
			System.out.println("Computador "+" Ganhou na melhor de três");
			new Ppt();
		}
		
		if (jogador.jogarNovamente()) {
			System.out.println();
			iniciarJogo();
		} else {
			System.out.println("Obrigado por jogar !");
		}
	}
	
	public void getNomeJogador() {
		jogador.perguntaNome();
	}
}