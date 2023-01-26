public class Main {

    static String randomWord = "";
    static String userGuesses = "";
    public static void main(String[] args) {
        GameManager manageGame = new GameManager();
        manageGame.welcome();
        Word startGame = new Word();
        randomWord = startGame.getRandomWord();
        startGame.displayWord(randomWord, userGuesses );
        manageGame.livesRemaining();

        Boolean correctGuess = true;
        while (correctGuess == true) {

            UserInput letterManage = new UserInput();
            String usersGuess = letterManage.typeLetter();
            userGuesses += usersGuess;
            startGame.displayWord(randomWord, userGuesses);
            //startGame.displayWord(randomWord, userGuesses );

        if  (
                
        )
        }

    }
}