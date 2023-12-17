package sum;

public class SumPrimeNumbersClass2 {

	public static void main(String[] args) {
		
        long startTime = System.nanoTime();
        
		int quantityPrimes = 500000;
		SumPrimeNumbersClass2 sumPrimeNumbersClass2 = new SumPrimeNumbersClass2();
	    int suma = sumPrimeNumbersClass2.sumPrimes(quantityPrimes);

	    System.out.println("La suma de los primeros " + quantityPrimes + " números primos es: " + suma);		

       
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeInMilliseconds = elapsedTime / 1_000_000;
        System.out.println("Tiempo de ejecución: " + elapsedTimeInMilliseconds + " milisegundos");
	}
	
	
	private boolean isPrime(int number, int[] primeNumberArray) {
		for (int primeNumber: primeNumberArray) {						
			if (primeNumber * primeNumber > number) {
			    return true;
			}
			if (number % primeNumber == 0) {
			    return false;
			}
		}
		return false;
	}
	

    private int sumPrimes(int quantityPrimes) {
    	
		int[] primesArray = new int[quantityPrimes];
		int size = quantityPrimes - 1;
		int id = 0;
				
		primesArray[id] = 2;
		int sumPrimes = 2;		
		int number = 3;
		
		while (id < size) {
            if (isPrime(number, primesArray)) {				
            	sumPrimes += number;
                id += 1;
                primesArray[id] = number;
            }			
            number += 1;
		}				
		return sumPrimes;
    }
}