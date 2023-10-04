public class EvenDigitSums {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));

    }
    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int evenSum = 0;
        int endDigit;

        while (number > 0) {
            endDigit = number % 10;
            number = number / 10;

            if (endDigit % 2 == 0) {
                evenSum += endDigit;
            } else {
                continue;
            }


        } return evenSum;
    }
}
