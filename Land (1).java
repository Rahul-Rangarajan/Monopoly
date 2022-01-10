
public class Land extends SquareType
{
	private String name;
	private int landnum;
	private int cost;
	private int sell;
	private int rent1;
	private int rent2;
	private int rent3;
	private int rent4;
	private int rent5;
	private int rent6;
	private int housenum;
	private int owner;
	private int buildcost;
	public Land(int ln, String n, int c, int s, int hn, int r, int r2, int r3, int r4, int r5, int r6, int o, int bc)
	{
		landnum = ln;
		name = n;
		cost = c; 
		sell = s;
		housenum = hn;
		rent1 = r;
		rent2 = r2;
		rent3 = r3;
		rent4 = r4;
		rent5 = r5;
		rent6 = r6;
		owner = o;
		buildcost = bc;
	}
	public int getLandNum()
	{
		return landnum;
	}
	public String getName()
	{
		return name;
	}
	public int getCost()
	{
		return cost;
	}
	public int getSell()
	{
		return sell;
	}
	public int getHousenum()
	{
		return housenum;
	}
	public int getbuildCost()
	{
		return buildcost;
	}
	public int getRent1() 
	{
		return rent1;
	}
	
	public int getRent2()
	{
		return rent2;
	}
	public int getRent3() 
	{
		return rent3;
	}
	
	public int getRent4()
	{
		return rent4;
	}
	public int getRent5() 
	{
		return rent5;
	}
	
	public int getRent6()
	{
		return rent6;
	}	
	public int getOwner() 
	{
		return owner;
	}
	public void setHouseNum(int hn)
	{
		housenum = housenum + hn;
	}
	 public void setOwner(int owner)
	 {
		this.owner=owner;
	 }
	

}


