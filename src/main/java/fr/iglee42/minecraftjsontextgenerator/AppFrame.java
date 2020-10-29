package fr.iglee42.minecraftjsontextgenerator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppFrame extends JFrame {
	public AppFrame() {
		this.setSize(950, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p = new AppPanel();
		this.setContentPane(p);
		//this.add(new AppPanel());
		this.setVisible(true);
	}
}
