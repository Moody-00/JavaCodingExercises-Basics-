public class ConvertToCentimetres {
    public static void main(String[] args) {

        System.out.println("This is equal to " + convertToCentimetres(6, 1) + " cm.");
        System.out.println("This is equal to " + convertToCentimetres(70) + " cm");


    }
    public static double convertToCentimetres(int inches) {
        return inches * 2.54;
    }
    public static double convertToCentimetres(int feet, int inches) {
        return convertToCentimetres((feet * 12) + inches);

    }
}
