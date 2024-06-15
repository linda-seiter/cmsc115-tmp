
public class JokeMaker {
	
	public static void tellJoke(String who, String punchline) {
		System.out.println("Knock knock");
		System.out.println("Who's there?");
		System.out.println(who);
		System.out.println(who + " who?");
		System.out.println(punchline);
	}

	public static void main(String[] args) {
		tellJoke("Tank", "You're Welcome.");
	
		System.out.println();
		
		tellJoke("Nobel", "No bell, that's why I knocked!");
	}

}
