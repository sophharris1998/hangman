import java.util.Scanner;

public class GameManager {
    public void welcome () {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Hangman! What is your name?");
        String name = in.nextLine();
        System.out.println("Hello " + name + ", here's the rules...I've picked a word and you need to guess letters till you work out the word. If you know the word before 8 guesses you win else I win. Simple stuff, lets play!");
    }

}



