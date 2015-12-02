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
	double density, troPop;
	boolean owned, hasAgent;
	boolean orgSuppRevolt, orgFighting, orgProp;
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
		troPop = ((double) soldiers)/((double) p);
	}
	
	public void starter() {
		owned = true;
		hasAgent = true;
		gov.orgSupport = 1;
	}
	
	void suppressUpdate(boolean inDecay) {
		if (!inDecay) {
			pop.suppression += (((double) techLevel)/5 + gov.ideo.auth + gov.ideo.mili +
				((double) troops)/1000 + gov.cohesion/2)/10;
			if (pop.inRevolt) {
				pop.suppression += ((double) troops)/1000 + gov.ideo.mili;
			}
		}
		else {
			pop.suppression -= (pop.revolt/(gov.cohesion))/(4 + troPop);
		}
	}
	
	void updateRevolt() {
		pop.revolt += gov.ideo.diff(pop.ideo);
	}
	
	public void incGovSupport(double mod) {
		
	}
	
	public void incPopSupport(double mod) {
		
	}
	
	public void sendAgent() {hasAgent = true;}
	
	public boolean hasAgent() {return hasAgent;}
	
	public void tick(Organization o) {
		// Revolt increase chance
		if (Math.random() > pop.govSupport) {
			updateRevolt();
		}
		
		// Are we in revolt?
		if (Math.random() > pop.revolt) {
			pop.inRevolt = true;
		}
		
		// Suppression chance
		if ((Math.random() > (pop.revolt + Math.pow(gov.ideo.mili, 3)) || 
				pop.inRevolt) && pop.suppression <= 1) {
			suppressUpdate(false);
		}
		else {
			suppressUpdate(true);
		}
		
		// Send in the troops if in revolt
		
		
		
		//
		
		
		// Ideological drift from propaganda
		if (orgProp) {
			pop.ideo.recalcDrift(o.ideo, o.techTree.policies.get(0).currentMod+0.05);
			gov.ideo.recalcDrift(o.ideo, o.techTree.techs.get(0).currentMod+0.05);
		}
		
	}
	
	
}
