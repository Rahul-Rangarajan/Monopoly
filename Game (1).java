import java.util.*;import java.util.ArrayList;
public class Game 
{
	private String[] p1;private String[] p2;
	private Scanner sc;
	private ArrayList<Land> L = new ArrayList<Land>();
	private Player player1 = new Player("O", 0, 1500, false, 1);  private Player player2 = new Player("X", 0, 1500, false, 2);
	private Land l1 = new Land(1,"Mediterranean Avenue", 60, 30,0, 2, 10, 30, 90, 160, 250,0, 50);
	private Land l3 = new Land(3,"Baltic Avenue", 60, 30, 0, 4, 20, 60, 180, 320, 450,0, 50); 
	private Land l5 = new Land(5,"Reading Railroad", 200, 100, 0, 25, 50, 100, 200, 0, 0,0,0);
	private Land l6 = new Land(6,"Oriental Avenue", 100, 50, 0, 6, 30, 90, 270, 400, 550,0, 50);  
	private Land l8 = new Land(8,"Vermont Avenue", 100, 50, 0, 6, 30, 90, 270, 400, 550,0, 50);
	private Land l9 = new Land(9,"Connecticut  Avenue", 120, 60, 0, 8, 40, 100, 300, 450, 600,0, 50);  
	private Land l11 = new Land(11,"St.Charles Place", 140, 70, 0, 10, 50, 150, 450, 625, 750,0, 50);
	private Land l12 = new Land(12,"Electric Company", 150, 70, 0, 0, 0, 0, 0, 0, 0,0,0);  
	private Land l13 = new Land(13,"States Avenue", 140, 70, 0, 10, 50, 150, 450, 625, 750,0, 50);
	private Land l14 = new Land(14,"Viginia Avenue", 160, 70, 0, 12, 60, 180, 500, 700, 900,0, 50); 
	private Land l15 = new Land(15,"Pennsylvania Railroad", 200, 100, 0, 25, 50, 100, 200, 0, 0,0,0);
	private Land l16 = new Land(16,"St.James Place", 180, 90, 0, 14, 70, 200, 550, 750, 950,0, 50);  
	private Land l18 = new Land(18,"Tennessee Avenue", 180, 90, 0, 14, 70, 200, 550, 750, 950,0, 50);
	private Land l19 = new Land(19,"New York Avenue", 200, 100, 0, 16, 80, 220, 600, 800, 1000,0, 50); 
	private Land l21 = new Land(21,"Kentucky Avenue", 220, 110, 0, 18, 90, 250, 700, 875, 1050,0, 50);
	private Land l23 = new Land(23,"Indiana Avenue", 220, 110, 0, 18, 90, 250, 700, 875, 1050,0, 50); 
	private Land l24 = new Land(24,"Illinois Avenue", 240, 120, 0, 20, 100, 300, 750, 925, 1100,0, 50);
	private Land l25 = new Land(25,"B & O Railroad", 200, 100, 0, 25, 50, 100, 200, 0, 0,0,0); 
	private Land l26 = new Land(26,"Atlantic Avenue", 260, 130, 0, 22, 110, 330, 800, 975, 1150,0, 50);
	private Land l27 = new Land(27,"Ventnor Avenue", 260, 130, 0, 22, 110, 330, 800, 975, 1150,0, 50);  
	private Land l28 = new Land(28,"Water Works", 150, 75, 0, 0, 0, 0, 0, 0, 0,0,0);
	private Land l29 = new Land(29,"Marvin Gardens", 280, 140, 0, 24, 120, 360, 850, 1025, 1200,0, 50); 
	private Land l31 = new Land(31,"Pacific Avenue", 300, 150, 0, 26, 130, 390, 900, 1100, 1275,0, 50);
	private Land l32 = new Land(32,"North Carolina Avenue", 300, 150, 0, 26, 130, 390, 900, 110, 1275,0, 50); 
	private Land l34 = new Land(34,"Pennsylvania Avenue", 320, 160, 0, 28, 150, 450, 1000, 1200, 1400,0, 50);
	private Land l35 = new Land(35,"Short Line", 200, 100, 0, 25, 50, 100, 200, 0, 0,0, 0);
	private Land l37 = new Land(37,"Park Place", 350, 175, 0, 35, 175, 500, 1100, 1300, 1500,0, 50);
	private Land l39 = new Land(39,"Boardwalk", 400, 200, 0, 50, 200, 600, 1400, 1700, 2000,0, 50); 
	public Game()
	{
		p1 = new String[40];
		p2 = new String [40];
		sc = new Scanner(System.in);
	}	
	public void setBoard()
	{
		p1[0] = "X";
		p2[0] = "Y";
		for(int i = 1; i < 40; i++)
		{
			p1[i] = " ";
			p2[i] = " ";
			
		}
	}
	public void setLand()
	{
		L.add(null);L.add(l1);L.add(null);L.add(l3);L.add(null);L.add(l5);
		L.add(l6);L.add(null);L.add(l8);L.add(l9);
		L.add(null);L.add(l11);L.add(l12);L.add(l13);
		L.add(l14);L.add(l15);L.add(l16);L.add(null);
		L.add(l18);L.add(l19);L.add(null);L.add(l21);
		L.add(null);L.add(l23);L.add(l24);L.add(l25);
		L.add(l26);L.add(l27);L.add(l28);L.add(l29);
		L.add(null);L.add(l31);L.add(l32);L.add(null);
		L.add(l34);L.add(l35);L.add(null);L.add(l37);
		L.add(null);L.add(l39);
		
	}
	public void drawboard()
	{
		System.out.println(" ___________________________________________________________________");
		System.out.println("| Jail |__C__|__EC_|__C__|__C__|__R__|__D__|__CC_|__D__|__D__| FP   |");
		System.out.println("| "+p1[10]+"  "+p2[10]+" | "+p1[11]+" "+p2[11]+" | "+p1[12]+" "+p2[12]+" | "+p1[13]+" "+p2[13]+" | "+p1[14]+" "+p2[14]+" | "+p1[15]+" "+p2[15]+" | "+p1[16]+" "+p2[16]+" | "+p1[17]+" "+p2[17]+" | "+p1[18]+" "+p2[18]+" | "+p1[19]+" "+p2[19]+" | "+p1[20]+"  "+p2[20]+" |");
		System.out.println("|______|_____|_____|_____|_____|_____|_____|_____|_____|_____|______|       Key:                 ");
		System.out.println("|__B__|                                                       |__E__|       R = Railroad         ");
		System.out.println("| "+p1[9]+" "+p2[9]+" |                                                       | "+p1[21]+" "+p2[21]+" |       ? = Chance           ");
		System.out.println("|_____|                                                       |_____|       CC = Comunity Chest  ");
		System.out.println("|__B__|                                                       |__?__|       EC = Electric Company");
		System.out.println("| "+p1[8]+" "+p2[8]+" |                   |\\            /|                    | "+p1[22]+" "+p2[22]+" |       WW = Water Works    ");
		System.out.println("|_____|                   | \\          / |                    |_____|       IT = Income Tax     ");
		System.out.println("|__?__|                   ||\\\\        //||                    |__E__|       LT = Luxuy Tax     ");
		System.out.println("| "+p1[7]+" "+p2[7]+" |                   || \\\\      // ||                    | "+p1[23]+" "+p2[23]+" |       P1's Money:"+player1.getMoney()+"");   
		System.out.println("|_____|                   ||  \\\\    //  ||                    |_____|       P2's Money:"+player2.getMoney()+"");
		System.out.println("|__B__|                   ||   \\\\  //   ||                    |__E__|");
		System.out.println("| "+p1[6]+" "+p2[6]+" |                   ||    \\\\//    ||                    | "+p1[24]+" "+p2[24]+" |");
		System.out.println("|_____|                   ||     \\/     ||                    |_____|");
		System.out.println("|__R__|                   ||            ||                    |__R__|");
		System.out.println("| "+p1[5]+" "+p2[5]+" |                   ||            ||                    | "+p1[25]+" "+p2[25]+" |");
		System.out.println("|_____|                   ||            ||                    |_____|");
		System.out.println("|__IT_|                   ||            ||                    |__F__|");
		System.out.println("| "+p1[4]+" "+p2[4]+" |                                                       | "+p1[26]+" "+p2[26]+" |");
		System.out.println("|_____|                                                       |_____|");
		System.out.println("|__A__|                                                       |__F__|");
		System.out.println("| "+p1[3]+" "+p2[3]+" |                                                       | "+p1[27]+" "+p2[27]+" |");
		System.out.println("|_____|                                                       |_____|");
		System.out.println("|__CC_|         ________                     ________         |__WW_|");
		System.out.println("| "+p1[2]+" "+p2[2]+" |        |        |                   |        |        | "+p1[28]+" "+p2[28]+" |");
		System.out.println("|_____|        |    ?   |                   |   CC   |        |_____|");
		System.out.println("|__A__|        |________|                   |________|        |__F__|");
		System.out.println("| "+p1[1]+" "+p2[1]+" |                                                       | "+p1[29]+" "+p2[29]+" |");
		System.out.println("|_____|_______________________________________________________|_____|");
		System.out.println("| STRT |__H__|__LT_|__H__|__?__|__R__|__G__|__CC_|__G__|__G__|  GTJ |");
		System.out.println("| "+p1[0]+"  "+p2[0]+" | "+p1[39]+" "+p2[39]+" | "+p1[38]+" "+p2[38]+" | "+p1[37]+" "+p2[37]+" | "+p1[36]+" "+p2[36]+" | "+p1[35]+" "+p2[35]+" | "+p1[34]+" "+p2[34]+" | "+p1[33]+" "+p2[33]+" | "+p1[32]+" "+p2[32]+" | "+p1[31]+" "+p2[31]+" | "+p1[30]+"  "+p2[30]+" |");
		System.out.println("|______|_____|_____|_____|_____|_____|_____|_____|_____|_____|______|");
	}
	public void rollthedice(int t)
	{
		int die1 = (int)((Math.random()*5)+1);
		int die2 = (int)((Math.random()*5)+1);
		if(t%2==1)
		{
			if(inJail(die1,die2,player1) == true)
				makemove(die1+ die2, die1, die2, player1, t);
		}
		else 
		{
			if(inJail(die1,die2,player2)== true)
				makemove(die1+ die2, die1, die2, player2, t);
		}
		
	}
	public boolean inJail(int die1, int die2, Player p)
	{
		if(p.getinJail() == true)
		{
			if(die1 == die2)
				return true;
			else 
			{
				if(p.getJailCard() == true)
				{
					System.out.println("Would you like to use your get outta jail card?");
					String s = sc.nextLine();
					int x = 1;
					while( x == 1) {
						if(s.contains("y")) {
							x = 0;
							p.setJailCard(false);
							return true;}
						else if(s.contains("n")) {x = 0;}	else{System.out.println("Please enter y or n");s = sc.nextLine();}}
				}
				return false;
			}
				
		}
		return true;
		
	}
	public void makemove(int roll, int die1, int die2, Player p, int t) 
	{
		int a = p.getLocation();;
		int b = roll + a;
		if(b >= 40) {b-=40;}
		p.setLocation(b);
		if(t%2==1)
		{
			p1[a] = " ";
			p1[b] = "X";
			drawboard();
			System.out.println("Player 1 rolled a "+ die1 +" and "+ die2);
		}
		else if(t%2==0)
		{
			p2[a] = " ";
			p2[b] = "O";
			drawboard();
			System.out.println("Player 2 rolled a "+ die1 +" and "+ die2);
		}
		defineType(b, p, t);
	}
	public void defineType(int b, Player p, int t)
	{
		int die1 = (int) ((Math.random() * 5) +1);
		if(b == 2 || b == 17 || b == 33) {
			onCC(b, p, die1);
		}
		else if(b == 4 || b == 38)
		{
			onTax(b, p);
		}
		else if( b== 0 || b == 10 || b == 20 || b == 30) {
			onCorner(b, p);
		}
		else if(b == 7|| b == 22|| b == 36) {
			onChance(b, p, die1);
		}
		else if(b == 12 || b == 28) {
			buyLocation(L.get(b),p);
			onUtility(L.get(b-1), p, t);
		}
		else if( b == 5 || b == 15 || b == 25 || b == 35) {
			buyLocation(L.get(b),p);
			onRR(L.get(b), p, t);
		}
		else {
			buyLocation(L.get(b),p);
			onLand(L.get(b), p, t);}
		askbuildHouses(p);
	}
	public void buyLocation(Land a, Player p)
	{int x = 1;
		if(a.getOwner() == 0)
		{
			System.out.println("You have $"+p.getMoney()+". Would you like to buy "+a.getName()+ ". It costs $"+a.getCost()+". Please enter y/n");
			String s = sc.nextLine();
			while( x == 1) {
				if(s.contains("y")) {
					x = 0;
					p.subMoney(a.getCost());}
				else if(s.contains("n")) {x = 0;}	else{s = sc.nextLine();}}
				a.setOwner(p.getN());
			if(a == L.get(5) || a == L.get(15) || a == L.get(25) || a == L.get(35))
			{
				a.setHouseNum(1);
			}
		}
		
	}
	public void onLand(Land a, Player p, int t)
	{
		if(a.getOwner() != p.getN())
		{
			int rent =getRent(a.getHousenum(), a);
			System.out.println("You had to spend $" + rent +" on rent.");
			p.subMoney(rent);payRent(t, rent);
		}
	}
	public int getRent(int b, Land a)
	{
		if( b == 0)
			return a.getRent1();
		else if(b == 1)
			return a.getRent2();
		else if(b == 2)
			return a.getRent3();
		else if(b == 3)
			return a.getRent4();
		else if(b == 4)
			return a.getRent5();
		else if (b == 5) 
			return a.getRent6();
		else {}
		return 0;
	}
	public void payRent(int t, int rent)
	{
		if(t%2==1)
			player2.addMoney(rent);
		else
			player1.addMoney(rent);
	}
	public void onChance(int b, Player p, int die1)
	{
		if(die1 == 1)
		{
			System.out.println("Advance to \"Go\". (Collect $200)");
			p.addMoney(200);
			p.setLocation(0);
		}
		else if(die1 == 2)
		{
			System.out.println("Bank pays you dividend of $50. ");
			p.addMoney(50);
		}
		else if(die1 == 3)
		{
			System.out.println("Go Back Three {3} Spaces");
			int k = p.getLocation();
			if(k < 3) {k+=40;}
			p.setLocation(k - 3);
		}
		else if(die1 == 4)
		{
			System.out.println("Go to Jail. Go directly to Jail. Do not pass GO, do not collect $200");
			p.setLocation(10);
			p.setinJail(true);
		}
		else if(die1 == 5)
		{
			System.out.println("Your building loan matures. Receive $150.");
			p.addMoney(150);
		}
		else if(die1 == 6)
		{
			System.out.println("You got a get outta jail card.(You may only have 1 at anytime)");
			p.setJailCard(true);
		}
	}
	private void onTax(int b, Player p) 
	{
		if(b == 4)
		{
			p.subMoney(200);
		}
		else if(b == 38)
		{
			p.subMoney(75);
		}
	}
	public void onCC(int b,Player p, int die1)
	{
		if(die1 == 1)
		{
			System.out.println("You inherit $100.");
			p.addMoney(100);
		}
		else if(die1 == 2)
		{
			System.out.println("Hospital Fees. Pay $100. ");
			p.subMoney(100);
		}
		else if(die1 == 3)
		{
			System.out.println("Receive $25 consultancy fee.");
			p.addMoney(25);
		}
		else if(die1 == 4)
		{
			System.out.println("Go to Jail. Go directly to Jail. Do not pass GO, do not collect $200");
			p.setLocation(10);
			p.setinJail(true);
		}
		else if(die1 == 5)
		{
			System.out.println("Doctor's fees. Pay $80.");
			p.subMoney(80);
		}
		else if(die1 == 6)
		{
			System.out.println("Life insurance matures – Collect $100");
			p.addMoney(100);
		}
	}
	public void onRR(Land a, Player p, int t)
	{
		if(a.getOwner() != p.getN()) {
			int rent = getRent(a.getHousenum()+1, a);
			System.out.println("You had to spend $" + rent +" on rent.");
			p.subMoney(rent);payRent(t, rent);
		}
	}
	public void onCorner(int b, Player p)
	{
		if(b == 0)
			p.addMoney(200);
		else if(b == 10)
		{}
		else if(b == 20)
		{}
		else {
			p.setinJail(true);
			p.setLocation(10);}
	}
	public void onUtility( Land a, Player p, int t)
	{
		if(a.getOwner() != p.getN())
		{
			int die1 = (int)((Math.random()*5)+1) +  (int)((Math.random()*5)+1);
			if(L.get(12).getOwner() != p.getN() && L.get(28).getOwner() != p.getN()) {
				p.subMoney(die1*10);System.out.println("You had to spend $" + (die1*10) +" on rent.");payRent(t, die1*10);}
			else {
				p.subMoney(die1*4);;System.out.println("You had to spend $" + (die1*4) +" on rent.");payRent(t, die1*4);}
		}	
	}
	public void asksell(Player p, Land a)
	{
		int x =1;
		System.out.println("Would you like to sell a property. (It must be one you own)  y/n");
		String s = sc.nextLine();
		while( x == 1) {
			if(s.contains("y")) {
				x = 0;
				System.out.println("Please enter that group that you would like to build in. (Look at the board. It has the letter groups. )");
				s = sc.nextLine();
				while(x == 0) 
				{if(s.equals("A") || s.equals("B") ||s.equals("C") || s.equals("D") || s.equals("E") || s.equals("F") || s.equals("G") || s.equals("H")) {sell(p, s);x = 1;}else if(s == "n") {x = 1;}
				else {System.out.println("Please enter the correct letter. If you would like to cancel, then enter n"); s = sc.nextLine();}
				}
			}
		}
			
	}
	public void sell(Player p, String s)
	{
		if(s == "A")
		{
			if(L.get(1).getOwner() == p.getN() && L.get(3).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 1." + L.get(1).getName() +"  or 3."+ L.get(3).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "B")
		{
			if(L.get(6).getOwner() == p.getN() && L.get(8).getOwner() == p.getN() && L.get(9).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 6." + L.get(6).getName() +"  or 8."+ L.get(8).getName() + " or 9."+ L.get(9).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "C")
		{
			if(L.get(11).getOwner() == p.getN() && L.get(13).getOwner() == p.getN() && L.get(14).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 11." + L.get(11).getName() +"  or 13."+ L.get(13).getName() + " or 14."+ L.get(14).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "D")
		{
			if(L.get(16).getOwner() == p.getN() && L.get(18).getOwner() == p.getN() && L.get(19).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 16." + L.get(16).getName() +"  or 18."+ L.get(18).getName() + " or 19."+ L.get(19).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "E")
		{
			if(L.get(21).getOwner() == p.getN() && L.get(23).getOwner() == p.getN() && L.get(24).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 21." + L.get(21).getName() +"  or 23."+ L.get(23).getName() + " or 24."+ L.get(24).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "F")
		{
			if(L.get(26).getOwner() == p.getN() && L.get(27).getOwner() == p.getN() && L.get(29).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 26." + L.get(26).getName() +"  or 27."+ L.get(27).getName() + " or 29."+ L.get(29).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "G")
		{
			if(L.get(31).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 31." + L.get(31).getName() +"  or 32."+ L.get(32).getName() + " or 34."+ L.get(34).getName());
				int i = sc.nextInt();
			}
		}
		if(s == "H")
		{
			if(L.get(37).getOwner() == p.getN() && L.get(39).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 37." + L.get(37).getName() +"  or 39."+ L.get(39).getName());
				int i = sc.nextInt();
				
			}
		}
	}
	public void askbuildHouses(Player p)
	{
		int x =1;
		System.out.println("Would you like to build any houses. *You must have all the lands in a set to build*  y/n");
		String s = sc.nextLine();
		while( x == 1) {
			if(s.contains("y")) {
				x = 0;
				System.out.println("Please enter that group that you would like to build in. (Look at the board. It has the letter groups. )");
				s = sc.nextLine();
				while(x == 0) 
				{if(s == "A" || s == "B" ||s == "C" || s == "D" || s == "E" || s == "F" || s == "G" || s == "H") {checkBuild(p, s);x = 1;}else if(s == "n") {x =0;}
				else {System.out.println("Please enter the correct letter. If you would like to not build a house then enter n"); s = sc.nextLine();}
				}
				
			}
			else if(s.contains("n")) {x = 0;}	else{System.out.println("Please enter y or n");s = sc.nextLine();}}

	}
	public void checkBuild(Player p, String s)
	{
		if(s == "A")
		{
			if(L.get(1).getOwner() == p.getN() && L.get(3).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 1." + L.get(1).getName() +"  or 3."+ L.get(3).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "B")
		{
			if(L.get(6).getOwner() == p.getN() && L.get(8).getOwner() == p.getN() && L.get(9).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 6." + L.get(6).getName() +"  or 8."+ L.get(8).getName() + " or 9."+ L.get(9).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "C")
		{
			if(L.get(11).getOwner() == p.getN() && L.get(13).getOwner() == p.getN() && L.get(14).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 11." + L.get(11).getName() +"  or 13."+ L.get(13).getName() + " or 14."+ L.get(14).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "D")
		{
			if(L.get(16).getOwner() == p.getN() && L.get(18).getOwner() == p.getN() && L.get(19).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 16." + L.get(16).getName() +"  or 18."+ L.get(18).getName() + " or 19."+ L.get(19).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "E")
		{
			if(L.get(21).getOwner() == p.getN() && L.get(23).getOwner() == p.getN() && L.get(24).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 21." + L.get(21).getName() +"  or 23."+ L.get(23).getName() + " or 24."+ L.get(24).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "F")
		{
			if(L.get(26).getOwner() == p.getN() && L.get(27).getOwner() == p.getN() && L.get(29).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 26." + L.get(26).getName() +"  or 27."+ L.get(27).getName() + " or 29."+ L.get(29).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "G")
		{
			if(L.get(31).getOwner() == p.getN() && L.get(32).getOwner() == p.getN() && L.get(34).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 31." + L.get(31).getName() +"  or 32."+ L.get(32).getName() + " or 34."+ L.get(34).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
		if(s == "H")
		{
			if(L.get(37).getOwner() == p.getN() && L.get(39).getOwner() == p.getN()) 
			{
				System.out.println("Which location would you like to sell? Please enter the number. 37." + L.get(37).getName() +"  or 39."+ L.get(39).getName());
				int i = sc.nextInt();
				buildHouses(p, s, i);
			}
		}
	}
	public void buildHouses(Player p, String s, int i)
	{
		p.subMoney(L.get(i).getbuildCost());
		L.get(i).setHouseNum(1);
	}
	public void isWin(Player p, int player)
	{
		for(int i = 0 ; i < 40; i ++)
		{
			if( L.get(i) == null|| L.get(i).getOwner() != p.getN())
			{
				if(p.getMoney() == 0)
				{
					System.out.println(p.getN() + " has lost");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int t = 1;
		boolean x = true;
		Game letsplay = new Game();
		letsplay.setBoard();
		letsplay.setLand();
		while(x== true)
		{
			letsplay.rollthedice(t);
			t++;
		}
	}
}
