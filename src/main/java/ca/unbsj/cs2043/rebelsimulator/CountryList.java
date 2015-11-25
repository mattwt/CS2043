package ca.unbsj.cs2043.rebelsimulator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class CountryList implements Iterable<Country> {
	
	Country[] cList;
	
	CountryList (int paramNum) {
		boolean hasNext = true;
		boolean onParam = false;
		String line = "";
		String name = "";
		int cNum = 0, curParam = 0;
		String[] params = new String[paramNum];
		
		try {
			BufferedReader cbr = new BufferedReader(new FileReader("c_list"));
			while (hasNext) {
				line = cbr.readLine();
				if (line == null) {
					hasNext = false;
				}
				else {
					if (!onParam) {
						if (line.matches("(:)(.*)") && !onParam) {
							name = line.substring(line.indexOf(':') + 1);
						}
						else if (line.matches("{") && !onParam) {
							onParam = true;
						}
						else {
							throw new IOException();
						}
					}
					if (onParam) {
						if (line.matches("(.*)(;)")) {
							
							//logic to assign params here
							
							curParam++;
						}
						else if (line.matches("}")) {
							onParam = false;
							cNum++;
							curParam = 0;
							
							//do construction here
							
						}
						else {
							throw new IOException();
						}
					}
				}
			}
		}
		catch (FileNotFoundException e) { 
			System.err.println("File missing");
		}
		catch (IOException f) {
			System.err.println("File reading had problems");
		}
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

