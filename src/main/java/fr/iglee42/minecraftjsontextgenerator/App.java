package fr.iglee42.minecraftjsontextgenerator;

import javax.swing.JTextField;

public class App 
{
	public static AppFrame frame;
    public static void main( String[] args )
    {
    	frame = new AppFrame();
    }
	public static void translate(String enter, String caraC, JTextField result) {
		
		
		
		result.setText(enter);
		result.setVisible(true);
	}
}
