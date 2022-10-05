package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		calculator.calculate(input);
	}
}
