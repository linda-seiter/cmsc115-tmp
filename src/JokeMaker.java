public class JokeMaker {
	
	public static void tellJoke(String who, String punchline) {
		System.out.println("Knock knock.");
		System.out.println("Who's there?");
		System.out.println(who + ".");
		System.out.println(who + " who?");
		System.out.println(punchline + "!");
	}

	public static void main(String[] args) {
		tellJoke("Nobel", "No bell, that's why I knocked");
		tellJoke("Figs", "Figs the doorbell, it's not working");
	}

}
