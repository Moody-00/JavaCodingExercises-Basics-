public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(45, 65));

    }
    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            return getDurationString(seconds / 60, seconds % 60);
        } else {
            return ("Invalid data");
        }
    }
    public static String getDurationString(int minutes, int seconds) {

        if ((minutes >= 0) && ((seconds <= 59) && (seconds >= 0))) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        } else {
            return ("Invalid ata");
        }
    }
}
