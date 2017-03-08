
public class Dealer {

	private Deck deck;
	private int pos;
	
	public Dealer()
	{
		deck=new Deck();
		deck.shuffle();
		pos = 0;
	}
	
	public Card hitPlayer()
	{
		return deck.theCards[pos++];
	}
	
}
