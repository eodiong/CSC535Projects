import java.util.Scanner;

public class ConnectFour
{
	private Board gameboard;
	private Player player1;
	private Player player2;
	private Scanner input;
	public ConnectFour()
	{
		input = new Scanner (System.in);
		this.gameboard = new Board();
		this.player1 = new Player("Player 1", 'R');
		this.player2 = new Player ("Player 2", 'B');
	}
	public void play ()
	{
		Player currPlayer = this.player1;
		do
		{
			this.gameboard.display();
			this.getMove(currPlayer);
			if(currPlayer == this.player1)
			{
				currPlayer = this.player2;
			}
			else
			{
				currPlayer = this.player1;
			}
		}
		
		while(this.gameboard.isWinner() == false);
		
		if(currPlayer == this.player1)
		{
			System.out.println( this.player2.getFirstName() + "wins!");
		}
		else
		{
			System.out.println(this.player1.getFirstName() + "wins!");
		}
	}
	
	private void getMove(Player player)
	{
		int column = -1;
		do
		{
			System.out.print("Please choose a column between 1 and 6: ");
			column = this.input.nextInt();
		}
		while(this.gameboard.makeMove(column, player.move()) == false);
	}
}