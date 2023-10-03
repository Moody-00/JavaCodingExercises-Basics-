public class isEvenNumber {
    public static void main(String[] args) {

        int j = 5;
        int countEven = 0;
        int countOdd = 0;

        while ((j <= 20 && countEven < 5)) {
            j++;
            if (isEvenNumber(j)) {
                System.out.println(j + " is an even number");
                countEven += 1;
            } else {
                countOdd += 1;
            }

        } System.out.println(countEven + " even and " + countOdd + " odd numbers found");
    }
    public static boolean isEvenNumber(int number) {

        if ((number > 0) && (number % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
