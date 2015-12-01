package ca.unbsj.cs2043.rebelsimulator;

import java.io.*;

public class TechTree {
	
	Tech[] techs;
	Tech[] policies;
	
	//pass in the number of lines of flavor text per tech/policy
	//parse two files at the same time, 
	//meaning that p_tree and t_tree MUST share the same total number of lines
	public TechTree(int flavorLength) {
		try {
			BufferedReader brt = new BufferedReader(new FileReader(TechTree.class.getClassLoader()
					.getResource("t_tree").getPath()
                    .replaceAll("%20", " ")));
			BufferedReader brp = new BufferedReader(new FileReader(TechTree.class.getClassLoader()
					.getResource("t_tree").getPath()
					.replaceAll("%20", " ")));
			String tline = null, pline = null;
			String tname = null, pname = null;
			String[] tflavor = new String[flavorLength];
			String[] pflavor = new String[flavorLength];
			double[] tmods = new double[flavorLength];
			double[] pmods = new double[flavorLength];
			double tspec = 0.0, pspec = 0.0;
			long[] tcost = new long[flavorLength];
			long[] pcost = new long[flavorLength];
			Boolean hasNext = true;
			
			int i = 0, n = 0;
			while (hasNext) {
				tline = brt.readLine();
				pline = brp.readLine();
				
				if (tline != null && pline != null) {
					if (i == 0) {
						tname = tline;
						pname = pline;
					}
					else if (i > 0 && i < flavorLength) {
						//split the line around the semicolons, then
						//extract the flavor text and modifier for each file line
						int tsemicolon, psemicolon, ttilde, ptilde;
						tsemicolon = tline.indexOf(";");
						psemicolon = pline.indexOf(";");
						ttilde = tline.indexOf("~");
						ptilde = pline.indexOf("~");
						tflavor[i-1] = tline.substring(0, tsemicolon-1);
						pflavor[i-1] = pline.substring(0, psemicolon-1);
						tmods[i-1] = Double.parseDouble(tline.substring(tsemicolon+1, ttilde-1));
						pmods[i-1] = Double.parseDouble(pline.substring(tsemicolon+1, ptilde-1));
						tcost[i-1] = Long.parseLong(tline.substring(ttilde+1, tline.length()-1));
						pcost[i-1] = Long.parseLong(pline.substring(ptilde+1, pline.length()-1));
					}
					else if (i > flavorLength + 1) {
						tspec = Double.parseDouble(tline);
						pspec = Double.parseDouble(pline);
					}
					else {
						//call tech/policy constructors with the extracted data
						techs[n] = new Tech(tname, tflavor, tmods, tspec, tcost);
						policies[n] = new Tech(pname, pflavor, pmods, pspec, pcost);
						i = 0;
						n++;
					}
				}
				else {
					hasNext = false;
				}
				
				i++;
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
		catch (Exception e) {
			System.err.println("Unknown fuckup");
		}
	}
	
	//getter/setters
	public int getTechLevel(int n) {return techs[n].getLevel();}
	
	public double getTechMod(int n) {return techs[n].getModifier();}
	
	public long getTechCost(int n) {return techs[n].getCost();}
	
	public boolean upgradeTech(int n) {return policies[n].upgrade();}
	
	public int getPolLevel(int n) {return policies[n].getLevel();}
	
	public double getPolMod(int n) {return policies[n].getModifier();}
	
	public long getPolicyCost(int n) {return techs[n].getCost();}
	
	public boolean upgradePolicy(int n) {return policies[n].upgrade();}
	
	
	
}
