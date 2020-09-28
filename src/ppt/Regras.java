package ppt;

public class Regras {
	
	public static final int PEDRA = 1;
	public static final int PAPEL = 2;
	public static final int TESOURA = 3;

	
	public static void display(String alguem, int escolha) {
		switch (escolha) {
		case Regras.PEDRA:
			System.out.print(alguem + " escolheu PEDRA   ");
			break;
		case Regras.PAPEL:
			System.out.print(alguem + " escolheu PAPEL   ");
			break;
		case Regras.TESOURA:
			System.out.print(alguem + " escolheu TESOURA   ");
			break;
		default:
			break;
		}
	}
	
	public static int compararEscolhas(int escolhaJogador, int escolhaComputador) {
		if(escolhaJogador==escolhaComputador) return 0;
		switch (escolhaJogador) {
		case PEDRA:
			return (escolhaComputador == TESOURA ? 1 : -1);

		case PAPEL:
			return (escolhaComputador == PEDRA ? 1 : -1);

		case TESOURA:
			return (escolhaComputador == PAPEL ? 1 : -1);
		}
		return 0;
	}
}