package ca.unbsj.cs2043.rebelsimulator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CountryList implements Iterable<Country> {
	
	ArrayList<Country> cList = new ArrayList<Country>();
	ArrayList<boolean[]> hasAction = new ArrayList<boolean[]>();
	
	//Constructor does the work of initialize() conceptual method
	CountryList () {
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
			File f = new File("");
			String s = f.getAbsolutePath();
			FileReader cfr = new FileReader(s+"\\src\\main\\java\\ca\\unbsj\\cs2043\\rebelsimulator\\c_list");
			BufferedReader cbr = new BufferedReader(cfr);
			errorCode = 1;
			while (hasNext) {
				line = cbr.readLine();
				System.out.println("cline: " + line);
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
						else if (line.matches("\\{")) {
							onParam = true;
						}
						else {
							errorCode = 4;
							throw new IOException();
						}
					}
					else if (onParam) {
						if (line.matches("(.*)(;)")) {
							errorCode = 5;
							String param, data;
							int eq = line.indexOf('=');
							int semi = line.indexOf(';');
							System.out.println("(eq: " + eq + ", semi: " + semi + ")");
							param = line.substring(0, eq).trim();
							data = line.substring(eq+1, semi).trim();
							System.out.println("(param: " + param + ", data: " + data + ")");
							
							// assigning data to its proper parameter in constructor
							errorCode = 6;
							if (param.matches("[pP]op")) {
								try {
									pop = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[sS]ize")) {
								try {
									size = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[tT]roops")) {
								try {
									troops = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[tT]ech")) {
								try {
									tech = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[pP]ide")) {
								try {
									pide = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[gG]ide")) {
								try {
									gide = Integer.parseInt(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[bB]r")) {
								try {
									br = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[rR]p")) {
								try {
									rp = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[sS]u")) {
								try {
									su = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[gG]s")) {
								try {
									gs = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[cC]oh")) {
								try {
									coh = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[gG]a")) {
								try {
									ga = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[gG]r")) {
								try {
									gr = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[gG]m")) {
								try {
									gm = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[gG]t")) {
								try {
									gt = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[pP]a")) {
								try {
									pa = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[pP]r")) {
								try {
									pr = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[pP]m")) {
								try {
									pm = Double.parseDouble(data);
								}
								catch (NumberFormatException nf) {
									throw new IOException();
								}
							}
							else if (param.matches("[pP]t")) {
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
						else if (line.matches("\\}")) {
							errorCode = 8;
							
							// is the data valid to initialize the country?
							if (pop > 0 && size > 0 && troops >= 0 && tech > 0 && 
									br >= 0 && rp >= 0 && su >= 0 && gs >= 0 && coh >= 0) {
								if (pa >= -1 && pa <= 1 && pr >= -1 && pr <= 1 && pm >= -1 && pm <= 1 &&
										pt >= -1 && pt <= 1 && pide == 1 && gide == 1) {
									population = new Population(br, rp, su, gs, pide, "", pa, pr, pm, pt);
									government = new Government(gide, "", coh, su, ga, gr, gm, gt);
									cList.add(new Country(name, troops, size, pop, tech, government, population));
								}
								else if (pide > 1 && pide <= 7 && gide > 1 && gide <= 7) {
									population = new Population(br, rp, su, gs, pide, "", pa, pr, pm, pt);
									government = new Government(gide, "", coh, su, ga, gr, gm, gt);
									cList.add(new Country(name, troops, size, pop, tech, government, population));
								}
								else {
									throw new IOException();
								}
							}
							else {
								throw new IOException();
							}
							
							// reset, since we're done now
							pop = size = troops = tech = 0;
							pide = gide = -1;
							br = rp = su = gs = coh = -1;
							pa = pr = pm = pt = 100;
							ga = gr = gm = gt = 100;
							onParam = false;
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
	
	public boolean initialize(String name) {
		Country start = exists(name);
		if (start != null) {
			boolean[] temp = new boolean[3];
			Arrays.fill(temp, false);
			for (int i = 0; i < cList.size(); i++) {
				hasAction.add(temp);
			}
			start.starter();
			return true;
		}
		else {
			return false;
		}
	}
	
	public void tick(Organization o) {
		for (Country c : cList) {
			c.tick(o);
		}
	}
	
	//getters/setters
	public Country exists(String name) {
		for (Country c : cList) {
			if (c.name.equals(name)) {
				return c;
			}
		}
		return null;
	}
	
	public Iterator<Country> iterator() {
		return new CountryIterator();
	}
	
	class CountryIterator implements Iterator<Country>  {
		
		int i = 0;
		
		public boolean hasNext() {
			if (i > cList.size()) {return true;}
			else {return false;}
		}
		public Country next() {
			return cList.get(++i);
		}
		public void remove() {
			//not implemented
		}
	}
}

