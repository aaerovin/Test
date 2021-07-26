package dog;

public class cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Lower=0, Upper=0;

		String N ="WelCome To Java";
		
		for(int i=0;i<N.length();i++) {
			char ch = N.charAt(i);
		{
			if(ch>=65&&ch<=90) 
			{
				Upper=Upper+1;
				
		} else if(ch>=97&&ch<=122)
			
			Lower=Lower+1;		
} 
	}System.out.println("Lower = "+Lower);
	  System.out.println("Upper = "+Upper);
	  System.out.println("DONE");
	  } }