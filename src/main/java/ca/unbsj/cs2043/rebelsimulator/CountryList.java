package ca.unbsj.cs2043.rebelsimulator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class CountryList implements Iterable<Country> {
	
	Country[] cList;
	
	//Constructor does the work of initialize() conceptual method
	CountryList (int paramNum) {
		boolean hasNext = true;
		boolean onParam = false;
		String line = "";
		String name = "";
		int cNum = 0, errorCode = 0;
		
		// params we want
		int pop = 0, size = 0, troops = 0, tech = 0, pide = -1, gide = -1;
		double br = -1, rp = -1, su = -1, gs = -1, coh = -1;
		double ga = 100, gr = 100, gm = 100, gt = 100;
		double pa = 100, pr = 100, pm = 100, pt = 100;
		Ideology govIdeo, popIdeo;
		Government government;
		Population population;
		
		try {
			// magic
			BufferedReader cbr = new BufferedReader(new FileReader(CountryList.class.getClassLoader()
                              .getResource("c_list").getPath()
                              .replaceAll("%20", " ")));
			errorCode = 1;
			while (hasNext) {
				line = cbr.readLine();
				errorCode = 2;
				if (line == null) {
					hasNext = false;
				}
				else {
					if (!onParam) {
						if (line.matches("(:)(.*)") && !onParam) {
							errorCode = 3;
							name = line.substring(line.indexOf(':') + 1);
						}
						else if (line.matches("{") && !onParam) {
							onParam = true;
						}
						else {
							errorCode = 4;
							throw new IOException();
						}
					}
					if (onParam) {
						if (line.matches("(.*)(;)")) {
							errorCode = 5;
							String param, data;
							int eq = line.indexOf('=');
							int semi = line.indexOf(';');
							param = line.substring(0, eq).trim();
							data = line.substring(eq+1, semi-1).trim();
							Double in = Double.parseDouble(data);
							
							errorCode = 6;
							if (param.matches("[pP]op")) {
								try {
									pop = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[sS]ize")) {
								try {
									size = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[tT]roops")) {
								try {
									troops = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[tT]ech")) {
								try {
									tech = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[pP]ide")) {
								try {
									pide = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[gG]ide")) {
								try {
									gide = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[bB]r")) {
								try {
									br = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[rR]p")) {
								try {
									rp = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[sS]u")) {
								try {
									su = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[gG]s")) {
								try {
									gs = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[cC]oh")) {
								try {
									coh = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[gG]a")) {
								try {
									ga = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[gG]r")) {
								try {
									gr = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[gG]m")) {
								try {
									gm = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[gG]t")) {
								try {
									gt = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[pP]a")) {
								try {
									pa = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[pP]r")) {
								try {
									pr = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[pP]m")) {
								try {
									pm = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (line.matches("[pP]t")) {
								try {
									pt = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else {
								errorCode = 8;
								throw new IOException();
							}
						}
						else if (line.matches("}")) {
							errorCode = 8;
							
							if (pop > 0 && size > 0 && troops >= 0 && tech > 0 && 
									br >= 0 && rp >= 0 && su >= 0 && gs >= 0 && coh >= 0) {
								population = new Population(br, rp, su, gs, pide, "", pa, pr, pm, pt);
								government = new Government(gide, "", coh, su, ga, gr, gm, gt);
								cList[cNum] = new Country(name, troops, size, pop, tech, government, population);
							}
							else {
								throw new IOException();
							}
							
							// reset, since we're done now
							pop = size = troops = tech = 0;
							pide = gide = -1;
							br = rp = su = gs = coh = -1;
							ga = gr = gm = gt = 100;

							cNum++;
						}
						else {
							errorCode = 9;
							throw new IOException();
						}
					}
				}
			}
		}
		catch (FileNotFoundException e) {
			System.err.println("Files missing, code " + errorCode);
		}
		catch (IOException f) {
			System.err.println("File reading had problems, code " + errorCode);
		}
		catch (NullPointerException np) {
			System.err.println("List had more parameters than what was specified.");
		}
	}
	
	public void tick() {
		//write tick stuff here
	}
	
	//getters/setters
	public Country getCountry(int ID) {return cList[ID];}
	
	public Country exists(String name) {
		for (int i = 0; i < cList.length; i++) {
			if (cList[i].name.equals(name)) {
				return cList[i];
			}
		}
		return null;
	}
	
	public Iterator<Country> iterator() {
		return new CountryIterator();
	}
	
	//Debugging to check country names
	@Override
	public String toString() {
		String ret = "";
		for (int i = 0; i < cList.length; i++) {
			if (i == 0) {
				ret += cList[i].name;
			}
			else {
				ret += ", " + cList[i].name;
			}
		}
		return ret;
	}
	
	class CountryIterator implements Iterator<Country>  {
		
		int i = 0;
		
		public boolean hasNext() {
			if (i > cList.length) {return true;}
			else {return false;}
		}
		public Country next() {
			return cList[++i];
		}
		public void remove() {
			//not implemented
		}
	}
}

