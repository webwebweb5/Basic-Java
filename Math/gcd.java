public class gcd {
    public static void main(String[] args) {
        
        double m = 16;
        double n = 106;
        double gcd;

        while (m%n != 0) {
            gcd = m%n;
            m = n;
            n = gcd;
            
            if (m%n == 0) {
                System.out.println(n);
            }
        }

    }
}
