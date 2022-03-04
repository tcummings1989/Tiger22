package studentWork.ElevensLab.Activity1;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack","queen","king"};
		String[] suits = {"hearts", "diamonds"};
		int[] pointValue = {11,12,13};
		Deck Deck1 = new Deck(ranks, suits, pointValue);
		System.out.println(Deck1.toString());
	}
}
