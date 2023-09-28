public class Sum3And5Challenge {
    public static void main(String[] args) {

        int sum = 0;
        int count = 1;

        for (int i = 1; i <= 1000; i++) {       //cycle through numbers 1 - 1000
            if (byThreeAndFive(i)) {
                count++;
                sum = sum + i;
                System.out.println(i + " is a match!");
            } else if (count > 5) {             //stops the loop once 5 results reached
                System.out.println("The sum of these numbers is " + sum);
                break;
            }
        }
    }
    public static boolean byThreeAndFive(int i) {       //method to check if it is divisible by 3 and 5

        if ((i % 3 == 0) && (i % 5 ==0)) {
            return true;
        } else {
            return false;
        }
    }
}
