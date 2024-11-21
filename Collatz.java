// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int iterations = Integer.parseInt(args[0]);
		boolean isVerbose = args[1].equals("v");

		for (int i = 1; i <= iterations; i++) {
			int seed = i;
			int count = 1;

			String verboseOutput = seed + " ";

			do {
				seed = seed % 2 == 0 ? seed / 2 : 3 * seed + 1;
				if (isVerbose) {
					verboseOutput += seed + " ";
				}
				count++;
			} while (seed != 1);

			if (isVerbose) {
				System.out.println(verboseOutput + "(" + count + ")");
			}
		}

		System.out.println("Every one of the first " + iterations + " hailstone sequences reached 1.");
	}
}
