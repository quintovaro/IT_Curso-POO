package sum;

import java.util.ArrayList;
import java.util.List;

public class SumPrimeNumbersClass3 {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int quantityPrimes = 500000;
        SumPrimeNumbersClass3 sumPrimeNumbers = new SumPrimeNumbersClass3();
        int suma = sumPrimeNumbers.sumPrimes(quantityPrimes);

        System.out.println("La suma de los primeros " + quantityPrimes + " números primos es: " + suma);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeInMilliseconds = elapsedTime / 1_000_000;
        System.out.println("Tiempo de ejecución: " + elapsedTimeInMilliseconds + " milisegundos");
    }

	private boolean isPrime(int number,  List<Integer> primesList) {
        for (int prime : primesList) {
			if (prime * prime > number) {
			    return true;
			}
			if (number % prime == 0) {
			    return false;
			}
        }
        return true;
	}
	

    private int sumPrimes(int quantityPrimes) {
        List<Integer> primesList = new ArrayList<>();
        int sumPrimes = 0;
        int number = 2;

        while (primesList.size() < quantityPrimes) {
            if (isPrime(number, primesList)) {
                sumPrimes += number;
                primesList.add(number);
            }
            number++;
        }
        return sumPrimes;
    }
}


