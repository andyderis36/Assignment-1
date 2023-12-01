import java.util.Scanner;

public class LoopSum {
    public static void mainLoop() {

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("*       This is Looping Sum & Average!       *");
        System.out.println("**********************************************");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            // Prompt the user to enter an integer value
            System.out.println("Enter an integer value (enter 0 to terminate):");
            int input = scanner.nextInt();

            // Check if the entered value is 0 to terminate the loop
            if (input == 0) {
                break;
            }

            // Check if the entered value is non-positive
            if (input <= 0) {
                System.out.println("Error: Please enter a positive integer!!!");
                continue; // Prompt again
            }

            // Update sum and count
            sum += input;
            count++;

            // Display current sum and average
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + ((double) sum / count));
        }
        
        App.switchMenu();
        // Close the scanner
        scanner.close();
    }
}
