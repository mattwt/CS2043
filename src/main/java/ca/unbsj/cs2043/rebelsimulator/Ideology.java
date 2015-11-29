/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.unbsj.cs2043.rebelsimulator;

import java.math.*;

/**
 *
 * @author Zach
 */
public class Ideology {
	
	String name;
	String shName;
	double radism;	// based on total radicalism of each position
	double auth;	//authoritarian (pos) vs libertarian (neg)
	double right;	//right (pos) vs left (neg)
	double mili;	//militarist (pos) vs pacifist (neg)
	double trad;	//traditional (pos) vs modernist (neg)
	
	Ideology(int ide, String uName, double a, double r, double m, double t) {
		switch (ide) {
			case 0:	name = uName;
				shName = "user";
				//user's ideology
				auth = a;
				right = r;
				mili = m;
				trad = t;
				break;
			case 1: name = "Communist";
				shName = "comm";
				//communist
				auth = 0.97;
				right = -0.89;
				mili = 0.8;
				trad = -0.6;
				break;
			case 2: name = "National Socialist";
				shName = "nasoc";
				//Fascist
				auth = 0.93;
				right = 0.7;
				mili = 0.92;
				trad = 0.73;
				break;
			case 3: name = "Social Libertarian";
				shName = "solib";
				//means of production owned by population
				auth = -0.95;
				right = -0.82;
				mili = -0.3;
				trad = -0.76;
				break;
			case 4: name = "Anarcho-Communist";
				shName = "ancom";
				//no state, common ownership of means of prod.
				auth = -0.88;
				right = -0.94;
				mili = 0.7;
				trad = -0.76;
				break;
			case 5: name = "Libertarian";
				shName = "liber";
				//free market, small government
				break;
			case 6: name = "Environmentalist";
				shName = "envir";
				//
				break;
			case 7: name = "Reactionary";
				shName = "react";
				//wants to roll back reform, similar to religious
				break;
			case 8: name = "Religious";
				shName = "relig";
				//highly traditional, support a single religion
				break;
			case 9: name = "Neoliberal";
				shName = "nelib";
				//free market, expansionist
				break;
		}
		calc();
	}
	
	public void calc() {
		//do scaled radicalism calculation
		radism = (Math.pow(Math.abs(auth), 4.0) + Math.pow(Math.abs(right), 4.0) 
				+ Math.pow(mili, 3.0) + Math.pow(Math.abs(trad), 4.0));
		
		
	}
	
	public double diff(Ideology i) {
		double a = Math.abs(auth - i.auth);
		double b = Math.abs(right - i.right);
		double c = Math.abs(mili - i.mili);
		double d = Math.abs(trad - i.trad);
		return a+b+c+d;
	}
	
	public double getMili() {return mili;}
	public double getRight() {return right;}
	public double getTrad() {return trad;}
	public double getAuth() {return auth;}
}
