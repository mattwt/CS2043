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
	boolean owned = false, hasAgent = false;
	boolean orgSuppGov = false, orgSuppPop = false, orgFighting = false, orgProp = false;
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
	
	// Updates
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
		pop.revolt += gov.ideo.diff(pop.ideo) + 1;
	}
	
	public void govSupport(double mod, Ideology i) {
		if (hasAgent) {
			double increase = gov.orgSupport*mod - gov.orgSupport*(gov.cohesion*gov.ideo.diff(i)/4);
			if (increase > 0) {
				gov.orgSupport += increase;
			}
		}
		else {
			gov.orgSupport -= (gov.cohesion*gov.ideo.diff(i))/8;
		}
	}
	
	public void popSupport(double mod, Ideology i) {
		if (hasAgent) {
			double increase = pop.orgSupport*mod + pop.revolt/2 - pop.ideo.diff(i)/8 - 
					pop.orgSupport*((pop.suppression+pop.govSupport)/4);
			if (increase > 0) {
				pop.orgSupport += increase;
			}
		}
		else {
			pop.orgSupport -= (pop.govSupport*pop.suppression*pop.ideo.diff(i))/6;
		}
	}
	
	// Sending agents and doing actions
	public void sendAgent() {hasAgent = true;}
	
	public boolean hasAgent() {return hasAgent;}
	
	public void doSupportGov() {orgSuppGov = true;}
	
	public void doSupportPop() {orgSuppPop = true;}
	
	public void doOrgProp() {orgProp = true;}
	
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
		
		
		
		// Possibility to detect agent
		double detChance = (((double) techLevel)/10 + gov.cohesion/4)*(0.5-o.getPolMod(1));
		
		// Support population directly ("Robin Hood" actions)
		if (orgSuppPop) {
			if (Math.random() > detChance) {
				orgSuppPop = false;
				if (Math.random() > detChance*(0.05+o.getPolMod(1))) {
					hasAgent = false;
				}
			}
		}
		popSupport(o.getTechMod(1), o.ideo);
		
		// Support Government directly (bribes)
		if (orgSuppGov) {
			if (Math.random() > detChance) {
				orgSuppGov = false;
				if (Math.random() > detChance*(0.05+o.getPolMod(1))) {
					hasAgent = false;
				}
			}
		}
		govSupport(o.getTechMod(1), o.ideo);
		
		// Ideological drift from propaganda
		if (orgProp) {
			if (Math.random() < detChance) {
				pop.ideo.recalcDrift(o.ideo, o.techTree.policies.get(0).currentMod+0.05);
				gov.ideo.recalcDrift(o.ideo, o.techTree.policies.get(0).currentMod+0.05);
			}
			else {
				orgProp = false;
				if (Math.random() > detChance*(0.05+o.getPolMod(1))) {
					hasAgent = false;
				}
			}
		}
		
	}
	
	
}
