/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbsj.cs2043.rebelsimulator;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Zach
 */
public class mainDriver {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		// Temps, readers, and counters
		Scanner scan = new Scanner(System.in);
		String temp = "";
		String[] userParams = new String[20];
		String turnLabel, monthName, year;
		int turnCounter = 0, month = 0;
		boolean valid1 = false, valid2 = false;
		boolean cycle = true;
		
		// Organization vars
		double a = 0.0, r = 0.0, m = 0.0, t = 0.0;
		String orgIdeoName = "";
		int orgIdeoClass = -1;
		String orgName = "";
		Organization playerOrg;
		
		// Country(List) vars
		String startCountryName;
		CountryList countryList = new CountryList(6);	// CHANGE 6 TO MORE APPROPRIATE VAL LATER
		
		// Gathering info to make the organization
		System.out.print("What is your organization's name?/n > ");
		orgName = scan.nextLine();
		while (!valid1) {
			System.out.print("Do you want a premade ideology? (Y/N) /n > ");
			temp = scan.nextLine();
			if (temp.equals("Y")) {
				// PRE-MADE IDEOLOGY
				while (!valid2) {
					System.out.print("Type a number corresponding to the ideology you want."
							+ "/n  1 - Communist/n  2 - National Socialist/n  3 - Social Libertarian"
							+ "/n  4 - Anarcho-Communist/n  5 - Libertarian/n  6 - Environmentalist"
							+ "/n  7 - Reactionary/n  8 - Religious/n  9 - Neoliberal/n > ");
					try {
						temp = scan.nextLine();
						orgIdeoClass = Integer.parseInt(temp);
					}
					catch (Exception e) {
						System.out.println(temp + " is not an integer input.");
					}
					if (orgIdeoClass > 0 && orgIdeoClass < 10) {
						valid2 = true;
					}
				}
				valid1 = true;
			}
			else if (temp.equals("N")) {
				// USER-MADE IDEOLOGY
				orgIdeoClass = 0;
				System.out.print("What is your ideology's name?/n > ");
				orgIdeoName = scan.nextLine();
				System.out.println("Enter a number between 100 and -100 for the following values."
						+ "/n100 means your organization agrees with the first value the most, and"
						+ "/b-100 means your organization agrees with the second value the most.");
				while (!valid2) {
					try {
						System.out.print("Authoritarian vs Democratic: ");
						a = ((double) scan.nextInt())/100;
						System.out.print("Rightist vs Leftist: ");
						r = ((double) scan.nextInt())/100;
						System.out.print("Militarist vs Peaceful: ");
						m = ((double) scan.nextInt())/100;
						System.out.print("Traditional vs Liberal");
						t = ((double) scan.nextInt())/100;
						if (Math.abs(a) > 1 || Math.abs(r) > 1 || Math.abs(m) > 1 || Math.abs(t) > 1) {
							throw new IOException();
						}
						valid2 = true;
					}
					catch (Exception e) {
						System.out.println("Input was not valid, please re-enter.");
					}
				}
				valid1 = true;
			}
			else {
				System.out.println(temp + " is not a recognized input.");
			}
		}
		
		valid1 = false; valid2 = false; //reset temps
		
		// build country list here
		
		// getting starting country
		while (valid1) {
			System.out.print("What country would you like to start in?/n > ");
			startCountryName = scan.nextLine();
			for (Country i : countryList) {
				if (i.name == startCountryName) {
					valid1 = true;
				}
			}
			if (!valid1) {
				System.out.println("That country isn't playable");
			}
		}
		
		playerOrg = new Organization(new Ideology(orgIdeoClass, orgIdeoName, a, r, m ,t), orgName, 1);
		
		// // REPLACE THE 1 IN ORG CONSTRUCTOR WITH VALUE DERIVED FROM STARTING COUNTRY INPUT - PLZ DONT FORGET // //
		
		
		valid1 = false; valid2 = false; //reset temps
		
		System.out.print("Welcome to the game! Type \"help\" to get started.\n");
		// main loops
		while (cycle) {
			month = turnCounter % 12;
			year = "" + turnCounter / 12 + 2016;
			
			switch (month) {
				case 0: monthName = "January";
					break;
				case 1:monthName = "Feburary";
					break;
				case 2: monthName = "March";
					break;
				case 3: monthName = "April";
					break;
				case 4: monthName = "May";
					break;
				case 5: monthName = "June";
					break;
				case 6: monthName = "July";
					break;
				case 7: monthName = "August";
					break;
				case 8: monthName = "September";
					break;
				case 9: monthName = "October";
					break;
				case 10: monthName = "November";
					break;
				case 11: monthName = "December";
			}
			
			turnLabel = month + ", " + year;
			System.out.println("------ " + turnLabel + " ------");
			
			while (!valid1) {
				System.out.print(" > ");
				temp = scan.nextLine();
				// Trim, strip out space-delimited substrings here
				temp = temp.trim();
				try {
					userParams = temp.split(" ");
					valid1 = true;
				}
				catch (Exception e) {
					System.out.println("Command not recognized, too many parameters. Try typing \"help\".");
				}
			}
			
			// get user commands bit-by-bit here
			
			valid1 = false; //reset temp
			
			turnCounter++;
		}
		
	}
	
}
