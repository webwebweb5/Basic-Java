import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RPG {
    public static int random(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
    public static String randomEnemies() {

        Random rand = new Random();

        String[] enemies = { "Skeleton", "Undead", "Slime", "Orc", "Goblin" };

        String enemy = enemies[rand.nextInt(enemies.length)];

        return enemy;

    }
    public static String Gacha() {

        String[] gachaItems = { "All status +20", "All status +50", "All status +100", "All status +999" };
        int[] rate = { 700, 250, 40, 10 };

        int total = 0;

        for (int i = 0; i < rate.length; i++) {
            total += rate[i];
        }

        int randomNumber = (int)(Math.random() * total);
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
    public static void main(String[] args) {
        
        // user input
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        // Gacha
        String[] gachaItems = { "All status +20", "All status +50", "All status +100", "All status +999" };
        int[] rate = { 700, 240, 50, 10 };
        String item = "";
        int gachaTicket = 1;
        int gachaTicketDorpChance = 25; // percentage

        // dungeon variables
        int maxDungeonLevel = 10;
        int dungeonLevel = 1;
        
        // enemy variables
        int maxEnemyHealth = 75;
        int minEnemyHealth = 50;
        int maxEnemyAttackDamage = 25;
        int minEnemyAttackDamage = 10;

        // Player variables
        int maxHealth = 100;
        int remainingHealth;
        int health = 100;
        int minAttackDamage = 20;
        int maxAttackDamage = 50;
        int playerLevel = 1;
        int playerLevelBefore = 1;
        int playerEXP = 0;
        int maxEXP = (int) (playerLevel * 100 * 1.5);

        // others material
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDorpChance = 50; // percentage
        int runAwayCount = 3;

        // To store the item in term of list
        ArrayList<String> itemStore = new ArrayList<String>();

        boolean running = true;

        System.out.println("Welcome to the Dungeon!");

        // Game start
        GAME:
        while (running) {
            System.out.println("-----------------------------------\n");

            System.out.println("\tDungeon LV " + dungeonLevel);
            
            int enemyHealth = random(minEnemyHealth, maxEnemyHealth);
            String enemy = randomEnemies(); // Random enemies
            System.out.println("\t# " + enemy + " has appeared! #");

            event:
            while (enemyHealth > 0) {
                System.out.println("\n\tLevel: " + playerLevel);
                System.out.println("\tEXP: " + playerEXP + "/" + maxEXP);
                System.out.println("\n\tYour HP: " + health + "/" + maxHealth);
                System.out.println("\n\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Use Potion");
                System.out.println("\t3. Gacha (+Status) ");
                System.out.println("\t4. Inventory");
                System.out.println("\t5. Status");
                System.out.println("\t6. Run away! ( " + runAwayCount + " time(s) )");
                System.out.println("\t7. End");

                String userEvent = input.nextLine(); // nextLine() -> returns the input that was skipped

                if (userEvent.equals("1")) { // combat system
                    int damageDealt = random(minAttackDamage, maxAttackDamage);
                    int damageTaken = random(minEnemyAttackDamage, maxEnemyAttackDamage);
                    
                    enemyHealth -= damageDealt;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                    if (enemyHealth < 1) {
                        break event;
                    }

                    health -= damageTaken;

                    System.out.println("\t> You received " + damageTaken + " in retaliation!");

                    if (health < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!\n");
                        break;
                    }
                } else if (userEvent.equals("2")) { // Use potion
                    if (health == maxHealth) {
                        System.out.println("\n\t> Can not use a potion, Your HP is already full.");
                        continue event;
                    }
                    if (numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        if (health > maxHealth) {
                            remainingHealth = health - maxHealth;
                            health = health - remainingHealth;
                        }
                        numHealthPotions--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + " HP."
                                        + "\n\t> You now have " + health + " HP."
                                        + "\n\t> You have " + numHealthPotions + " health potion(s) left.\n");
                    } else {
                        System.out.println("\t> You have no health potion left!");
                    }
                } else if (userEvent.equals("3")) { // Gacha

                    if (gachaTicket < 1) {
                        System.out.println("\t> You don't have any gacha ticket left!");
                    } else {
                        System.out.println("\n\tYou have " + gachaTicket + " Gacha ticket(s)");
                        System.out.println("\n\tItems list: \n");
                        for (int i = 0; i < gachaItems.length; i++) {
                            System.out.println("\t- " + gachaItems[i] + " rate: " + (rate[i]/10) + "%");
                        }

                        System.out.println("\n\t1. Gacha");
                        System.out.println("\t2. Back");

                        userEvent = input.nextLine();

                        if (userEvent.equals("1")) {
                            item = Gacha();
                            itemStore.add(item);
                        } else if (userEvent.equals("2")) {
                            continue event;
                        }

                        if (item == gachaItems[0]) {
                            maxAttackDamage += 20;
                            minAttackDamage += 20;
                            maxHealth += 20;
                            health += 20;
                        } else if (item == gachaItems[1]) {
                            maxAttackDamage += 50;
                            minAttackDamage += 50;
                            maxHealth += 50;
                            health += 50;
                        } else if (item == gachaItems[2]) {
                            maxAttackDamage += 100;
                            minAttackDamage += 100;
                            maxHealth += 100;
                            health += 100;
                        } else if (item == gachaItems[3]) {
                            maxAttackDamage += 999;
                            minAttackDamage += 999;
                            maxHealth += 999;
                            health += 999;
                        }
                        gachaTicket--;
                    }

                } else if (userEvent.equals("4")) { // Show list of items
                    System.out.println("\n\t=====================");
                    System.out.println("\t Items list: \n");
                    if (item != "") {
                        for (int i = 0; i < itemStore.size(); i++) {
                            System.out.println("\t - " + itemStore.get(i));
                        }
                    }
                    System.out.println("\t - Gacha ticket: " + gachaTicket);
                    System.out.println("\t - Health Potion: " + numHealthPotions);
                    System.out.println("\t=====================");

                } else if (userEvent.equals("5")) { // Show status

                    System.out.println("\n\tMy status: ");
                    System.out.print("\n\tHP: " + health + "/" + maxHealth);
                    System.out.println("\tAttack damage: " + minAttackDamage + "~" + maxAttackDamage + "\n");

                } else if (userEvent.equals("6")) { // run away function
                    if (runAwayCount < 1) {
                        System.out.println("\n\t> You can't run away from enemy anymore.");
                        continue event;
                    }
                    System.out.println("\n>> You run away from " + enemy + "!");
                    runAwayCount--;
                    continue GAME;
                } else if (userEvent.equals("7")) { // End game
                    break GAME;
                } else { // Input wrong command
                    System.out.println("\tInvalid command!");
                }

            }

            if (health < 1) {
                System.out.println("You D I E !.\n");
                break;
            }

            if (running) {
                
                System.out.println("-----------------------------------");
                System.out.println(" # " + enemy + " was defeated! #");
                System.out.println(" # You have " + health + " HP left. #");
    
                dungeonLevel++;

                // ########### Level section ########### //
                playerLevelBefore = playerLevel;

                for (int i = 0; i < dungeonLevel; i++) {
                    playerEXP += dungeonLevel * 100 * 1.25;
                }

                while (playerEXP >= maxEXP) {
                    playerEXP -= maxEXP;
                    playerLevel++;
                    maxEXP += playerLevel * 100 * 1.5;
                }

                for (int i = playerLevelBefore; i < playerLevel; i++) {

                    maxHealth += 10;

                    //full health
                    health += maxHealth;
                    if (health > maxHealth) {
                        remainingHealth = health - maxHealth;
                        health = health - remainingHealth;
                    }

                    maxAttackDamage += 10;
                    minAttackDamage += 5;

                }
                // ########### End Level Section ########### //

                // Drop potion
                if (rand.nextInt(100) < healthPotionDorpChance) {
                    numHealthPotions++;
                    System.out.println(" # The " + enemy + " dropped a health potion! #");
                    System.out.println(" # You now have " + numHealthPotions + " health potions. #");
                }

                // Drop gacha ticket
                if (rand.nextInt(100) < gachaTicketDorpChance) {
                    gachaTicket++;
                    System.out.println(" # The " + enemy + " dropped a gacha ticket! #");
                    System.out.println(" # You now have " + gachaTicket + " gacha ticket(s). #");
                }

            } else {
                break;
            }


            System.out.println("-----------------------------------");

            for (int i = dungeonLevel; i <= dungeonLevel; i++) {
                maxEnemyHealth += 25;
                minEnemyHealth += 10;
                maxEnemyAttackDamage += 20;
                minEnemyAttackDamage += 10;
            }

            if (dungeonLevel > maxDungeonLevel) {
                System.out.println("You have cleared the dungeon!");
                break;
            }

            System.out.println("What would you like to do now?");
            System.out.println("1. Continue figthing");
            System.out.println("2. Exit dungeon");

            String userEvent = input.nextLine();

            while (!userEvent.equals("1") && !userEvent.equals("2")) {
                System.out.println("Invalid command!");
                userEvent = input.nextLine();
            }

            if (userEvent.equals("1")) {
                System.out.println("You continue on your advanture!");
            } else if (userEvent.equals("2")) {
                System.out.println("You exit the dungeon, successful from your advanture!");
                break;
            }

        }

        System.out.println("######################");
        System.out.println("# THANK FOR PLAYING! #");
        System.out.println("######################");

        input.close();

    }
}
