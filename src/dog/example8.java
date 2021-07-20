package dog;

import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rectangle = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number=");
		float breath=rectangle.nextFloat();
		
		System.out.println("Enter the 2nd Number=");
		float Length=rectangle.nextFloat();
		
		System.out.println("Area of rectangle="+(Length*breath));
		System.out.println("Perimeter of rectangle="+(2*(Length+breath)));
	}

}
