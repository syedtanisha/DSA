import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "i love Codechef";

        String[] words = s.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}