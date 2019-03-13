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
		Deck carddeck = new Deck(new String[] {"1", "9","King"}, new String [] {"diamons","hearts"}, new int[] {1,2,3});
		System.out.println(carddeck);
		carddeck.shuffle();
		System.out.println(carddeck);
		carddeck.deal();
		carddeck.deal();
		System.out.print(carddeck);
		
		int[] test = new int[52];
		carddeck.selectionShuffle(test);
	}
}
