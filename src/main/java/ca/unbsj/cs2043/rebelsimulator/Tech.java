package ca.unbsj.cs2043.rebelsimulator;

import java.util.Arrays;

public class Tech {
	
	String name;
	double[] modifiers;
	double currentMod;
	double specialMod;
	int level;
	String[] flavor;
	boolean max = false;
	
	public Tech(String n, String[] fla, double[] mods, double spec) {
		name = n;
		flavor = Arrays.copyOf(fla, fla.length);
		modifiers = Arrays.copyOf(mods, mods.length);
		specialMod = spec;
		level = 0;
		currentMod = modifiers[level];
	}
	
	//return false if at max level, 
	//else upgrade and return true
	public boolean upgrade() {
		if (max) {
			return false;
		}
		else {
			if (++level == flavor.length-1) {
				max = true;
			}
			
			currentMod = modifiers[level];
			
			return true;
		}
	}
	
	public int getLevel() {return level;}
	
	public double getModifier() {return currentMod;}
	
	//POSSIBLE NULL POINTER EXCEPTION
	public String getNextFlavor() {
		if (!max) {
			return flavor[level+1];
		}
		else {
			return flavor[level];
		}
	}
	
	public double getSpecialMod() {
		if (max) return specialMod;
		else return 0.0;
	}
	
	
}
