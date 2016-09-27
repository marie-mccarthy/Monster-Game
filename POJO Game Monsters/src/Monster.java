public class Monster
	{
	private int power;
	private String name;
	private int lives;
	public Monster(int l, int a, String n)
		{
		lives = l;
		power = a;
		name = n;
		}	
	public int getLives()
		{
		return power;
		}
	public void setLives(int lives)
		{
		this.lives = lives;
		}
	public int getPower()
		{
		return power;
		}
	public void setPower(int power)
		{
		this.power = power;
		}
	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

//	public String toString()
//		{
//		return name + " is " + age;
//		}
	}