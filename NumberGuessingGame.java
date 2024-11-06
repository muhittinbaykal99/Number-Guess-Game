import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;

        while(true){
            System.out.println("Enter your guess (1-100): ");

            int playerGuess = scanner.nextInt();

            if(playerGuess == randomNumber){
                System.out.println("Congrats! You Win!");
                break;
            }
            else if(playerGuess > randomNumber){
                System.out.println("Wrong! It's Lower. Try Again.");
            }
            else{
                System.out.println("Wrong It's Higher. Try Again.");
            }
        }
    }
}
