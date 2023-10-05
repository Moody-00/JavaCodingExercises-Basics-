public class FactorPrinter {
    public static void main(String[] args) {
        System.out.println(printFactors(121));

    }
    public static String printFactors(int number) {

        String printFs = "";
        int factors = 0;
        int divider = number;

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        while (divider > 0) {
            if (number % divider == 0) {
                printFs  += divider + " ";
                divider = divider - 1;

            } else {
                divider = divider - 1;
            }
        } return printFs;
    }
}
