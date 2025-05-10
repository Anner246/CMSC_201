/**
 * This is a class the deals with prime numbers
 */
public class PrimeNumberMethod
{
	/**
	 * This is the main method which calls the printPrimeNumbers method to list off prime numbers
	 * @param args: Holds the command-line arguments that are passed to the Java program when it runs
	 */
  public static void main(String[] args)
  {
    System.out.println("The first 50 prime numbers are \n");
    printPrimeNumbers(50);
  }
  /**
   * This printPrimeNumbers method prints out a number of prime numbers separated by spaces and in lines of 10
   * @param numberOfPrimes: This is the number of prime numbers listed
   */
  public static void printPrimeNumbers(int numberOfPrimes)
  {
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness

    // Repeatedly find prime numbers
    while (count < numberOfPrimes)
    {
      // Print the prime number and increase the count
      if (isPrime(number))
      {
        count++; // Increase the count

        if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
        {
          // Print the number and advance to the new line
          System.out.printf("%-5s\n", number);
        }
        else
          System.out.printf("%-5s", number);
      }

      // Check if the next number is prime
      number++;
    }
  }
  
  /**
   * This isPrime method determines whether or not a number is prime
   * @param number: This is the number being evaluated
   * @return true if the number is prime, false otherwise
   */
  public static boolean isPrime(int number)
  {
    for (int divisor = 2; divisor <= number / 2; divisor++)
    {
      if (number % divisor == 0)
      { // If true, number is not prime
        return false; // number is not a prime
      }
    }

    return true; // number is prime
  }
}