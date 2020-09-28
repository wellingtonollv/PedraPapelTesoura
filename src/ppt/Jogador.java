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

	public int escolhaJogada() {
		
		System.out.println("Escolha entre PEDRA PAPEL OU TESOURA");

		String entrada = scanner.nextLine();
		entrada = entrada.toUpperCase();
		String string1 = new String("PEDRA");
		String string2 = new String("PAPEL");
		String string3 = new String("TESOURA");
		
		if (string1.equals(entrada)==true)
			return Regras.PEDRA;
		else if (string2.equals(entrada) == true)
			return Regras.PAPEL;
		else if (string3.equals(entrada)==true)
			return Regras.TESOURA;
		else {
			escolhaJogada();
			return 0;
		}
	}

	public boolean jogarNovamente() {
		
		scanner=new Scanner(System.in);
		System.out.print("Quer jogar novamente? ");
		String userInput = scanner.nextLine();
		userInput = userInput.toUpperCase();
		return userInput.charAt(0) == 'S';
	}
}