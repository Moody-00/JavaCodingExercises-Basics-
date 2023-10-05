public class FlourPacker {
    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        int sum = (bigCount * 5) + smallCount;
        int remainder = goal % 5;

        while (sum >= goal) {
            if (remainder == 0) {
                return true;
            } else if ((smallCount >= goal) || (smallCount >= remainder)) {
                return true;
            } else {
                return false;
            }
        } return false;
    }
}
