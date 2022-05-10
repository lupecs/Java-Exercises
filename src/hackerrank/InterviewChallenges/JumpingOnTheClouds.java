package hackerrank.InterviewChallenges;

import java.util.List;

public class JumpingOnTheClouds {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        int numJumps = 0;
        int i = 0;

        int size = c.size();

      while(i < size - 1){
          if (i + 2 == size || c.indexOf(i+2) == 1) {
              i++;
              numJumps++;
          } else {
              i += 2;
              numJumps++;
          }
        }
      return numJumps;
    }

    public static void main(String[] args) {


    }
}
