public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printDaysYears(561600);

        

    }
    public static void printDaysYears(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440 ;

            System.out.println(
                    minutes + "min = " + years + " y and " + days + "d");
        }
    }
}
