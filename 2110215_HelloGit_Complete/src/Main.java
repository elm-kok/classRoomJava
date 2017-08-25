import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		greet("Phakhin Deesee");
		getRectangleArea();
	}
	
	private static void greet(String name){
		System.out.println("Hello, Git");
		System.out.println("I am " + name );
	}
	
	private static void getRectangleArea(){
		int width, height;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rectangle width: ");
		width = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter rectangle height: ");
		height = Integer.parseInt(scanner.nextLine());
		
		System.out.println("The rectangle area is " + new Rectangle(width, height).getArea());
	}
}
