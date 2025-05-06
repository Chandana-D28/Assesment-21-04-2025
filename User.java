package com.dyashin.assignment.ecommerce;

import java.util.Scanner;

public class User {
	Scanner scanner=new Scanner(System.in);

	public static final String USERNAME="Chandana";
	public static final String EMAIL="chandana@gmail.com";
	public static final String PASSWORD="1234";
	
	public void userLogin() {
		System.out.println("Enter the Email/Username:");
		String userInput=scanner.nextLine();
		System.out.println("Enter the password:");
		String userPass=scanner.nextLine();
		if(userInput.equals(EMAIL) || userInput.equals(USERNAME) ) {
			if(userPass.equals(PASSWORD))
			System.out.println("Login Succesfull!!");
		}else {
			System.out.println("Enter valid credentials");
			System.exit(0);
		}
	}
	
}
