package dog;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner add = new Scanner (System.in);
     
      System.out.println("Print the 1st number");
int num1=add.nextInt();

      System.out.println("Print the 2nd number");
int num2=add.nextInt();

int num3=num1+num2;

System.out.println("Result="+ num3);
	}

}
