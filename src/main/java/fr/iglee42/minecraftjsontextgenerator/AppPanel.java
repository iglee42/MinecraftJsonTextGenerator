package fr.iglee42.minecraftjsontextgenerator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppPanel extends JPanel {

	private JTextField enterText = new JTextField();
	private JTextField colorCara = new JTextField();
	private JButton valideButton = new JButton("Valider");
	private JTextField result = new JTextField("result");
	public AppPanel() {
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		enterText.setBounds(20, 20, 800, 50);
		enterText.setFont(enterText.getFont().deriveFont(30f));
		this.add(enterText);
		
		colorCara.setBounds(850, 20, 50, 50);
		colorCara.setFont(colorCara.getFont().deriveFont(50f));
		colorCara.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (colorCara.getText().length()+1 >= 2)
					e.consume();
			}
		});
		this.add(colorCara);
		
		result.setBounds(20, 200, 890, 50);
		result.setFont(result.getFont().deriveFont(30f));
		result.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				e.consume();
			}
			@Override
			public void keyPressed(KeyEvent e) {
				e.consume();
			}
		});
		result.setVisible(false);
		this.add(result);
		
		valideButton.setBounds(400, 100, 100, 50);
		valideButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				App.translate(enterText.getText(), colorCara.getText(), result);
			}
		});
		this.add(valideButton);
		
	}
	
}
