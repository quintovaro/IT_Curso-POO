package sum;

public class SumPrimeNumbers {

	public static void main(String[] args) {
					
		int lengthPrimeNumberArray = 50;
		int[] primeNumberArray = new int[lengthPrimeNumberArray];
		int limitArray = lengthPrimeNumberArray - 1;
		
		int idArray = 0;
		primeNumberArray[idArray] = 2;
		int sumPrimeNumbers = 2;
		
		for (int number = 3; number < limitArray; number++) {
			
			for (int prime: primeNumberArray) {
				if (number % prime == 0 ) {
					break;
				} 
				
				double quotient = number / prime;			
				if (quotient < prime) {
					idArray += 1;
					primeNumberArray[idArray] = number;
					sumPrimeNumbers += number;
					break;
				}
			}
		}
		
		for (int prime: primeNumberArray) {
			if (prime == 0) {
				break;
			}
			System.out.println(prime);	
		}
		System.out.println("Suma números primos: " + sumPrimeNumbers);				
	}

}
