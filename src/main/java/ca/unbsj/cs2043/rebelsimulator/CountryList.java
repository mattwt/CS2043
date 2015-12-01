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
		int cNum = 0, curParam = 0, errorCode = 0;
		String[] params = new String[paramNum];
		
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
							param = line.substring(0, eq-1).trim();
							data = line.substring(eq+1, semi-1).trim();
							Double in = Double.parseDouble(data);
							
							errorCode = 6;
							//logic to assign params using 'in' here
							
							curParam++;
						}
						else if (line.matches("}")) {
							errorCode = 7;
							onParam = false;
							cNum++;
							curParam = 0;
							
							//do construction here
							
						}
						else {
							errorCode = 8;
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
			System.err.println("Constructor build content was: ");
			String cons = "Line: " + line + "; Name: " + name + "; \nParams: " + params.toString();
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

