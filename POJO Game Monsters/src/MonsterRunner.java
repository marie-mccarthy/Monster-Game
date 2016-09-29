import java.util.ArrayList;
import java.util.Scanner;

public class MonsterRunner
	{
	static ArrayList <Monster> cards = new ArrayList <Monster>();
	public static void main(String[] args)
		{
		int choice2=0;
		int a = 0;
		boolean stillPlaying = true;
		boolean addingMoreMonsters= true;
		cards.add(new Monster(4, 7, "Dragon"));
		cards.add(new Monster(2, 8, "Giant Spider"));
		cards.add(new Monster(5, 6, "Three Headed Dog"));
		for(int i=0;i<cards.size();i++)
			{
				System.out.println("Monster "+(i+1)+" is a "+cards.get(i).getName()+" and has a power of "+cards.get(i).getPower()+". Also it has "+cards.get(i).getLives()+" lives.");
			}
		while(addingMoreMonsters)
			{
		System.out.println("Enter 'yes' if you would like to add another monster");
		Scanner userInput= new Scanner(System.in);
		String decision = userInput.nextLine();
		if(decision.equals("yes"))
			{	
				System.out.println("Lives: ");
				Scanner userInput1= new Scanner(System.in);
				int monsterLives = userInput1.nextInt();	
				
				System.out.println("Power: ");
				Scanner userInputChoice2= new Scanner(System.in);
				int monsterPower = userInputChoice2.nextInt();	
				int monsterPower2 = 1;
				if((monsterPower)<10)
					{
						monsterPower2 = monsterPower;
					}
				else
					{
						System.out.println("You entered a number too high. Now your Power will be 1.");
					}
				System.out.println("Name: ");
				Scanner userInput3= new Scanner(System.in);
				String monsterName = userInput3.nextLine();
				cards.add(new Monster(monsterLives, monsterPower2, monsterName));				
			}
		else
			{
				System.out.println("Ok. No new monsters will be added. ");
				addingMoreMonsters= false;
			}
		}
		for(int i=0;i<cards.size();i++)
			{
				System.out.println("Monster "+(i+1)+" is a "+cards.get(i).getName()+" and has a power of "+cards.get(i).getPower()+". Also it has "+cards.get(i).getLives()+" lives.");
			}
		System.out.println("Round 1: ");			
		while(stillPlaying)
			{				
				a++;
				System.out.println("Which monster would you like to choose? Or enter the number 000 for a random monster. ");
				Scanner userInputChoice= new Scanner(System.in);
				int choice = userInputChoice.nextInt();	
				if(choice==000)
					{
						choice2=(int)(Math.random()*cards.size()-1)+0;
					}
				else
					{
						choice2 = choice-1;
					}
				
				
				int randomNumber=(int)(Math.random()*cards.size()-1);
				System.out.println("Ok, your monster The "+cards.get(choice2).getName()+" will battle The "+cards.get(randomNumber).getName());
				System.out.println("The "+cards.get(choice2).getName()+" has a power of "+cards.get(choice2).getPower());
				System.out.println("The "+cards.get(randomNumber).getName()+" has a power of "+cards.get(randomNumber).getPower());
				cards.get(choice2).setLives((cards.get(choice2).getLives())-1);
				if(cards.get(randomNumber).getPower()>cards.get(choice2).getPower())
					{
						stillPlaying=false;
						System.out.println("Sorry you lost because The "+cards.get(randomNumber).getName()+" had more power and defeated your monster");
						
					}
				if(cards.get(randomNumber).getPower()<cards.get(choice2).getPower())
					{
						System.out.println("You won because The "+cards.get(randomNumber).getName()+" had more power and defeated The "+cards.get(choice2).getName());
						System.out.println("Round "+a);		
					}
				if(cards.get(randomNumber).getPower()==cards.get(choice2).getPower())
					{
						System.out.println("It was a tie! You can still move on to the next round.");
						System.out.println("Round "+a);		
					}
				if(cards.get(choice2).getLives()==0)
					{
						System.out.println("You used up all of+"+cards.get(choice2).getName()+" Game over.");
						stillPlaying= false;
						cards.get(choice2).setLives(0);
					}
				else
					{						
						System.out.println(cards.get(choice2).getName()+" lives: "+cards.get(choice2).getLives());
						System.out.println(cards.get(randomNumber).getName()+" lives: "+cards.get(randomNumber).getLives());
					}
				
				
			}
		}

	}