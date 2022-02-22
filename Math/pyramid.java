public class pyramid {
    public static void increaseTriangle(int n) {

        /*

        *
        **
        ***
        ****
        *****

        */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        */

        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

    }
    public static void decreaseTriangle(int n) {

        /*

        *****
         ****
          ***
           **
            *

        */

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void leftTriangle(int n) {

        /*

            *
           **
          ***
         ****
        *****

        */
        
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void rightTriangle(int n) {

        /*

        *****
        ****
        ***
        **
        *

        */

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void hillPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void reverseHill(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i*2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void halfDiamondPattern(int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = n; j > i+1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void diamondPattern(int n) {
        
    }
    public static void main(String[] args) {

        //increaseTriangle(5);
        //decreaseTriangle(5);
        //leftTriangle(5);
        //rightTriangle(5);
        //hillPattern(5);
        //reverseHill(5);
        //halfDiamondPattern(5);

        double midk = Math.ceil(3/2.0);
        System.out.println(midk);

    }
}
