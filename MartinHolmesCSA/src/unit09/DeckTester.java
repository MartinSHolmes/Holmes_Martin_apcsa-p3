package unit09;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck myDeck = new Deck(new String[] {"2", "6", "7"}, 
				new String[] {"hearts", "diamonds"}, 
				new int[] {1, 6, 7});
		System.out.println(myDeck);
		myDeck.shuffle();
		System.out.println(myDeck);
		
		Deck deckTwo = new Deck(new String[] {"King", "Queen", "Jack"},
				new String[] {"spades", "hearts", "clubs"},
				new int[] {11, 12, 13});
		System.out.println(deckTwo);
		deckTwo.deal();
		deckTwo.deal();
		System.out.println(deckTwo);
		
		int temp = myDeck.size();
		for (int i = 0; i < temp; i++) {
			myDeck.deal();
		}
		System.out.println(myDeck);
	}
}