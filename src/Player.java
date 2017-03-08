import java.util.Scanner;

public class Player 
{
	private Hand hand;
	Scanner input = new Scanner(System.in);
	
	public Player()
	{
		hand = new Hand();
	}
	
	public void startGame()
	{
		hand.takeCard();
		hand.takeCard();
		System.out.println("Value till now : "+hand.calculateHand());
	while (isWon() == false && isLost() == false)
	{
		System.out.println("Press 1 to keep playing OR 2 to exit.");
		if (input.nextInt() == 1)
		{ 
			hand.takeCard();
			System.out.println("Value till now : "+hand.calculateHand());
		}
		else
		{
			break;
		}
	}
	if (isWon() ==  true)
	{
		System.out.println("Total value is: "+hand.calculateHand());
		System.out.println("You have won!");
	}
	else if (isLost() == true)
	{
		System.out.println("Total value is: "+hand.calculateHand());
		System.out.println("Sorry, You have lost!");
	}
	else
	{
		System.out.println("Total value is: "+hand.calculateHand());
		System.out.println("Player has dropped the game");
	}
	}
	
	public boolean isWon()
	{
		if (hand.calculateHand() == 21)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isLost()
	{
		if (hand.calculateHand() > 21)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
