import java.util.Scanner;

public class Main {

    public static void random() {

        int randomNumber = (int) (Math.random()*100);
        randomNumber++;
        boolean hasWon = false;
        Scanner scanner = new Scanner(System.in);


        for (int i=10; i>0; i--){
            System.out.println("You have " + i + " guesses.");
            int guess = scanner.nextInt();

            if (guess < randomNumber){
                System.out.println("The number is larger.");
            }
            else if (guess > randomNumber){
                System.out.println("The number is smaller.");
            }
            if (guess == randomNumber){
                System.out.println("That's right! You win!");
                hasWon = true;
                break;
            }
        }
    if (hasWon = false) {
        System.out.println("You lose! The number was: " + randomNumber);
    }

    }

    public static void main(String [] args){
        System.out.println("I have chosen a random number between 1 and 100");
        System.out.println("Try to guess.");
        System.out.println("You have 10 tries and I will always help you a little. ;)");
        boolean runAgain = true;
        while(runAgain = true){
            random();
        }
    }
}