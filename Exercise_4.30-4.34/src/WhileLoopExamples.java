
/**
 * @author Richard Shepard
 * @version Jan 31, 2015
 */


public class WhileLoopExamples {

	/** The following are examples of while loops from the books
	 * 	uncomment methods to run
	 * @param args
	 */
	public static void main(String[] args) {
		while1();
		while2();
		while3(1,100);
		isPrime(24);
	}
	
	
	private static void isPrime(int number) {
		boolean isPrime = true;
		int index = 1;
		while(isPrime && index <= (number / 2)) {
			index++;	
			if(number % index == 0) {
				isPrime = false;
			}
			System.out.println("Checking number# " + index);
		}
		if (isPrime) {
			System.out.println("The number " + number + " is prime");
		} else {
			System.out.println("The number is divisible by " + index + " and is not prime");
		}
	}
	
	private static void while3(int index, int max ) {
		int sum = 0;
		while(index <= max) {
			System.out.print(index + " + " + sum + " = ");
			sum += index;
			index++;
			System.out.printf(sum + "\n");
			
		}
		System.out.println("the total of all numbers 1-10 is: " + sum);
	}
	
	private static void while2() {
		int max = 10;
		int sum = 0;
		int index = 1;
		while(index <= max) {
			System.out.print(index + " + " + sum + " = ");
			sum += index;
			index++;
			System.out.printf(sum + "\n");
			
		}
		System.out.println("the total of all numbers 1-10 is: " +sum);
	}

	
	private static void while1() {
		int max = 95;
		int min = 10;
		int index = min;
		while(index <= max) {
			if (index % 5 == 0) {
				System.out.println(index + " is a multiple of 5");
			}
			index++;
		}
	}

}
