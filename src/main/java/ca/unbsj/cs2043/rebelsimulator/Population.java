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
	
	Government gov;
	Country con;
	Ideology ideo;
	String name;
	double baseRevolt, revolt, popAmt, richPoor, support;
	boolean inRevolt = false;
	boolean isSuppressed = false;
	
	public Population(Ideology i, Government g, Country c, String n, 
			double br, double r, double pa, double ly, double s, double rp) {
		ideo = i; gov = g; con = c; 
		name = n; baseRevolt = br; popAmt = pa; richPoor = rp;	//seperate calc for these??
		//calc(r);
	}
	
	public void calc(double rev) {
		if (!inRevolt && revolt > 0.5) {
			if ((Math.pow(revolt * Math.random(), 4)) > revolt) {
				inRevolt = true;
			}
		}
		else if (inRevolt) {	//50% chance of ending every tick
			if ((Math.random() > 0.75)) {
				inRevolt = false;
			}
		}
		
		//calcSupport();
		//calcRevolt();
		
	}
	
	public void calcSupport() {
		double df = ideo.diff(gov.ideo);
		support = df + richPoor;
		
	}
	
	public void calcRevolt() {
		
	}
	
	public double getRevolt() {return revolt;}
	
	public double getSupport() {return support;}
		
}
