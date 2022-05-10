package hackerrank.InterviewChallenges.Arrays;

import java.util.List;

public class NewYearChaos {

    //people in queue each wearing an index num from 1 to n
    //any person can bribe the person directly in front to swap positions
    // but still wear original sticker
    //one person can bribe up most 2 others

    /*
    * example:
    *   q = [1,2,3,4,5,6,7,8]
    *   person 5 bribes person 4
    *   q = [1,2,3,5,4,6,7,8]
    *   only one bribe required, print 1
    * */

    //int q[n] = positions of the people after all bribes

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int[] from = new int[q.size()];
        for (int i = 0; i < from.length; i ++)
            from[i] = i+1;

        int count = 0;
        int temp;
        for (int i = 0; i < from.length; i++) {
            // left of i match
            if (q.get(i) == from[i])
                continue;

            // ok
            if (i < from.length-1 && q.get(i) == from[i+1]) {
                temp = from[i];
                from[i] = from[i+1];
                from[i+1] = temp;
                count++;
            } else if (i < from.length-2 && q.get(i) == from[i+2]) {
                temp = from[i];
                from[i] = from[i+2];
                from[i+2] = from[i+1];
                from[i+1] = temp;
                count += 2;
            } else {
                System.out.println("Too chaotic");
                return;
            }

        }
        System.out.println(count);
    }
}
