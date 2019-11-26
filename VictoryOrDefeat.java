package JankenGame;

public class VictoryOrDefeat {
	private static int win = 0;
	private static int lose = 0;
	public static final void decisionVictoryOrDefeat(int computerHand, int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;
		
		if(playerHand == 4) {
			String text;
			if(win > lose) text = "YOU WON !";
			else if (win < lose) text ="YOU LOSE !";
			else text = "A TIE !";
			
			Panel.contentsLabel.setText("TOTAL " + text);
			
		} else if (playerHand == computerHand) {
		} else if((playerHand == 3 && computerHand == 1)||(playerHandTemp == computerHand)) {
			win+=1;
		} else {
			lose+=1;
		}
		Panel.headerLabel.setText(win +" VS "+ lose);
	}
	
	
	
	
//	private static int point = 0;
//	public static final void decisionVictoryOrDefeat(int computerHand, int playerHand) {
//		int playerHandTemp = playerHand;
//		playerHandTemp++;
//		
//		if(playerHand == computerHand) {
//			Panel.headerLabel.setText("A TIE (" + point + ") ");
//		}
//		else if ((playerHand == 3 && computerHand == 1)||(playerHandTemp == computerHand)) {
//			point +=1;
//			Panel.headerLabel.setText("YOU WON (" + point + ") ");
//		}
//		else {
//			point = 0;
//			Panel.headerLabel.setText("YOU LOSE (" + point + ") ");
//		}
//	}

}
