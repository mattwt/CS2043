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
	double cohesion, orgSupport;
	
	public Government(Ideology i, String n, double c, double s) {
		ideo = i;
		cohesion = c;
		orgSupport = s;
	}
	
	public Government(int id, String un, double c, double s,
			double a, double r, double m, double t) {
		ideo = new Ideology(id, un, a, r, m, t);
		cohesion = c;
		orgSupport = s;
	}
	
	
}
