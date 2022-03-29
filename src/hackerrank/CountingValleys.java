package hackerrank;

import java.io.*;
import java.util.Scanner;

public class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int level = 0; //0 is sea level pos = above neg = below
        int numValleys = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                if (level == -1) {
                    numValleys++;
                }
                level++;
            }
            if (path.charAt(i) == 'D') {
                level--;
            }
        }
        return numValleys;

    }



    public static void main(String[] args) throws IOException {
        System.out.println(countingValleys(8, "UDDDUDUU"));


    }
}
