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
public class Government {
	
	Ideology ideo;
	String name;
	double support;
	int ID;
	
	public Government(Ideology d, String n, int id) {
		ideo = d;
		name = n;
		ID = id;
	}
	
	
	
}
