import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*

Name: Phiriyakorn Maneekongrit
Student ID: 642115031

**Mini-Project**
Course: 953100 701-000 Computer and Programming
Lecturer: KITTITOUCH SUTEECA [Aj. Ball]

*/

public class gacha {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean running = true;

        // To store the item in term of list
        ArrayList<String> itemStore = new ArrayList<String>();

        // Gacha
        String[] gachaItems = { "Wood", "Iron", "Gold", "Diamond" };
        int[] rate = { 600, 250, 100, 50 };
        String item = "";
        int gachaTicket = 10;

        System.out.println("Welcome to the Gacha roller");

        // start
        while (running) {

            System.out.println("-----------------------------------");

            System.out.println("\n\tWhat would like to do?");
            System.out.println("\t1. Gacha");
            System.out.println("\t2. Inventory");
            System.out.println("\t3. Add more gacha");
            System.out.println("\t4. End");

            String userEvent = input.nextLine();

            if (userEvent.equals("1")) { // Gacha system

                if (gachaTicket < 1) {
                    System.out.println("\t> You don't have any ticket gacha left!");
                } else {
                    System.out.println("\n\tYou have " + gachaTicket + " Gacha ticket(s)");
                    System.out.println("\n\tItems list: \n");
                    for (int i = 0; i < gachaItems.length; i++) {
                        System.out.println("\t- " + gachaItems[i] + " rate: " + (rate[i] / 10) + "%");
                    }

                    System.out.println("\n\t1. Roll 1 time");
                    System.out.println("\t2. Roll 10 times");
                    System.out.println("\t3. Back");

                    userEvent = input.nextLine();

                    if (userEvent.equals("1")) {
                        item = Gacha();
                        itemStore.add(item);
                        gachaTicket--;
                    } else if (userEvent.equals("2")) {
                        if (gachaTicket >= 10) {
                            for (int i = 0; i < 10; i++) {
                                item = Gacha();
                                itemStore.add(item);
                                gachaTicket--;
                            }
                        } else {
                            System.out.println("\t> You don't have enough gacha tickets");
                        }
                    } else if (userEvent.equals("3")) {
                        continue;
                    }
                }

            } else if (userEvent.equals("2")) { // Inventory system

                System.out.println("\n\t=====================");
                System.out.println("\t Items list: \n");
                System.out.println("\t - Gacha ticket: " + gachaTicket);

                ArrayList<String> newItemStore = removeDuplicates(itemStore);

                if (item != "") {
                    for (int i = 0; i < newItemStore.size(); i++) {
                        System.out.println("\t - " + newItemStore.get(i) + " x" + countItems(newItemStore.get(i), itemStore));
                    }
                }
                System.out.println("\t=====================");

            } else if (userEvent.equals("3")) { // Add more gacha tickets

                System.out.println("Enter the amount gacha ticket: ");
                int AddMoreGacha = input.nextInt();

                gachaTicket += AddMoreGacha;

            } else if (userEvent.equals("4")) {
                break;
            } else { // Input wrong command
                System.out.println("\tInvalid command!");
            }

        }

        System.out.println("######################");
        System.out.println("# THANK FOR PLAYING! #");
        System.out.println("######################");

        input.close();

    }

    public static String Gacha() {

        String[] gachaItems = { "Wood", "Iron", "Gold", "Diamond" };
        int[] rate = { 600, 250, 100, 50 };

        int total = 0;

        for (int i = 0; i < rate.length; i++) {
            total += rate[i]; //1000
        }

        int randomNumber = (int) (Math.random() * total); // 0 - 1000
        String item = "";

        System.out.println("\nGacha open!!!");

        for (int i = 0; i < rate.length; i++) {
            if (randomNumber <= rate[i]) {
                System.out.println("\n==========================");
                System.out.println("You got ( " + gachaItems[i] + " )");
                System.out.println("==========================\n");
                item = gachaItems[i];
                break;
            } else {
                randomNumber -= rate[i];
            }
        }

        return item;

    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {

        ArrayList<String> newList = new ArrayList<String>();

        for (String element : list) {

            // If this element is not in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);

            }
        }

        return newList;

    }

    public static int countItems(String item, ArrayList<String> itemStore) {
        
        int count = 0;

        if (item == "Wood") {
            int countWood = Collections.frequency(itemStore, "Wood");
            count += countWood;
        } else if (item == "Iron") {
            int countIron = Collections.frequency(itemStore, "Iron");
            count += countIron;
        } else if (item == "Gold") {
            int countGold = Collections.frequency(itemStore, "Gold");
            count += countGold;
        } else if (item == "Diamond") {
            int countDiamond = Collections.frequency(itemStore, "Diamond");
            count += countDiamond;
        }

        return count;

    }
}
