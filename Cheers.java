// Prints a crowd cheering output.
public class Cheers {
	public static void main(String[] args) {
		String letters = "AEFHILMNORSX";

		String cheer = args[0].toUpperCase();

		int cheersCount = Integer.parseInt(args[1]);

		for (int i = 0; i < cheer.length(); i++) {
			boolean isSpecialChar = letters.indexOf(cheer.charAt(i)) != -1;
			String prefix = isSpecialChar ? "Give me an" : "Give me a ";

			System.out.println(String.format("%s %s: %s!", prefix, cheer.charAt(i), cheer.charAt(i)));
		}

		System.out.println("What does that spell?");

		for (int i = 0; i < cheersCount; i++) {
			System.out.println(cheer + "!!!");
		}
	}
}
