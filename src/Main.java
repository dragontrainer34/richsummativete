import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deck d = new Deck();
		d.shuffle();
		Player P1 = new Player();
		ArrayList<Card> P2 = new ArrayList<>();
		ArrayList<Card> P3 = new ArrayList<>();
		ArrayList<Card> P4 = new ArrayList<>();
		ArrayList<Card> P5 = new ArrayList<>();

		for (int x = 0; x < 5; x++) {
			P1.add(d.deal());
			P2.add(d.deal());
			P3.add(d.deal());
			P4.add(d.deal());
			P5.add(d.deal());
		}
		System.out.println("Player 1");
		for (Card c : P1) {
			System.out.println(c.getName());
		}
		System.out.println("\nPlayer 2");
		for (Card c : P2) {
			System.out.println(c.getName());
		}
		System.out.println("\nPlayer 3");
		for (Card c : P3) {
			System.out.println(c.getName());
		}
		System.out.println("\nPlayer 4");
		for (Card c : P4) {
			System.out.println(c.getName());
		}

		System.out.println("\nPlayer 5");
		for (Card c : P5) {
			System.out.println(c.getName());
		}
	}

}











