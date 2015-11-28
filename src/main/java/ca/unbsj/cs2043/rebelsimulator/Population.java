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
public class Population {
	
	Ideology ideo;
	String name;
	double baseRevolt, revolt, richPercent, govSupport, orgSupport, suppression;
	boolean inRevolt = false;
	boolean isSuppressed = false;
	
	public Population(String n, double br, double rp, double su, double gs, 
			int id, String un, double auth, double right, double trad, double mili) {
		ideo = new Ideology(id, un, auth, right, mili, trad);
		name = n;
		baseRevolt = br;
		richPercent = rp;
		suppression = su;
		govSupport = gs;
		//calc();
	}
	
	public Population(Ideology i, String n, double br, double rp, double su, double gs) {
		ideo = i;
		name = n;
		baseRevolt = br;
		richPercent = rp;
		suppression = su;
		govSupport = gs;
		//calc();
	}
	
	
}
