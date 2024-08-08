package strings;

public class TextProcessor {
    public static void main(String[] args) {
//        countWords("I love Java");
        reverseString("Hello World");
    }

    private static void reverseString(String text) {
        for (int i = text.length()-1; i >=0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
