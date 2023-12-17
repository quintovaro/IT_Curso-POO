package sum;

public class SumPrimeNumbersClass {

	public static void main(String[] args) {
		
        long startTime = System.nanoTime();
      
		SumPrimeNumbersClass sumPrimeNumbersClass = new SumPrimeNumbersClass();
		int quantityPrimes = 500000;
	    int suma = sumPrimeNumbersClass.sumPrimes(quantityPrimes);

	    System.out.println("La suma de los primeros " + quantityPrimes + " números primos es: " + suma);		

       
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeInMilliseconds = elapsedTime / 1_000_000;
        System.out.println("Tiempo de ejecución: " + elapsedTimeInMilliseconds + " milisegundos");
	}
	
	
	private boolean isPrime(int number) {	    
	    for (int i = 2; i <= Math.sqrt(number); i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	

    private int sumPrimes(int quantityPrimes) {
        int sumPrimeNumbers = 0;
        int primeNumberCounter = 0;
        int number = 2;

        while (primeNumberCounter < quantityPrimes) {

            if (isPrime(number)) {
            	sumPrimeNumbers += number;
                primeNumberCounter++;
            }
            number++;
        }
        return sumPrimeNumbers;
    }

}
