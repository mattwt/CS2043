package ca.unbsj.cs2043.rebelsimulator;

import java.util.Arrays;

public class Tech {
	
	String name;
	double[] modifiers;
	double currentMod;
	int level;
	String[] flavor;
	
	public Tech(String n, String[] fla, double[] mods) {
		name = n;
		flavor = Arrays.copyOf(fla, fla.length);
		modifiers = Arrays.copyOf(mods, mods.length);
		level = 0;
		currentMod = modifiers[level];
	}
	
	//return false if at max level, 
	//else upgrade and return true
	public boolean upgrade() {
		if (level > flavor.length) {
			return false;
		}
		else {
			level++;
			currentMod = modifiers[level];
			return true;
		}
	}
	
	public int getLevel() {return level;}
	
	public double getModifier() {return currentMod;}
	
	
}
