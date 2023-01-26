import java.util.Scanner;

public class GameManager {
    public void welcome () {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Hangman! What is your name?");
        String name = in.nextLine();
        System.out.println("Hello " + name + ", here's the rules...I've picked a word and you've got to guess it in 8 tries. Simple stuff, lets play!");
    }

public void livesRemaining () {
        int lives = 8;
        if (lives > 0);
        System.out.println("You have " +  lives + " guesses remaining!");
}

public Boolean compareGuessToWord (String word, String letterGuessed) {
       if (
               word.contains(letterGuessed) == true
       )
       {
           return true;
       }
       else {
           return false;
       }
}

    }



