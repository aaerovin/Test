package dog;

import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	Scanner Multiply = new Scanner(System.in);	
	System.out.println("Enter the  number");
	
	int y=Multiply.nextInt();
		int i,num;
 
 for(i=1;i<=100;i++)
 {
		 num=i*y;
		 System.out.println(i+"*"+y+"="+num);
 }

	}

}
