package fr.iglee42.minecraftjsontextgenerator;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppPanel extends JPanel {

	private JTextField enterText = new JTextField("Entrer le texte");
	public AppPanel() {
		enterText.setBounds(5, 5, 280, 50);
		this.add(enterText);
	}
	
}
