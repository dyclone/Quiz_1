import java.util.Scanner;

public class PasserRating {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Number of passing" + " attempts: ");
		double ATT = input.nextDouble();

		System.out.println("Enter Number of completions: ");
		double COMP = input.nextDouble();

		System.out.println("Enter Number of passing yards: ");
		double YDS = input.nextDouble();

		System.out.println("Enter Number of touchdowns passes: ");
		double TD = input.nextDouble();

		System.out.println("Enter Number of interceptions: ");
		double INT = input.nextDouble();

		double a = ((COMP / ATT) - .3) * 5;
		double b = ((YDS / ATT) - 3) * .25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INT / ATT) * 25);
		double pr = ((a + b + c + d) / 6) * 100;

		System.out.printf("Players Passer Rating = %3.1f", pr);
	}
}
