import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deck d= new Deck();
		d.shuffle();
		ArrayList<Card> P1=new ArrayList<>();
		ArrayList<Card> P2=new ArrayList<>();
		
		for (int x=0;x<5;x++) {
			P1.add(d.deal());
			P2.add(d.deal());
		}
		System.out.println("Player 1");
		for (Card c:P1) {
			System.out.println(c.getName());
		}
		System.out.println("Player 2");
		for (Card c:P2) {
			System.out.println(c.getName());
		}
		System.out.println();
	}

}
