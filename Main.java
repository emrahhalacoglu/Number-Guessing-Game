import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(0,100);
        System.out.println(number);

        int guess = 0;
        int right = 5;
        int[] guessList = new int[5];
        int[] copyOfguessList;

        while (right >= 0)
        {
            if (right == 0)
            {
                System.out.println("You lose !");
                System.out.print("Would you like to try again (y/n) ? : ");
                String selection = input.next();
                if (selection.equals("y"))
                {
                    right = 5;
                }
                else if (selection.equals("n"))
                {
                    break;
                }
                else
                {
                    System.out.println("Wrong input!");
                    break;
                }
            }
            else if (right == 5)
            {
                System.out.print("Input a number between 0 - 100 : ");
                guess = input.nextInt();
                right--;
                guessList[4 - right] = guess;
                System.out.println("You have " + right + " rights.");
                copyOfguessList = Arrays.copyOfRange(guessList, 0,5 - right);
                System.out.println(" Your guesses -> " + Arrays.toString(copyOfguessList));
            }
            else if (guess < 0 || guess > 100)
            {
                System.out.println("Wrong number! ");
                System.out.print("Input a number between 0 - 100 : ");
                guess = input.nextInt();
                right--;
                guessList[4 - right] = guess;
                System.out.println("You have " + right + "rights.");
                copyOfguessList = Arrays.copyOfRange(guessList, 0,5 - right);
                System.out.println(" Your guesses -> " + Arrays.toString(copyOfguessList));
                right = 0;
            }
            else if (guess == number)
            {
                System.out.println("Good job, you lucky bustard!\nYou hit the target..."  );

                break;
            }
            else if (guess > number)
            {
                System.out.println("Go down!");
                System.out.print("Input new number : ");
                guess = input.nextInt();
                right--;
                guessList[4 - right] = guess;
                System.out.println("You have " + right + " rights.");
                copyOfguessList = Arrays.copyOfRange(guessList, 0,5 - right);
                System.out.println(" Your guesses -> " + Arrays.toString(copyOfguessList));
            }
            else
            {
                System.out.println(("Go up!"));
                System.out.print("Input new number : ");
                guess = input.nextInt();
                right--;
                guessList[4 - right] = guess;
                System.out.println("You have " + right + " rights.");
                copyOfguessList = Arrays.copyOfRange(guessList, 0,5 - right);
                System.out.println(" Your guesses -> " + Arrays.toString(copyOfguessList));
            }
        }


    }
}
