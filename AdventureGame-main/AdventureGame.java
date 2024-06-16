import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You wake up in a dark forest. Do you want to go left or right?");

        String choice1 = scanner.nextLine();

        if (choice1.equalsIgnoreCase("left")) {
            leftPath(scanner);
        } else if (choice1.equalsIgnoreCase("right")) {
            rightPath(scanner);
        } else {
            System.out.println("Invalid choice. Please start again.");
        }

        scanner.close();
    }

    private static void leftPath(Scanner scanner) {
        System.out.println("You encounter a friendly traveler. Do you want to talk or walk away?");
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("talk")) {
            System.out.println("The traveler gives you helpful advice. You win!");
        } else if (choice.equalsIgnoreCase("walk away")) {
            System.out.println("You walk away and get lost. Game over.");
        } else {
            System.out.println("Invalid choice. Please start again.");
        }
    }

    private static void rightPath(Scanner scanner) {
        System.out.println("You face a wild animal. Do you want to fight or run?");
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("fight")) {
            System.out.println("You bravely fight and win. You win!");
        } else if (choice.equalsIgnoreCase("run")) {
            System.out.println("You run away safely. You live to see another day.");
        } else {
            System.out.println("Invalid choice. Please start again.");
        }
    }
}
