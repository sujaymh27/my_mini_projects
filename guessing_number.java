import java.util.Scanner;
import java.util.Random;
public class guessing_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int max_trials=10;
        int int_trial= 0;
        int number_to_guess= rand.nextInt(100)+1;

        System.out.println("                 --------Hello!-------- \n ------------ Well come to number guessing game-----------  ");
        System.out.println("Guess the number between 0 - 100");
        System.out.println("ENTER THE NUMBER---");
        while (int_trial<=10) {
            int trail = sc.nextInt();
            if (trail > number_to_guess) {
                System.out.println("OOHH.......! \n very high number enter lower number");
            } else if (trail < number_to_guess) {
                System.out.println("OOHH.......! \n very low number enter higher number");
            } else if (trail == number_to_guess) {
                System.out.println("Hee..........\n you guessed correct number");
            } else {
                System.out.println("you lost----------\n better luck next time");
            }

            int_trial++;
            if (int_trial==max_trials) {
                System.out.println("you lost----------\n better luck next time");
            }
        }
        sc.close();
    }

}

