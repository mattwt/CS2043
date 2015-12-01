/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbsj.cs2043.rebelsimulator;

import java.util.Arrays;

/**
 *
 * @author Zach
 */
public class Country {
	
	Government gov;
	Population pop;
	String name;
	double density;
	boolean owned, hasAgent;
	//troops, size, and pop in thousands
	int troops, population, size, techLevel;
	
	public Country(String n, int soldiers, int s, int p, int t, 
			int id, String un, String nm, Government g, Population po) {
		name = nm;
		density = ((double) p) / s; 
		population = p;
		size = s;
		troops = soldiers;
		techLevel = t;
		pop = po;
		gov = g;
	}
	
	public void sendAgent() {hasAgent = true;}
	
	public boolean hasAgent() {return hasAgent;}
	
	public void init() {
		
		//gov.init();
		//pop.init();
		//other shit
	}
	
	public void tick() {
		//recalc revolt and call pops/gov recalc
	}
	
	
}
