package hackerrank.InterviewChallenges.DictionariesAndHashmaps;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashTablesRansomNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String, Integer> words = new HashMap<>();

        for (String word : magazine) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        for (String word : note) {
            int value = (words.getOrDefault(word, -1) -1);

            if (value < 0) {
                System.out.println("No");
                return;
            }

            words.put(word, value);
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        String magazine = sc.nextLine();
    }
}
