import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.Duration;


public class GuessNumber3 {
    public static void main(String[] args) {
    int randomNumber = (int) (Math.random() * 1000); // Génère un nombre aléatoire entre 0 et 999
    int guess; //
    int attempts = 0;
       // Creating an object of LocalTime class by
      // declaring a variable to store LocalTime 
    LocalTime StartTime = LocalTime.now();

     // Create OffsetTime object 
        OffsetTime offsettime = OffsetTime.of( LocalTime.now(), ZoneOffset.UTC); 

          // Initializing Duration variable
      Duration duration = Duration.between(LocalTime.NOON,OffsetTime.now()); 

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
       // Print and display the LocalTime value
       System.out.println("Local time value : "+StartTime);  
        // Print time 
        System.out.println(  "TIME: " + offsettime);
            
      // Printing difference between time in seconds
      System.out.println(duration.get(ChronoUnit.SECONDS));   

}
}
