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
		
		String[] part = enter.split(caraC);
		StringBuilder build = new StringBuilder();
		for (String p : part) {
			String pNoC = p.substring(1);
			build.append("{\"text\":\" " + pNoC + "\",\"color\":\" \"},");
			
		}
	}
} 
enum McColor
{
	BLACK("black", "0"),
	DARK_BLUE("dark_blue", "1"),
	DARK_GREEN("dark_green", "2"),
	DARK_AQUA("dark_aqua", "3"),
	DARK_RED("dark_red", "4"),
	DARK_PURPLE("dark_purple", "5"),
	GOLD("gold", "6"),
	GRAY("gray", "7"),
	DARK_GRAY("dark_gray", "8"),
	BLUE("blue", "9"),
	GREEN("green", "a"),
	AQUA("aqua", "b"),
	RED("red","c"),
	LIGHT_PURPLE("light_purple", "d"),
	YELLOW("yellow", "e"),
	WHITE("white", "f");


	
	
	private String jsonName,code;
	
	private McColor(String jName, String c) {
		this.jsonName = jName;
		this.code = c;
	}

	public String getJsonName() {
		return jsonName;
	}

	public String getCode() {
		return code;
	}
	
	public static McColor getByCode(String code) {
		for (McColor c : values()) {
			if (c.getCode().equalsIgnoreCase(code)) {
				return c;
			}
		}
		return WHITE;
	}
}
