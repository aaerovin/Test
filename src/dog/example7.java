package dog;

import java.util.Scanner;

public class example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner average= new Scanner(System.in);
		
		System.out.println("Enter the 1st Number=");
		int Num1= average.nextInt();
		
		System.out.println("Enter the 2nd Number=");
		int Num2= average.nextInt();
		
		System.out.println("Enter the 3rd Number=");
		int Num3= average.nextInt();
		
		int Average=(Num1+Num2+Num3)/3;
		System.out.println("Average="+Average);

	}

}
