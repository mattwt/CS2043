package ca.unbsj.cs2043.rebelsimulator;

import java.util.Arrays;

public class Event {
	
	public String name = "";
	int type;
	Object[] eff;
	
	Event(String n, int t, Object[] e) {
		name = n;
		type = t;
		eff = Arrays.copyOf(e, e.length);
	}
	
	public Object[] getEffect() {
		return eff;
	}
}
