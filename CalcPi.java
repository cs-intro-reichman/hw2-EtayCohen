// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int termsCount = Integer.parseInt(args[0]);

		double sum = 1;
		for (int i = 1; i < termsCount; i++) {
			double term = (double) 1 / (1 + (2 * i));
			sum += (i % 2 == 0 ? 1 : -1) * term;
		}

		double approximatedPI = sum * 4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approximatedPI);
	}
}