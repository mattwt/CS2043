/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbsj.cs2043.rebelsimulator;

/**
 *
 * @author Zach
 */
public class Organization {
	
	Ideology ideo;
	Country[] owned = new Country[20];
	TechTree techTree = new TechTree(5);
	String name;
	long money;
	int ID;
	
	public Organization(Ideology i, Country c, String n, long m, int cid) {
		ideo = i;
		owned[0] = c;
		name = n;
		money = m;
		ID = cid;
	}
	
	/*
	public 
	
	
	*/
	
}
