package JankenGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Panel {
	public static JLabel headerLabel;
	public static JLabel contentsLabel;
	public static void createPanel(JFrame frame) {
		
		Dimension headerPanelDimension = new Dimension(500, 90);
		JPanel headerPanel = setPanel(Color.WHITE, headerPanelDimension);
		JLabel headerLabel = new JLabel("Let's play the JANKEN !");
		headerLabel.setBorder(new LineBorder(Color.BLACK, 2, true));
		headerLabel = setFont(Color.BLACK, headerLabel, 25);
		headerPanel.add(headerLabel); //add everything
		frame.add(headerPanel, BorderLayout.NORTH); //place where want to show
		
		
		Dimension contentsPanelDimension = new Dimension(500, 500);
		JPanel contentsPanel = setPanel(Color.PINK, contentsPanelDimension);
		contentsLabel = new JLabel("ARE YOU READY ?");
		contentsLabel = setFont(Color.BLACK, contentsLabel, 50);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel, BorderLayout.CENTER);
		
		Dimension footerPanelDimension = new Dimension(500, 90);
		JPanel footerPanel = setPanel(Color.BLACK, footerPanelDimension);
		Player.createButton(footerPanel);
		frame.add(footerPanel, BorderLayout.SOUTH);
	}
	
		

		public static JPanel setPanel(Color color, Dimension PanelDimension) {
			// TODO Auto-generated method stub
			JPanel panel = new JPanel();
			panel.setPreferredSize(PanelDimension);
			panel.setLayout(new BorderLayout());
			panel.setBackground(color);
			return (panel);
		}
		
		public static JLabel setFont(Color clr, JLabel label, int strSize) {
			// TODO Auto-generated method stub
			label.setForeground(clr);
			Font labelFont = new Font("Arial", Font.BOLD|Font.ITALIC, strSize);
			label.setFont(labelFont);
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setVerticalAlignment(JLabel.CENTER);
			return (label);
		}
	}


