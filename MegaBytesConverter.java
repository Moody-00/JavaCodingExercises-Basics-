public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        long convertedMB = kiloBytes / 1024;
        long remainingKB = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = "
                    + convertedMB + " MB and " + remainingKB + " KB");

        }

    }
}
