import java.util.Scanner;

public class Triangle {

   public static void mainTri() {

      System.out.println(" ");
      System.out.println("**********************************************");
      System.out.println("*        This is Triangle Determiner!        *");
      System.out.println("**********************************************");
      System.out.println(" ");
      mainInput();
   }

   public static void mainInput() {

      // Prompt input sides of the triangle
      double side1, side2, side3;
      side1 = getValidInput("Enter the length of side 1: ");
      side2 = getValidInput("Enter the length of side 2: ");
      side3 = getValidInput("Enter the length of side 3: ");

      // If-else statements to determine triangle
      if (side1 == side2 && side2 == side3) {
         System.out.println("It is Equilateral Triangle. \n");

      } else if (side1 == side2 || side1 == side3 || side2 == side3) {
         System.out.println("It is Isosceles Triangle. \n");

      } else {
         System.out.println("It is Scalene Triangle. \n");
      }

      App.switchMenu();
   }

   // Validate input as Double Number
   private static double getValidInput(String prompt) {

      Scanner scanner = new Scanner(System.in);
      double result;

      while (true) {
         System.out.print(prompt);
         if (scanner.hasNextDouble()) {
            result = scanner.nextDouble();
            break; // Break the loop if a valid double is entered

         } else {
            System.out.println("Invalid input. Please enter a number!!!. \n");
            scanner.next(); // Consume the invalid input
         }
      }
      
      return result;
   }
}
