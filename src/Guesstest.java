
     
import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
public class Guesstest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();

      int randomNumber = random.nextInt(100) + 1;
      int userNumber;
      int attempts = 0;
      Duration elapsedTime;

      LocalTime startTime = LocalTime.now();

      do {
         System.out.print("Devinez le nombre : ");
         userNumber = scanner.nextInt();
         attempts++;
         
         if (userNumber < randomNumber) {
            System.out.println("Le nombre à deviner est plus grand");
         } else if (userNumber > randomNumber) {
            System.out.println("Le nombre à deviner est plus petit");
         } else {
            System.out.println("Bravo, vous avez deviné le nombre !");
         }
      } while (userNumber != randomNumber);

      LocalTime endTime = LocalTime.now();
      elapsedTime = Duration.between(startTime, endTime);

      System.out.println("Nombre d'essais : " + attempts);
      System.out.println("Temps pris : " + formatDuration(elapsedTime));
   }

   // Méthode pour formatter la durée en heures, minutes et secondes
   private static String formatDuration(Duration duration) {
      long hours = duration.toHours();
      long minutes = duration.toMinutes() % 60;
      long seconds = duration.getSeconds() % 60;

      return String.format("%02d:%02d:%02d", hours, minutes, seconds);
   }
}

