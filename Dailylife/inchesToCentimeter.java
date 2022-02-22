public class inchesToCentimeter {
    public static void main(String[] args) {

        int i = 1;
        double centi = 2.54;
        System.out.println("Inches " + " Centimeter ");

        while (i < 200) {
            System.out.printf(i + "          " + "%.2f",centi*i);
            System.out.println();
            i += 2;
        }

    }
}
