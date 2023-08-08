import java.util.Scanner;
public class Guessar_game{
    public static void guessing_Number_Game()
    {
        // scanning the input
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        // number of trials fixed
        int K = 5;
        int i, guess;

        System.out.println("Start  the guesser game by guessing a number between the range 1 to 100");

        int count=0; //counting the number of correct attempts
        for (i = 0; i < K; i++) {

            System.out.println("Guess the number:");
            guess = sc.nextInt();

            if (number == guess) {System.out.println("Congratulations! you guessed correct number");
                count=count+1;
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is greater than the number you guessed " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is less than the number you guessed " + guess);
            }
        }

        if (i == K) {
            System.out.println("You have exceeded the number of trials");

            System.out.println("The number is " + number);
            System.out.println("Number of times you guessed the numbers right: " + count);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        guessing_Number_Game();
    }
}
