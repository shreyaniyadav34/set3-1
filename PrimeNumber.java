public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29; // Specify the number to check here

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than 2 are not prime

        // Check divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible, not prime
            }
        }
        return true; // No divisors found, number is prime
    }
}