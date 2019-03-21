package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		
		//1. make an array of 5 Strings
 String []greetings = new String [5];
 
		//2. print the third element in the array
System.out.println(greetings[3]);
		//3. set the third element to a different value
greetings[3] = "Hi there";
		//4. print the third element again
		System.out.println(greetings[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < greetings.length; i++) {
			greetings[i] = "Hi";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < greetings.length; i++) {
			System.out.println(greetings[i]);
		}
		//7. make an array of 50 integers
int [] numbers = new int [50];
		//8. use a for loop to make every value of the integer array a random number
Random rand = new Random();
int smallest = numbers[0];
int biggest = numbers[49];
for (int i = 0; i < numbers.length; i++) {
	

numbers[i]= rand.nextInt(50);
		//9. without printing the entire array, print only the smallest number on the array
if(numbers[i]< smallest) {
	smallest = numbers[i];
	                }}
System.out.println("smallest" + smallest );
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i < numbers.length; i++) {
System.out.println(numbers[i]);
if(numbers[i]> biggest) {
	biggest = numbers[i];
	                }}


		//11. print the largest number in the array.


	System.out.println("biggest" + biggest );
		//12. print only the last element in the array
	System.out.println("last" + numbers[49]);	
	}
}
