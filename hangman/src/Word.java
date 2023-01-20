import java.util.Random;

public class Word {
    public String[] words = {"dog", "lego", "beach", "book", "water", "flower", "tree"};

    public String getRandomWord () {
        Random rand = new Random();
        String randomWord = words[rand.nextInt(words.length)];
        return randomWord;
    }
}
