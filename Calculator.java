package Testtandemloop;

public class Calculator {

	public double calculate(double a, double b, String operation) {
		double result = 0.0;
		
		switch (operation.toLowerCase()) {
		case "addition":
			result = a + b;
			break;
		case "subtraction":
			result = a - b;
			break;
		case "multiplication":
			result = a * b;
			break;
		case "division":
			if (b != 0) {
				result = a / b;
			} else {
				System.out.println("Error: Cannot divide by zero.");
				// You might want to throw an expectation here instead of just printing an error.
				return Double.NaN; // Not-a-Number to indicate an error
			}
			break;
		default:
			System.out.println("Error: Invalid operation.");
			return Double.NaN; // Indicate invalid operation
		}
		return result;

	}
	
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		
		double num1 = 10.5;
		double num2 = 5.2;
		String op = "multiplication";
		
		double output = myCalculator.calculate(num1, num2, op);
		
		if (!Double.isNaN(output)) {
			System.out.println("Result of " + num1 + " " + op +  " " + num2 + " = " + output);
			
		}
		
		// Example of division by zero
		double divResult = myCalculator.calculate(8.0, 0.0, "division");
		if (Double.isNaN(divResult)) {
			System.out.println("Division by zero resulted in NaN.");
		}
		
		
		// Example of an invalid operation
		double invalidResult = myCalculator.calculate(7.0, 3.0, "power");
		if (Double.isNaN(invalidResult)) {
			System.out.println("Invalid operation resulted in NaN.");
		}
	}
	

}
