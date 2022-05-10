package hackerrank.InterviewChallenges.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLeftRotation {

    //a = array of n integers to rotate
    //d = number of rotations

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int len = a.size();
        if (len <= 1) return a;
        for (int i = 0; i < d; i++) {
            a.add(a.get(0));
            a.remove(0);
        }
        return a;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int rotations = 5;

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(rotLeft(arr, rotations));
    }

}
