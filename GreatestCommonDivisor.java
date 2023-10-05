public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));

    }
    public static int getGreatestCommonDivisor(int first, int second) {

        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int commonDivisors = 0;

        for (int divisor = 1; (divisor <= first) && (divisor <= second); divisor++) {
            if ((first % divisor == 0) && (second % divisor == 0)) {
                if (commonDivisors < divisor) {
                    commonDivisors = divisor;
                }

            }
        } return commonDivisors;
    }
}
