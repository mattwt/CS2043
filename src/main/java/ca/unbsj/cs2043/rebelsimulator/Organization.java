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
	int ID;
	
	public Organization(Ideology i, String n, long m, int cid) {
		ideo = i;
		name = n;
		money = m;
		ID = cid;
	}
	
	public boolean upgradeTech(int id) {
		boolean success = (techTree.upgradeTech(id) && canBuy(techTree.getTechCost(id)));
		
		if (success) {
			money -= techTree.getTechCost(id);
		}
		
		
		return success;
	}
	
	public boolean upgradePolicy(int id) {
		boolean success = (techTree.upgradePolicy(id) && canBuy(techTree.getPolicyCost(id)));
		
		if (success) {
			money -= techTree.getPolicyCost(id);
		}
		
		return success;
	}
	
	public boolean canBuy(long cost) {
		if (money > cost) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
