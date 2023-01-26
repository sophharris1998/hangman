import java.util.Random;

public class Word {
    public String[] words = {"dog", "lego", "beach", "book", "water", "flower", "tree"};

    public String getRandomWord () {
        Random rand = new Random();
        String randomWord = words[rand.nextInt(words.length)];
        return randomWord;
    }

    public String displayWord (String randomWord, String guessedLetters) {
        String dotString = "";
        for (int i=0; i < randomWord.length(); i++) {


            if (
                    guessedLetters.contains(Character.toString(randomWord.charAt(i)))
            )
            {
                dotString += randomWord.charAt(i);
            }
            else {
                dotString += ".";
            }
        }
        System.out.println("The word you are guessing is " + dotString);






        return dotString;
    }}
