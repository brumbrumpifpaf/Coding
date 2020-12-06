package studia;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void guessingNumberGame() { 
        Scanner sc = new Scanner(System.in); 
        Random rand = new Random();
  
        // unknown number from 1 to n (n = 1000)
        int number = rand.nextInt(1000);
        int guess; 
        System.out.println("Guess the number:"); 
        // input for guessing 
        guess = sc.nextInt();
        int x = Math.abs(number - guess);
        int K = x;

        // first guess
        if (number == guess) { 
            System.out.println("You guessed the number."); 
        } else System.out.println("Cold.");

        while (number != guess) { 
            System.out.println("Guess the number:"); 
            // input for guessing 
            guess = sc.nextInt(); 
            x = Math.abs(number - guess);
            if (number == guess) { 
                System.out.println("You guessed the number."); 
                break; 
            } 
            else if (K < x) { 
                System.out.println("Cold."); 
            } 
            else System.out.println("Warm.");
            K = x;
        } 
  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guessingNumberGame();
	}

}
