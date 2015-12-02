package ca.unbsj.cs2043.rebelsimulator;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organization o = new Organization(new Ideology(2, "", 0,0,0,0), "Test Org", 1000);
		CountryList c = new CountryList();
		
		System.out.println(o.getTechMod(0) + ", " + o.money);
		o.upgradeTech(0);
		System.out.println(o.getTechMod(0) + ", " + o.money);
		c.initialize("North Korea");
		System.out.println(c.cList.get(1).name);
		System.out.println(c.exists("North Korea"));
		
	}

}
