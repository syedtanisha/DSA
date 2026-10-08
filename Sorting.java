import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        ArrayList<String> languages = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            languages.add(sc.nextLine());
        }
        // Sort the ArrayList alphabetically
        Collections.sort(languages);

        
        System.out.println("First language : " + languages.get(0));
        System.out.println("Last language : " + languages.get(languages.size() - 1));
       

        sc.close();
    }
}