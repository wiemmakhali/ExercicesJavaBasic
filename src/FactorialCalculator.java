import java.util.Scanner;

public class FactorialCalculator {
  
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        
        while (n < 0) {
            System.out.println("Error: Invalid input. Please enter a positive integer.");
            System.out.print("Enter a positive integer: ");
            n = input.nextInt();
        }
        
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + n + " is: " + factorial);
        
        input.close();
    }
}







