package Challenges.MiddleCharacter;

public class Kata {

    public static String getMiddle(String word) {
        int wordLength = word.length();
        return (wordLength % 2 != 0) ?  String.valueOf(word.charAt(wordLength / 2)) :
                word.substring(wordLength / 2 - 1, wordLength / 2 + 1);
    }
}
