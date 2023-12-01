import java.util.Scanner;

public class Triangle {

   public static void mainTri() {

      System.out.println(" ");
      System.out.println("**********************************************");
      System.out.println("*        This is Triangle Determiner!        *");
      System.out.println("**********************************************");
      System.out.println(" ");
      
      Scanner inputSides = new Scanner(System.in);

      // Prompt input sides of the triangle
      System.out.print("Enter the length of side 1: ");
      double side1 = inputSides.nextFloat();

      System.out.print("Enter the length of side 2: ");
      double side2 = inputSides.nextFloat();

      System.out.print("Enter the length of side 3: ");
      double side3 = inputSides.nextFloat();

      // If-else statements to determine triangle
      if (side1 == side2 && side2 == side3) {
         System.out.println("It is Equilateral Triangle.");
      } else if (side1 == side2 || side1 == side3 || side2 == side3) {
         System.out.println("It is Isosceles Triangle.");
      } else {
         System.out.println("It is Scalene Triangle.");
      }

      // Close the scanner
      App.switchMenu();
      inputSides.close();
   }
}
