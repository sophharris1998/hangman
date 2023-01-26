public class Main {

    static String randomWord = "";
    public static void main(String[] args) {
        GameManager manageGame = new GameManager();
        manageGame.welcome();
        Word startGame = new Word();
        randomWord = startGame.getRandomWord();
        startGame.displayWord(randomWord);
        manageGame.livesRemaining();
        UserInput letterManage = new UserInput();
        letterManage.typeLetter();
    }
}