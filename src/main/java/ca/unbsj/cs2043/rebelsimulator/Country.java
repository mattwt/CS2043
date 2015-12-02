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
	boolean orgSupportingRevolt;
	//troops, size, and pop in thousands
	int troops, population, size, techLevel;
	
	public Country(String n, int soldiers, int s, int p, int t, 
			Government g, Population po) {
		name = n;
		density = ((double) p) / s; 
		population = p;
		size = s;
		troops = soldiers;
		techLevel = t;
		pop = po;
		gov = g;
	}
	
	public void starter() {
		owned = true;
		hasAgent = true;
		gov.orgSupport = 1;
	}
	
	void suppressUpdate() {
		pop.suppression += (((double) techLevel)/5 + gov.ideo.auth + gov.ideo.mili +
				((double) troops)/1000 + gov.cohesion) / 10;
	}
	
	void updateRevolt() {
		
	}
	
	public void incGovSupport(double mod) {
		
	}
	
	public void incPopSupport(double mod) {
		
	}
	
	public void sendAgent() {hasAgent = true;}
	
	public boolean hasAgent() {return hasAgent;}
	
	public void tick() {
		// Suppression chance
		
		
		if (Math.random() > (pop.revolt + Math.pow(gov.ideo.mili, 3))) {
			suppressUpdate();
		}
		
		
	}
	
	
}
