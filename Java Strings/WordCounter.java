import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    public static void main(String[] args) {

        String sentence = null;

        if (sentence == null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter sentence: ");
            sentence = sc.nextLine();
        }

        StringTokenizer st = new StringTokenizer(sentence);
        System.out.println("Total words: " + st.countTokens());
    }
}