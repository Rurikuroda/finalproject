package JankenGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Player implements ActionListener{
	public static void createButton(JPanel footerPanel) {
		footerPanel.setLayout(new GridLayout(1, 4));
		
		JButton btnGu = new JButton("ROCK");
		btnGu = setButton(btnGu);
		btnGu.setForeground(Color.BLACK);
		btnGu.setBackground(Color.WHITE);
		btnGu.setBorder(new LineBorder(Color.BLACK, 2, true));
		footerPanel.add(btnGu);//, BorderLayout.WEST);
		
		JButton btnChoki = new JButton("SCISSORS");
		btnChoki = setButton(btnChoki);
		btnChoki.setForeground(Color.BLACK);
		btnChoki.setBackground(Color.WHITE);
		btnChoki.setBorder(new LineBorder(Color.BLACK, 2, true));
		footerPanel.add(btnChoki);//, BorderLayout.CENTER);
		
		JButton btnPa = new JButton("PAPER");
		btnPa = setButton(btnPa);
		btnPa.setForeground(Color.BLACK);
		btnPa.setBackground(Color.WHITE);
		btnPa.setBorder(new LineBorder(Color.BLACK, 2, true));
		footerPanel.add(btnPa);//, BorderLayout.EAST);
		
		JButton exitButton = new JButton("RESULT");
		exitButton = setButton(exitButton);
		exitButton.setForeground(Color.BLACK);
		exitButton.setBackground(Color.WHITE);
		exitButton.setBorder(new LineBorder(Color.BLACK, 2, true));
		footerPanel.add(exitButton);
		
	}
	
	public static JButton setButton(JButton button) {
		int buttonSizeX = (500 - 20)/4;
		Dimension buttonDimension = new Dimension(buttonSizeX, 50);
		button.setPreferredSize(buttonDimension);
		Font buttonFont = new Font("Arial", Font.BOLD|Font.ITALIC, 15);
		button.setFont(buttonFont);
		
		
		Player player = new Player();
		button.addActionListener(player);
		
		return (button);
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		int playerHand = 0;
		if(command.equals("ROCK")) playerHand = 1;
		else if(command.equals("SCISSORS")) playerHand = 2;
		else if(command.equals("PAPER")) playerHand = 3;
		else if(command.equals("RESULT"))playerHand = 4;
		
		int computerHand = Computer.decidesComputerHand();
		VictoryOrDefeat.decisionVictoryOrDefeat(computerHand, playerHand);
		
		
		
	}

}
