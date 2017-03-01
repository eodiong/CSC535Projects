
public class Player 
{
				
	public String firstName;
	private char move;
	
	
	Player (String firstName, char move)
	{
		this.firstName = firstName;
		this.move = move;
	}


	public String getFirstName() 
	{
		return this.firstName;
	}


	public char move() 
	{
		return this.move;
	}
	
	/*void display ()
	{
		System.out.println(this.firstName + " " + this.lastName);
	}*/
}
