package hackerrank.InterviewChallenges.Sorting.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndArray {

    /* Find an element of the array such that the sum of
    all elements to the left is equal
    * to the sum of all elements to the right*/

    public static String balancedSums(List<Integer> arr) {
        int x = 0;
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }

        for (int y : arr) {
            if (2 * x == sum - y) {
                return "YES";
            }
            x = x + y;
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            System.out.println(balancedSums(list));
        }
        sc.close();
    }
}
