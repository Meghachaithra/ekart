package com.gqt.calculatorapplication.project;
import java.util.Scanner;

public class calculatorapplication {
	public static int num_1;
	public static int num_2;
	public static void collectInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		num_1=sc.nextInt();
		System.out.println("enetr the second number");
		num_2 = sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\twelcome to calculator");
		System.out.println("\t\t---------------------");
		System.out.println();
		System.out.println("enter the opertaion to be performed:\n"
				+"1.Addition operation\n"
				+"2.Subtraction operation\n"
				+"3.Multiplication operation\n"
				+"4.Division operation\n"
				+"5.Modulus Operation\n"
				+"6.Exit\n"
				+"7.Restart\n");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Addition operation\n");
			collectInput();
			System.out.println("the result of addition operation is:"
					+ (num_1+num_2));
			System.out.println("-------------------------------------------");
			break;
		}
		case 2:{
			System.out.println("Subtraction operation\n");
			collectInput();
			System.out.println("the result of susbtarction operation is:"
					+ (num_1-num_2));
			System.out.println("-------------------------------------------");
			break;
		}
		case 3:{
			System.out.println("Multiplication operation\n");
			collectInput();
			System.out.println("the result of Multiplication  operation is:"
					+ (num_1*num_2));
			System.out.println("-------------------------------------------");
			break;
		}
		case 4:{
			System.out.println("Division operation\n");
			collectInput();
			System.out.println("the result of division  operation is:"
					+ (num_1/num_2));
			System.out.println("-------------------------------------------");
			break;
		}
		case 5:{
			System.out.println("Modulus operation\n");
			collectInput();
			System.out.println("the result of Modulus  operation is:"
					+ (num_1%num_2));
			System.out.println("-------------------------------------------");
			break;
		}
		case 6:{
			System.out.println("Thank you...");
			System.exit(0);
		}
		case 7:{
			main(null);
		}
		}
main(null);
	}

}
