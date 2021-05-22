import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guess = "";
        String secretWord = randomWord(words);
        int guessCount = 0;
        int guessLimit = secretWord.length();
        boolean outOfGuesses = false;
        String hash = "###############";
        StringBuilder sbWord = new StringBuilder(hash);
        System.out.println(hash);

        while (!guess.equals(secretWord) && !outOfGuesses) {
            if (guessCount < guessLimit) {
                System.out.println("Введите слово: ");
                guess = keyboardInput.nextLine().toLowerCase(Locale.ROOT);

                char oneChar = secretWord.charAt(guessCount);
                sbWord.setCharAt(guessCount, oneChar);
                System.out.println(sbWord);
                guessCount++;
            } else {
                outOfGuesses = true;
            }
        }

        if(outOfGuesses){
            System.out.println("Ты проиграл! Сорян!");
        } else {
            System.out.println("Ура, ты победил!");
        }

    }

    private static String randomWord(String[] wordsArray) {
        String newWord = wordsArray[(int) (Math.random() * wordsArray.length)];
        return newWord;
    }

}
