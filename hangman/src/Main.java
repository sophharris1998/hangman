public class Main {

    static String randomWord = "";
    public static void main(String[] args) {
        GameManager welcomeMessage = new GameManager();
        welcomeMessage.welcome();
        Word startGame = new Word();
        randomWord = startGame.getRandomWord();
    }
}