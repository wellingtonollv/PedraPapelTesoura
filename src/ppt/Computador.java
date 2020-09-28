package ppt;

import java.util.Random;

public class Computador {
	
	public int getInput() {
		Random random = new Random();
		int input = random.nextInt(3) + 1;
		return input;
	}
}