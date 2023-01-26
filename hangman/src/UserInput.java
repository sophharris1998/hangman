import java.util.Scanner;

public class UserInput {
    public void typeLetter () {
        boolean stopWordGuessLoop = false;
        while (stopWordGuessLoop==false) {
            Scanner in = new Scanner(System.in);
            System.out.println("Go ahead and guess a letter");
            String letterGuessed = in.nextLine();
            Boolean lengthOfLetter = checkLetter(letterGuessed);
            if (
                    lengthOfLetter == false
            ) {
                System.out.println("Please only enter one letter at a time, ");
            }
            else {
                stopWordGuessLoop = true;
            }
        }
    }

    public static Boolean checkLetter (String letter) {
        if (
                letter.length() > 1
        ) {
            return false;
        }
            else {
            return true;
        }
    }
}
