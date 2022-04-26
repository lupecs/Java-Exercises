package hackerrank.InterviewChallenges.Sorting;

import java.util.List;

public class BubbleSort {
    public static void countSwaps(List<Integer> a) {
        //track num of swaps
        int numOfSwaps = 0;
        for (int i = 0; i < a.size(); i++){


            for (int j = 0; j < a.size() - 1; j++) {
                if (a.get(j) > a.get(j+1)) {
                    int temp = a.get(j+1);
                    a.set(j+1, a.get(j+1));
                    a.set(j, temp);
                    numOfSwaps++;
                }
            }
        }
        System.out.printf("Array is sorted in %d swaps.\n", numOfSwaps);
        System.out.printf("First Element: %d\n", a.get(0));
        System.out.printf("Last Element: %d\n", a.get(a.size() - 1));
    }
}
