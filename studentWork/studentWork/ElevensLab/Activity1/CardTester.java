package studentWork.ElevensLab.Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card a = new Card();
		a.setSuit("hearts");
		a.setRank("Queen");
		a.setPointValue(12);

		Card b = new Card();
		b.setSuit("hearts");
		b.setRank("Queen");
		b.setPointValue(12);

		Card c = new Card();
		c.setSuit("spades");
		c.setRank("Eight");
		c.setPointValue(8);

		Card d = new Card("Jack", "Clubs", 11);

		System.out.println (a.toString());
		System.out.println (b.toString());
		System.out.println (c.toString());
		System.out.println (d.toString());

		System.out.println (b.matches(a));
		System.out.println (b.matches(c));
	}
}
