package sum;

public class SumFirstPrimeNumbers {

	public static void main(String[] args) {
		
        long startTime = System.nanoTime();      	
		
		int lengthPrimeNumberArray = 500000;
		int[] primeNumberArray = new int[lengthPrimeNumberArray];
		int limitArray = lengthPrimeNumberArray - 1;
	
		int idArray = 0;
		primeNumberArray[idArray] = 2;
		int sumPrimeNumbers = 2;
		int number = 2;
		
		do {
			number += 1;
			for (int primeNumber: primeNumberArray) {
				if (number % primeNumber == 0 ) {
					break;
				} 
				
				double quotient = number / primeNumber;			
				if (quotient < primeNumber) {
					idArray += 1;
					primeNumberArray[idArray] = number;
					sumPrimeNumbers += number;
					break;
				}
			}
		} while (idArray < limitArray);
		
		idArray = 0;
		for (int primeNumber: primeNumberArray) {
			idArray += 1;
			System.out.println(idArray + ": " + primeNumber);	
		}
		System.out.println("Suma 50 primeros números primos: " + sumPrimeNumbers);
		       
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeInMilliseconds = elapsedTime / 1_000_000;
        System.out.println("Tiempo de ejecución: " + elapsedTimeInMilliseconds + " milisegundos");

	}
}
