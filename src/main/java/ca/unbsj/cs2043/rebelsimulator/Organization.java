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
public class Organization {
	
	Ideology ideo;
	TechTree techTree = new TechTree(5);
	String name;
	long money;
	int actions = 3; // action counter
	
	public Organization(Ideology i, String n, long m) {
		ideo = i;
		name = n;
		money = m;
	}
	
	public boolean upgradeTech(int id) {
		boolean success = (techTree.upgradeTech(id) && canBuy(techTree.getTechCost(id)));
		
		if (success) {
			money -= techTree.getTechCost(id);
		}
		
		
		return success;
	}
	
	public boolean doAction() {
		if (actions <= 0) {
			return false;
		}
		else {
			actions--;
			return true;
		}
	}
	
	public boolean upgradePolicy(int id) {
		boolean success = (techTree.upgradePolicy(id) && canBuy(techTree.getPolicyCost(id)));
		
		if (success) {
			money -= techTree.getPolicyCost(id);
		}
		
		return success;
	}
	
	public double getTechMod(int id) {return techTree.getTechMod(id);}
	public double getPolMod(int id) {return techTree.getPolMod(id);}
	
	public boolean canBuy(long cost) {
		if (money > cost) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
