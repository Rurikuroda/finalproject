package JankenGame;

import java.util.Random;

public class Computer {
	public static int decidesComputerHand() {
		Random random = new Random();
		int rnd = random.nextInt(3)+1;
		if(rnd == 1) Panel.contentsLabel.setText("ROCK");
		else if(rnd == 2) Panel.contentsLabel.setText("SCISSORS");
		else if(rnd == 3) Panel.contentsLabel.setText("PAPER");
		return (rnd);
		
	}

}
