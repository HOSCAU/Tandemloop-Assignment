package Testtandemloop;

public class OddseriesGenerator {

	public static void generateOddSeries(int a) {
		if (a <= 0) {
			System.out.println("Input must be a positive integer.");
			return;
		}
		
		for (int i = 1; i <= 2 * a - 1; i += 2) {
			System.out.print(i);
			if (i < 2 * a - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	 
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example usage:
		generateOddSeries(1);
		generateOddSeries(2);
		generateOddSeries(3);
		generateOddSeries(4);
		generateOddSeries(5);
		generateOddSeries(6);
		generateOddSeries(7); // Example with a larger input

	}
}


