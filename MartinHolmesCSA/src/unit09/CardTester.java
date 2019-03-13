package unit09;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card egg = new Card("King", "Clubs", 9);
		System.out.println(egg);
		
		Card oof = new Card("Queen", "Diamonds", 7);
		System.out.println(oof);
		
		Card food = new Card("King", "Clubs", 9);
		System.out.println(food);
		
		System.out.println(egg.matches(oof));
		System.out.println(egg.matches(food));
	}
}
