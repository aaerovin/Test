package dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class example12 {

	public static void main(String[] args) {
			int i;
			Scanner C= new Scanner(System.in);
			System.out.println("Print the Int values");
			
			int A[]=new int[8];
			for(i=0;i<A.length;i++)
			{
				A[i] = C.nextInt();		
				if(A[i]==A[7]) {
					break;
				}
			
			}

			
			List<Integer> Li= new ArrayList<>(A[i]);
 
				
			}
	}

}
