import java.util.Scanner;

public class Number {
    private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine" };
    private static final String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen" };
    private static final String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety" };

    public static void mainNum() {

        System.out.println(" ");
        System.out.println("**********************************************");
        System.out.println("*     This is Number to Words Converter!     *");
        System.out.println("********************************************** \n");

        // Prompt the user to input a double value
        double inputValue = getValidInput("Enter a double value: ");

        // Separate the whole number and decimal parts
        long wholeNumber = (long) inputValue;
        int cents = (int) ((inputValue - wholeNumber) * 100);

        // Convert the whole number part to words
        String words = convertToWords(wholeNumber) + " Ringgit";

        // Convert the decimal part to words
        if (cents > 0) {
            words += " and " + convertToWords(cents) + " Cents";
        }

        // Print the result
        System.out.println("Your Input: RM " + inputValue);
        System.out.println(words);
        App.switchMenu();

    }

    private static double getValidInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double result;

        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                result = scanner.nextDouble();
                break; // Break the loop if a valid double is entered
            } else {
                System.out.println("Invalid input. Please enter a double number!!!. \n");
                scanner.next(); // Consume the invalid input
            }
        }
        return result;

    }
    
    private static String convertToWords(long number) {
        if (number == 0) {
            return "Zero";
        }
        
        String words = "";
        
        // Handle billions
        if (number / 1_000_000_000 > 0) {
            words += convertToWords(number / 1_000_000_000) + " Billion ";
            number %= 1_000_000_000;
        }
        
        // Handle millions
        if (number / 1_000_000 > 0) {
            words += convertToWords(number / 1_000_000) + " Million ";
            number %= 1_000_000;
        }
        
        // Handle thousands
        if (number / 1_000 > 0) {
            words += convertToWords(number / 1_000) + " Thousand ";
            number %= 1_000;
        }
        
        // Handle hundreds
        if (number / 100 > 0) {
            words += units[(int) (number / 100)] + " Hundred ";
            number %= 100;
        }
        
        // Handle tens and ones
        if (number > 0) {
            if (number >= 11 && number <= 19) {
                words += teens[(int) (number % 10)] + "-";
            } else {
                words += tens[(int) (number / 10)] + " " + units[(int) (number % 10)] + " ";
            }
        }
        
        return words.trim();
    }
}
