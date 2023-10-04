public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));

    }

    public static boolean hasSharedDigit(int x, int y) {
        int xlastDigit = 0;
        int ylastDigit = 0;


        if (((x >= 10) && (x <= 99) && (y >= 10) && (y <= 99))) {       //makes it only valid for number sets between 10 and 99
            while (x != 0) {
                xlastDigit = x % 10;                                    //finds last digit of number x

                while (y != 0) {
                    ylastDigit = y % 10;                                //finds last digit of number y

                    if (xlastDigit == ylastDigit) {
                        return true;
                    }
                    y /= 10;
                }
                x /= 10;
            }
            if (xlastDigit == ylastDigit) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}