
public class Hand
{
	private Dealer dealer;
	protected Card card[];
	private int pos;
	
	public Hand()
	{
		dealer = new Dealer();
		card = new Card[12];
		pos = 0;
	}
	
	public void takeCard()
	{
		card [pos] = dealer.hitPlayer();
		
		this.card[pos].display();
		pos++;
	}
	
	//calculate value of hand
	public int calculateHand()
	{
		int totalValue = 0;
		for (int i = 0; i < pos; i++)
		{
			if (card[i].value == 11 )
			{
				if(totalValue <= 10)
				totalValue = totalValue + card[i].value;
			
			else if (totalValue > 10)
			{
				totalValue = totalValue + 1;
			
		      }
			}
			else
				totalValue = totalValue + card[i].value;
		}
		
	return totalValue;
	}
}
