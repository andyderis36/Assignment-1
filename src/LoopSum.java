import java.util.Scanner;

public class LoopSum {
    public static void mainLoop() {

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("*       This is Looping Sum & Average!       *");
        System.out.println("**********************************************");
        System.out.println(" ");

        int sum = 0;
        int count = 0;

        while (true) {
            // Prompt the user to enter an integer value
            int input = getValidInput("Enter an integer value (enter 0 to terminate): ");

            // Check if the entered value is 0 to terminate the loop
            if (input == 0) {
                break;
            }

            // Check if the entered value is non-positive
            if (input <= 0) {
                System.out.println("Error! Please enter a positive integer! \n");
                continue; // Prompt again
            }

            // Update sum and count
            sum += input;
            count++;

            // Display current sum and average
            //System.out.println("\n");
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + ((double) sum / count) + "\n");
        }
        
        // Return Main Menu
        App.switchMenu();
    }

    private static Integer getValidInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int result;

        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                break; // Break the loop if a valid double is entered
            } else {
                System.out.println("Invalid input. Please enter a integer! \n");
                scanner.next(); // Consume the invalid input
            }
        }
        return result;

    }

}
