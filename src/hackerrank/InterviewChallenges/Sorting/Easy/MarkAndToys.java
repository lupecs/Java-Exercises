package hackerrank.InterviewChallenges.Sorting.Easy;

//works

import java.util.*;

public class MarkAndToys {
    public static int maximumToys(List<Integer> prices, int k){
        int length = prices.size();
        Collections.sort(prices);

        int toyCount, sum;

        sum = toyCount = 0;

        for (int i = 0; i < length; i++) {
            sum += prices.get(i);
            if (sum <= k) {
                toyCount++;
            } else {
                break;
            }
        }
        return toyCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> prices = new ArrayList<>(n);

        for (int i = 0; i < n; i++){
            prices.add(sc.nextInt());
        }

        int j = maximumToys(prices, k);
        System.out.println(j);
    }
}
