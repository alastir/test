import java.awt.Point;


public class StringPlay {
	public static String cool = "C++ is cool";
	public static String love = "I love Java";
	public static String combine;
	
	public static Point a = new Point(1,1);
	public static Point b = new Point(1,1);
	
	public static String caps = "JAVA IS AMAZING";
	public static String nocaps = "java is amazing";
	
	public static void main(String[] args) {
		combine = love.substring(7) + " " + cool.substring(4);
		System.out.println(combine);
		
		if (a==b) {
			System.out.println("Point a equals Point b");
		} else System.out.println("Point a does not equal Point b");

		if (a.equals(b)) {
			System.out.println("Point a equals Point b");
		} else System.out.println("Point a does not equal Point b");
	
		if (caps.equals(nocaps)) {
			System.out.println("The sentences match");
		} else System.out.println("The sentences do not match");
		
		if (caps.equalsIgnoreCase(nocaps)) {
			System.out.println("The sentences match");
		} else System.out.println("The sentences do not match");
		
	}

}
