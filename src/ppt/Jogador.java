package ppt;

import java.util.Scanner;

public class Jogador {
	private String nome;
	Scanner scanner = new Scanner(System.in);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void perguntaNome() {
		System.out.println("Insira seu nome:");
		nome = scanner.nextLine();

	}

	public void verRegras() {
		System.out.println("--TESOURA ganha de PAPEL, PAPEL ganha de PEDRA e PEDRA ganha de tesoura--");
		System.out.println("-VENCE quem pontuar 3 VEZES-");
	}

	public int escolhaJogada() {

		System.out.println("Escolha entre PEDRA PAPEL OU TESOURA: ");

		String entrada = scanner.nextLine();
		entrada = entrada.toUpperCase();
		String string1 = new String("PEDRA");
		String string2 = new String("PAPEL");
		String string3 = new String("TESOURA");

		if (string1.equals(entrada) == true)
			return Juiz.PEDRA;
		else if (string2.equals(entrada) == true)
			return Juiz.PAPEL;
		else if (string3.equals(entrada) == true)
			return Juiz.TESOURA;
		else {
			escolhaJogada();
			return 0;
		}
	}

	public boolean jogarNovamente() {

		scanner = new Scanner(System.in);
		System.out.print("Quer jogar novamente? ");
		String entrada = scanner.nextLine();
		entrada = entrada.toUpperCase();		
			
		return entrada.charAt(0) == 'S';	
				
	}
}
