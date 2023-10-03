public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));

    }

    public static int sumDigits(int number) {   //method to add together each individual digit in a number

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;

    }
}
