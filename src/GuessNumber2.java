    import java.util.Scanner;

public class GuessNumber2 {

 
public static void main(String[] args) {
    int randomNumber = (int) (Math.random() * 1000); // Génère un nombre aléatoire entre 0 et 999
    int guess; //
    int attempts = 0;

    Scanner input = new Scanner(System.in);

    do {
        System.out.print("Devinez le nombre (entre 0 et 999) : ");
        guess = input.nextInt();
        attempts++;

        if (guess < randomNumber) {
            System.out.println("C'est plus.");
        } else if (guess > randomNumber) {
            System.out.println("C'est moins.");
        }
    } while (guess != randomNumber);
    

    System.out.println("Félicitations, vous avez trouvé le nombre !");
    System.out.println("Nombre de tentatives : " + attempts);
    
}}
