public class linearSearch {
    public static void main(String[] args) {

        int[] arr = { 1, 24, 12, 34, 3, 5 };
        int number = 34;

        boolean answer = searchNum(arr, number);

        System.out.println(answer);

    }
    public static boolean searchNum(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }

        return false;
        
    }
}
