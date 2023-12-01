import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("*                                            *");
        System.out.println("*  Welcome to Java App Created by ANDYDERIS  *");
        System.out.println("*                                            *");
        System.out.println("**********************************************");
        System.out.println(" ");

        // Show menu confirmation & option
        switchMenu();
    }

    public static void switchMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to show the menu? (y/n)");

        // Get user confirmation
        char confirmation = scanner.next().charAt(0);

        if (confirmation == 'y' || confirmation == 'Y') {

            int menu = displayMenu();
            do {

                // Now you can use the 'menu' variable as needed
                switch (menu) {
                    case 1:
                        System.out.println("======");
                        System.out.println("Menu 1");
                        System.out.println("======");
                        Triangle.mainTri();
                        break;
                    case 2:
                        System.out.println("======");
                        System.out.println("Menu 2");
                        System.out.println("======");
                        Number.mainNum();
                        break;
                    case 3:
                        System.out.println("======");
                        System.out.println("Menu 3");
                        System.out.println("======");
                        LoopSum.mainLoop();
                        break;
                    case 0:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid menu. Please try again.");
                        switchMenu();
                }
                break;
            } while (menu != 0);
        } else {
            System.out.println("Menu not displayed. Exiting the program. Goodbye!");
        }

        // Close the scanner
        scanner.close();

    }

    public static int displayMenu() {
        Scanner menu = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Triangle Determiner");
        System.out.println("2. Num to Words");
        System.out.println("3. Loop Sum Average");
        System.out.println("0. Exit");

        System.out.println("Enter your menu:");

        // Validate that the user entered an integer
        while (!menu.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            menu.next();
        }
        // scanner.close();

        return menu.nextInt();
    }
}
