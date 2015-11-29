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
		
		// Temp and reader vars
		Scanner scan = new Scanner(System.in);
		String temp = "";
		boolean valid1 = false, valid2 = false;
		
		// Organization vars
		double a = 0.0, r = 0.0, m = 0.0, t = 0.0;
		String orgIdeoName = "";
		int orgIdeoClass = -1;
		String orgName = "";
		Organization playerOrg;
		
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
		
		// build country list here
		
		System.out.print("Which country would you like to start in?/n > ");
		//get input here for starting coutnry
		
		// Finally constructing organization
		playerOrg = new Organization(new Ideology(orgIdeoClass, orgIdeoName, a, r, m ,t), orgName, 1);
		
		// // REPLACE THE 1 IN ORG CONSTRUCTOR WITH VALUE DERIVED FROM STARTING COUNTRY INPUT - PLZ DONT FORGET // //
		
		
		valid1 = false; valid2 = false; //reset temps
		
		// main loops
		
	}
	
}
