public class PrimeNumberChallenge {
    public static void main(String[] args) {

        int count = 1;

        for (int i = 1 ; i <= 100; i++) {       //gives all prime numbers between 1 and 100
            if (isPrime(i)) {
                System.out.println(i + " is a prime number!");
                count++;
            } else if (count > 3) {             //to only give me the first 3 prime numbers
                break;
            }

        }


    }

    public static boolean isPrime(int wholeNumber) {        //checks if a number is a prime number

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }


}
