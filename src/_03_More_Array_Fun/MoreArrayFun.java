package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String []s = new String [5];
		s[0]= "dog";
		s[1]= "sports";
		s[2]= "music";
		s[3]="Koolio";
		s[4]= "no";
				
		stringprint(s);
	stringreverse(s);
	stringeveryother(s);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	public static void  stringprint(String[] array) {
		
		for (int i = 0; i < array.length; i++) {
			 System.out.println("The string is " + array[i]);
		}
		
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	public static void stringreverse(String[] strings) {
		for (int i = strings.length-1; i >= 0; i--) {
			System.out.println( "The reverse string order is " + strings[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void stringeveryother(String[] stringsarray) {
		for (int i = 0; i < stringsarray.length; i++) {
			
			if(i%2 ==0) {
				System.out.println("Every Other String is " + stringsarray[i]); 
			}
			
			
			
		
		
		
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	}
}
