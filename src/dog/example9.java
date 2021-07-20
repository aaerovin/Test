package dog;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class example9 {

		  public static void main(String[] args) {
			  
			  int i,j;
			  
			  Map<String,String> mp =new LinkedHashMap<>();
			  mp.put(Key[i],Value[j]);
			  
			  Scanner Emp= new Scanner(System.in);
			  System.out.println("Get the Key names");
			  
			  String Key[]=new String[9];
			  
			  for(i=0;i<Key.length;i++)
			  {
				  Key[i] = 
			  }
			  
			  System.out.println("Get the Value names");
			  String Value[]=new String[8];
			  for(j=0;j<Value.length;j++)
			  {
				  Value[j] = Emp.next();
			  }
			  
			  Map<String,String> mp =new LinkedHashMap<>();
			  mp.put(Key[i],Value[j]);
			  			  
			  Set<Entry<String,String>> mp1=mp.entrySet();
			  for (Entry<String, String> X : mp1) {
				  System.out.println("K: "+X.getKey());
				  System.out.println("V: "+X.getValue());
			}System.out.println("\n");
			  
}}
	  

 