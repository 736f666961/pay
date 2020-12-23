package b1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, User");
		
		// Ask user to enter fullname
		showFullName();
		
		// get hours
		getHours();

	}
	
	// Show fullname
	public static void showFullName() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your firstname ?");
		String firstName = scan.nextLine();
		
		System.out.println("Enter your lastname ?");
		String lastName = scan.nextLine();
		
		System.out.println("Hi, " + firstName + " " + lastName);
		
//		scan.close();
	}
	
	// get hours from user
	public static void getHours() {
		double price = 100;
		int extraHours = 0;
		double compensation = 0.0f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter hours ?");
		int totalHours = scan.nextInt();
		
		if (totalHours < 40) {
			System.out.println("1 - You will get " + totalHours*price + " MAD");
			
		}else if(totalHours >= 40 && totalHours <= 60) {
			extraHours = totalHours - 40;
			compensation = extraHours * price;
			int main = totalHours - extraHours;
			
			System.out.println("Total hours: " +totalHours);
			System.out.println("Extra hours: " + extraHours);
			System.out.println("main hours: " + main);
			System.out.println("compensation: " + compensation);
			
			System.out.println("Your compensation is " + compensation);
			System.out.println("The final price is " + ((price*main) + compensation));
		}else {
			System.out.println("4 - Incorrect info");
		}
		
		scan.close();
	}

}
