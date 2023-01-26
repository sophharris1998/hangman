import java.util.Scanner;

public class GameManager {
    public int lives = 8;
    public void welcome () {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Hangman! What is your name?");
        String name = in.nextLine();
        System.out.println("Hello " + name + ", here's the rules...I've picked a word and you've got to guess it in 8 tries. Simple stuff, lets play!");
    }

public void livesRemaining () {

        if (lives > 0);
        System.out.println("You have " +  lives + " guesses remaining!");
}

public Boolean continueGame (String word, String letterGuessed) {
       if (
               word.contains(letterGuessed) == true
       )
       {
           return true;
       }
       else {
           lives -= 1;
           if (
                   lives == 0
           ) {
               System.out.println("GAME OVER...no guesses left. The word you were trying to guess was " + word);
               return false;
           }
           else {
               System.out.println("You have " + lives + " guesses remaining");
           }
            return true;
       }
}

public Boolean containsFullStop (String word) {
        if (
                word.contains(".")
        ){
            return true;
        }
        else {
            OutputResponse.congrats();
            return false;
        }
}



    }



