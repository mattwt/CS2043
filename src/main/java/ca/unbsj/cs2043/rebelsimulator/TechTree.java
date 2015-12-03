package ca.unbsj.cs2043.rebelsimulator;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

public class TechTree {
	
	ArrayList<Tech> techs = new ArrayList<>();
	ArrayList<Tech> policies = new ArrayList<>();
	
	//pass in the number of lines of flavor text per tech/policy
	//parse two files at the same time, 
	//meaning that p_tree and t_tree MUST share the same total number of lines
	public TechTree(int flavorLength) {
		try {
			File f = new File("");
			String s = f.getAbsolutePath();
			FileReader frt = new FileReader(s+"\\src\\main\\java\\ca\\unbsj\\cs2043\\rebelsimulator\\t_tree");
			FileReader frp = new FileReader(s+"\\src\\main\\java\\ca\\unbsj\\cs2043\\rebelsimulator\\p_tree");
			BufferedReader brt = new BufferedReader(frt);
			BufferedReader brp = new BufferedReader(frp);
			String tline = null, pline = null;
			String tname = null, pname = null;
			String[] tflavor = new String[flavorLength];
			String[] pflavor = new String[flavorLength];
			double[] tmods = new double[flavorLength];
			double[] pmods = new double[flavorLength];
			long[] tcost = new long[flavorLength];
			long[] pcost = new long[flavorLength];
			Boolean hasNext = true;
			
			int i = 0, n = 0;
			while (hasNext) {
				//System.out.println(n + " " + i);
				tline = brt.readLine();
				pline = brp.readLine();
				//System.out.println("tline: " + tline + ", pline: " + pline);
				
				if (tline != null && pline != null) {
					if (i == 0) {
						tname = tline;
						pname = pline;
						i++;
					}
					else if (i > 0 && i <= flavorLength) {
						//split the line around the semicolons, then
						//extract the flavor text and modifier for each file line
						int tsemicolon, psemicolon, ttilde, ptilde;
						tsemicolon = tline.indexOf(";");
						psemicolon = pline.indexOf(";");
						ttilde = tline.indexOf("~");
						ptilde = pline.indexOf("~");
						//System.out.println("tsc: " + tsemicolon + ", psc: " + psemicolon + 
						//		"\ntt: " + ttilde + ", ptt: " + ptilde);
						tflavor[i-1] = tline.substring(0, tsemicolon);
						pflavor[i-1] = pline.substring(0, psemicolon);
						//System.out.println("tflavor: " + tflavor[i-1] + ", pflavor: " + pflavor[i-1]);
						tmods[i-1] = Double.parseDouble(tline.substring(tsemicolon+1, ttilde));
						pmods[i-1] = Double.parseDouble(pline.substring(psemicolon+1, ptilde));
						//System.out.println("tmods: " + tmods[i-1] + ", pmods: " + pmods[i-1]);
						tcost[i-1] = Long.parseLong(tline.substring(ttilde+1, tline.length()-1));
						pcost[i-1] = Long.parseLong(pline.substring(ptilde+1, pline.length()-1));
						//System.out.println("tcost: " + tcost[i-1] + ", pcost: " + pcost[i-1]);
						i++;
					}
					else {
						//call tech/policy constructors with the extracted data
						techs.add(new Tech(tname, tflavor, tmods, tcost));
						policies.add(new Tech(pname, pflavor, pmods, pcost));
						i = 0;
						n++;
					}
				}
				else {
					hasNext = false;
				}
			}

			brt.close();
			brp.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("File naming probs");
		}
		catch (IOException e) {
			System.err.println("IO failiure");
		}
		catch (SecurityException se) {
			System.err.println("Security issues");
		}
		catch (PatternSyntaxException ps) {
			System.err.println("Pattern syntax wrong");
		}
		catch (Exception e) {
			System.err.println("Unknown fuckup");
		}
	}
	
	//getter/setters
	public int getTechLevel(int n) {return techs.get(n).getLevel();}
	
	public double getTechMod(int n) {return techs.get(n).getModifier();}
	
	public long getTechCost(int n) {return techs.get(n).getCost();}
	
	public boolean upgradeTech(int n) {return techs.get(n).upgrade();}
	
	public int getPolLevel(int n) {return policies.get(n).getLevel();}
	
	public double getPolMod(int n) {return policies.get(n).getModifier();}
	
	public long getPolicyCost(int n) {return policies.get(n).getCost();}
	
	public boolean upgradePolicy(int n) {return policies.get(n).upgrade();}
	
	
	
}
