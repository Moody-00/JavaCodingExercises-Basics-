public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020));
    }
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
    public static int getDaysInMonth(int month, int year) {

        if ((year < 1) || (year > 9999)) {
            return -1;
        } else if (month == 1) {
            return 31;
        } else if (((month == 2) && (isLeapYear(year) == true))) {
            return 29;
        } else if ((month == 2) && (isLeapYear(year) == false)) {
            return 28;
        } else if (month == 3) {
            return 31;
        } else if (month == 4) {
            return 30;
        } else if (month == 5) {
            return 31;
        } else if (month == 6) {
            return 30;
        } else if (month == 7) {
            return 31;
        } else if (month == 8) {
            return 31;
        } else if (month == 9) {
            return 30;
        } else if (month == 10) {
            return 31;
        } else if (month == 11) {
            return 30;
        } else if (month == 12) {
            return 31;
        } else {
            return -1;
        }

    }
}
