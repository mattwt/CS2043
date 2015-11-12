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
	double baseRevolt, revolt, popAmt, richPoor, support, suppression;
	boolean inRevolt = false;
	boolean isSuppressed = false;
	
	public Population(Ideology i, Government g, Country c, String n, 
			double br, double r, double pa, double ly, double s, double rp, double su) {
		ideo = i; gov = g; con = c; 
		name = n; baseRevolt = br; popAmt = pa; richPoor = rp; suppression = su;
		//calc(r);
	}
	
	public void calc(double rev) {
		if (!inRevolt && revolt > 0.5) {
			if ((Math.random() > Math.pow(revolt, 2))) {
				inRevolt = true;
			}
		}
		else if (inRevolt) {	//50% chance of ending every tick
			if ((Math.random() > 0.5)) {
				inRevolt = false;
			}
		}
		
		
		//calcSupport();
		//calcRevolt();
		
	}
	
	public void calcSupport() {
		double df = ideo.diff(gov.ideo);	//difference between ideologies
		support = support - 0.1*(df + 0.1*richPoor) + suppression;	//calc support here
	}
	
	public void calcRevolt() {
		
	}
	
	public double getRevolt() {return revolt;}
	
	public double getSupport() {return support;}
	
}
