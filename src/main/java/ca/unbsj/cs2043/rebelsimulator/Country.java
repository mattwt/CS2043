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
	
	/* Multi-party system
	Government[] parties;
	Government rParty;
	*/
	Government gov;
	Population pop;
	String name;
	double baseRevolt, revolt, sizeMod, tech;
	int ID, troops;	//troops measured in thousands
	
	public Country(String n, double BR, double size, double tc, int tr, int d, Government g, Population p) {
		name = n;
		baseRevolt = BR; sizeMod = size; tech = tc;
		ID = d; troops = tr;
		gov = g;
		pop = p;
		init();
	}
	
	public void init() {
		//gov.init();
		//pop.init();
		//other shit
	}
	
	public void tick() {
		//recalc revolt and call pops/gov recalc
	}
	
}
