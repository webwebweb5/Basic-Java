import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class path {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

        System.out.println(path);

        File myfolder = new File(path);

        File[] file_array = myfolder.listFiles();

        String[] arr = new String[file_array.length - 1];
        
        for (int i = 0; i < file_array.length; i++) {
            if (file_array[i].isFile()) {
                arr[i] = file_array[i].getName();
            }
        }

        System.out.println(Arrays.toString(arr));

        input.close();
    }
}
