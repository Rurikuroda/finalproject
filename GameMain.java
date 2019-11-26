package JankenGame;

import javax.swing.JFrame;

public class GameMain {
	
	static JFrame frame;
	public static void main(String[] args) {
		
		frame = new JFrame("JANKEN");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null); //center of the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // can be done if click x
		frame.setResizable(false); //fixed windows' size


		Panel.createPanel(frame);
		
		frame.setVisible(true); //show the window
		}


}