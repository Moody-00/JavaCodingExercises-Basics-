public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));

    }
    public static boolean isPerfectNumber(int number) {     //checks if a number is a perfect number

        if (number < 1) {
            return false;
        }

        int divisor = 1;
        int perfectDivisor = 0;

        while (divisor < number) {
            if (number % divisor == 0) {
                perfectDivisor += divisor;
                divisor += 1;
            } else {
                divisor += 1;
            }
        } if (perfectDivisor == number) {
            return true;
        }
        return false;

    }
}
