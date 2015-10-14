package Validator;
import java.util.Scanner;

public class testValidator {
	public static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args){
		
		
		System.out.println("Name?");
		String n=keyboard.nextLine();		
		int a=ageCheck();
		int b=heightCheck();
		int c=weightCheck();
		Double d=favCheck();
		System.out.println(n+"\nAge: "+a+"\nHeight: "+b+" inches\nWeight: "+c+" pounds\nFavorite Decimal: "+d);

	}
	public static int ageCheck(){
		boolean range=false;
		int age=0;
		while (range==false){
			System.out.println("Age?");
			age=keyboard.nextInt();
			if (age>=1 && age<=100) range=true;
			else{
				System.out.println("Invalid age!");
			}
		}
		return age;
	}
	public static int heightCheck(){
		boolean range=false;
		int height=0;
		while (range==false){
			System.out.println("Height?");
			height=keyboard.nextInt();
			if (height>=36 && height<=92) range=true;
			else{
				System.out.println("Invalid height!");
			}
		}
		return height;
	}
	public static int weightCheck(){
		boolean range=false;
		int weight=0;
		while (range==false){
			System.out.println("Weight?");
			weight=keyboard.nextInt();
			if (weight>=80 && weight<=400) range=true;
			else{
				System.out.println("Invalid weight!");
			}
		}
		return weight;
	}
	public static double favCheck(){
		boolean range=false;
		double fav=0;
		while (range==false){
			System.out.println("Favorite Decimal?");
			fav=keyboard.nextDouble();
			if (fav>=0 && fav<=1) range=true; 
			else{
				System.out.println("Invalid input!");
			}
		}
		return fav;
	}

}
