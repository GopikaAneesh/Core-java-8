package userinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		String name;
		int age;
		char gen;
		float fees;
		
		Scanner sc=new Scanner(System.in);
		//User input
		
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the age:");
		age=sc.nextInt();
		System.out.println("Enter the gender M/F:");
		gen=sc.next().charAt(0);
		System.out.println("Enter the fees:");
		fees=sc.nextFloat();
		
		//Output Console
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gen);
		System.out.println("Fees:"+fees);
	}

}
