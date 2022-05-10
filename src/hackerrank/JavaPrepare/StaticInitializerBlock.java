package hackerrank.JavaPrepare;

import java.util.Scanner;

public class StaticInitializerBlock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //breadth
        int B = sc.nextInt();
        //height
        int H = sc.nextInt();

        if (B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(B * H);
        }
    }

}
