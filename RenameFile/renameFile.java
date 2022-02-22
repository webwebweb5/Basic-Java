import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class renameFile {
    public static void main(String[] argv) throws IOException {

        // rename only number file.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter path of folder: ");
        String path = input.nextLine();

        File myfolder = new File(path);

        File[] file_array = myfolder.listFiles();

        System.out.print("How many folders in this folder: ");
        int remainFolder = input.nextInt();

        String[] file_name_String = new String[file_array.length - remainFolder];

        // Store file name(String) in file_name_String array.
        for (int i = 0; i < file_array.length; i++) {
            if (file_array[i].isFile()) {
                file_name_String[i] = file_array[i].getName();
            }
        }

        // Create file_name_int array
        int[] file_name_int = new int[file_name_String.length];

        // Change string array to int array
        //System.out.println(Arrays.toString(file_name_String));
        for (int i = 0; i < file_name_String.length; i++) {
            int iend = file_name_String[i].indexOf(".");
            String subString = "";
            if (iend != -1) {
                subString = file_name_String[i].substring(0, iend);
            }
            int number = Integer.parseInt(subString);
            file_name_int[i] = number;
        }

        Arrays.sort(file_name_int);

        for (int i = 0; i < file_name_String.length; i++) {
            file_name_String[i] = file_name_int[i] + ".jpg";
        }

        //System.out.println(Arrays.toString(file_name_String));

        System.out.print("Rename file start with(number): ");
        int n = input.nextInt();

        for (int i = 0; i < file_array.length - remainFolder; i++) {

            File myfile = new File(path + "\\" + file_name_String[i]);
            String long_file_name = file_name_String[i];
            String zero = (i+n > 9) ? "" : "0";
            String new_file_name = zero + String.valueOf(i+n);
            System.out.println("Change " + long_file_name + " to " + new_file_name + ".jpg");

            myfile.renameTo(new File(path + "\\" + new_file_name + ".jpg"));
            
        }

        input.close();

    }

}
