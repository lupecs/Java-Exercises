package hackerrank.InterviewChallenges.Sorting.Medium;

import java.util.List;

public class FraudulentActivityNotifications {
    public static int activityNotifications(List<Integer> expenditure, int d) {
        if (expenditure.size() == d) {
            return 0;
        }
        int notices = 0;

        int[] arr = new int[201];

        for (int i = 0; i < d; i++) {
            arr[expenditure.get(i)]++;
        }

        for (int i = d; i < expenditure.size(); i++) {
            if (expenditure.get(i) >= median(arr, d)) {
                notices++;
            }
            arr[expenditure.get(i - d)]--;
            arr[expenditure.get(i)]++;
        }

        return notices;
    }

    public static int median(int[] arr, int d) {
        int count = 0;
        int med = -1;

        if (d % 2 == 0) {
            int m1 = -1;
            for (int i = 0; i < arr.length; i++) {
                count += arr[i];
                if (med == -1 && count >= d / 2) {
                    med = i;
                }
                if (m1 == -1 && count >= d / 2 + 1) {
                    m1 = i;
                    break;
                }
            }
            med += m1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                count += arr[i];
                if (count > d / 2){
                    med = i * 2;
                    break;
                }
            }
        }
        return med;
    }
}
