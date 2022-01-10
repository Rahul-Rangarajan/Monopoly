
public class Player implements Pieces
{
	private String name;
	private int location;
	private int money;
	private boolean injail;
	private int num;
	public boolean jailcard;
	public Player(String n, int l, int m, boolean j, int num)
	{
		name  = n;
		location = l;
		money = m;
		injail = j;
		this.num = num;
		jailcard = false;
	}
	public String getName() 
	{
		return name;
	}
	public int getN()
	{
		return num;
	}
	public int getMoney() 
	{
		return money;
	}
	public void addMoney(int m)
	{
		money = money + m;
	}
	public void subMoney(int m)
	{
		money = money -m;
	}
	public int getLocation()
	{
		return location;
	}

	public boolean getJailCard()
	{
		return jailcard;
	}
	public void setJailCard(boolean jc)
	{
		jailcard = jc;
	}
	public void setLocation(int l)
	{
		location = l;
	}
	public boolean getinJail()
	{
		return injail;
	}
	public void setinJail(boolean j)
	{
		injail = j;
	}
	public void setOwner(String human) 
	{
		name = human;
	}

}




