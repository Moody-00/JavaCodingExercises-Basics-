public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(isValid(1051));

    }
    public static boolean hasSameLastDigit(int x, int y, int z) {       //checks if the last digits of any numbers are shared

        if ((x >=10) && (x <= 1000) &&
        (y >=10) && (y <= 1000) &&
        (z >=10) && (z <= 1000)) {

            int xlastDigit = x % 10;
            int ylastDigit = y % 10;
            int zlastDigit = z % 10;

            if ((xlastDigit == ylastDigit) ||
            (xlastDigit == zlastDigit) ||
                    (ylastDigit == zlastDigit)) {
                return true;
            }

            } return false;
        }
        public static boolean isValid(int number) {

        if ((number >= 10) && (number <= 1000)) {
            return true;
        } else {
            return false;
        }

        }
    }


