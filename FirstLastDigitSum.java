public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        } else if (number <= 9) {
            return number + number;
        }

        int sum = 0;
        int lastNumber = number % 10;
        int firstNumber = 0;

        while (number > 0) {
             firstNumber = number /= 10;

             if (firstNumber > 0) {
                 sum = firstNumber + lastNumber;

             }
        }
        return sum;

    }
}
