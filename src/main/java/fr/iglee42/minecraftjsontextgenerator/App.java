package fr.iglee42.minecraftjsontextgenerator;

import javax.swing.JLabel;

public class App 
{
	public static AppFrame frame;
    public static void main( String[] args )
    {
    	frame = new AppFrame();
    }
	public static void translate(String enter, String caraC, JLabel result) {
		
		
		result.setText(enter);
		result.setVisible(true);
	}
}
