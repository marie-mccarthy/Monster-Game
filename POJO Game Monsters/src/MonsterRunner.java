import java.util.ArrayList;
import java.util.Scanner;

public class MonsterRunner
	{
	static ArrayList <Monster> cards = new ArrayList <Monster>();
	public static void main(String[] args)
		{
		int a = 1;
		boolean stillPlaying = true;
		cards.add(new Monster(4, 7, "Dragon"));
		cards.add(new Monster(2, 8, "Giant Spider"));
		cards.add(new Monster(5, 6, "Three Headed Dog"));
		for(int i=0;i<cards.size();i++)
			{
				System.out.println("Monster "+(i+1)+" is a "+cards.get(i).getName()+" and has a power of "+cards.get(i).getPower()+". Also it has "+cards.get(i).getLives()+" lives.");
			}
		System.out.println("Round 1");
		while(stillPlaying)
			{
				
				a++;
				System.out.println("Which monster would you like to choose?");
				Scanner userInputChoice= new Scanner(System.in);
				int choice = userInputChoice.nextInt();	
				int choice2 = choice-1;
				int randomNumber=(int)(Math.random()*cards.size()-1);
				System.out.println("Ok, your monster The "+cards.get(choice2).getName()+" will battle the "+cards.get(randomNumber).getName());
				System.out.println("The "+cards.get(choice2).getName()+" has a power of "+cards.get(choice2).getPower());
				System.out.println("The "+cards.get(randomNumber).getName()+" has a power of "+cards.get(randomNumber).getPower());
				if(cards.get(randomNumber).getPower()>cards.get(choice2).getPower())
					{
						stillPlaying=false;
						System.out.println("Sorry you lost because The "+cards.get(randomNumber).getName()+" had more power and defeated your monster");
						
					}
				if(cards.get(randomNumber).getPower()<cards.get(choice2).getPower())
					{
						System.out.println("You won because The "+cards.get(randomNumber).getName()+" had more power and defeated The "+cards.get(choice2).getName());
					}
				if(cards.get(randomNumber).getPower()==cards.get(choice2).getPower())
					{
						System.out.println("It was a tie! You can still move on to the next round.");
					}
				if(cards.get(choice2).getLives()<=a)
					{
						System.out.println("You used up all of your lives. Game over.");
						stillPlaying= false;
					}
				else
					{
						System.out.println("Round "+a);						
					}
				
			}
		}

	}