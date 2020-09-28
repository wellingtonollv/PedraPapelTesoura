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
		ppt.Regras();
		ppt.getNomeJogador();
		ppt.iniciarJogo();
	}
	
	
	public void iniciarJogo() {
		int escolhaJogador = jogador.escolhaJogada();
		Juiz.display(jogador.getNome(), escolhaJogador);
	
		int computerinput = computador.getInput();
		Juiz.display("Computador", computerinput);
		
		int compararResultados=Juiz.compararEscolhas(escolhaJogador, computerinput);
		switch (compararResultados) {
		case 0: // Empate
			System.out.println("Empate");
			System.out.println(" | Seus Pontos: " + pontosJogador + " | Pontos Computador: "+ pontosComputador+" |");
			break;
		case 1: // Jogador Ganha
			System.out.println(jogador.getNome()+ " Ganhou do " + "Computador" +", Você Venceu essa!");
			pontosJogador++;
			System.out.println(" | Seus Pontos: " + pontosJogador + " | Pontos Computador: "+ pontosComputador+" |");
			break;
		case -1: // Computador Ganha
			System.out.println("Computador" +" Ganhou de "+ jogador.getNome()+", Você Perdeu essa!");
			pontosComputador++;
			System.out.println(" | Seus Pontos: " + pontosJogador + " | Pontos Computador: "+ pontosComputador+" |");
			break;
		}
		
		if(pontosJogador==3)
		{
			System.out.println(jogador.getNome()+" Ganhou na melhor de três");
			pontosJogador = 0;
			pontosComputador = 0;
			new Ppt();
		}
		if(pontosComputador==3)
		{
			System.out.println("Computador "+" Ganhou na melhor de três");
			pontosJogador = 0;
			pontosComputador = 0;
			new Ppt();
		}
		
		if (jogador.jogarNovamente()) {	
			iniciarJogo();
		} else {
			System.out.println("Obrigado por jogar !");
		}
	}
	
	public void getNomeJogador() {
		jogador.perguntaNome();
	}
	public void Regras() {
		jogador.verRegras();
	}
}