import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number1, number2, number3;
        int counter = 0;
        
        do {
            number1 = rand.nextInt(1000);
            number2 = rand.nextInt(1000);
            number3 = rand.nextInt(1000);
            counter++;
            System.out.println("Number 1: " + number1 + ", Number 2: " + number2 + ", Number 3: " + number3);
        } while ((number1 % 2 != 0 || number2 % 2 != 0 || number3 % 2 == 0));

        
        System.out.println("Result obtained in " + counter + " attempt(s)");
    }
    
    }