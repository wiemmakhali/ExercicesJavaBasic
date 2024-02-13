import java.util.Scanner;

public class App {
  
public static void main(String[] args)  throws Exception 
    {
        /*initialiser */
        
       double f; 
       Scanner scanner = new Scanner(System.in);
        System.out.println (" saisir la temperature Celsius" );
        double c = scanner.nextDouble();
        /* formule f */
        f = (c * 9/5) + 32; 
        System.out.println(   " la  temperature fahrenheit:"  + f); 
        scanner.close();
    } 


}

