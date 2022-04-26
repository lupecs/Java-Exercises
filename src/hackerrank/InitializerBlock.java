package hackerrank;

import java.util.Scanner;

public class InitializerBlock {

    /*Static Block*/


    static int B;
    static int H;
    static boolean flag;

    static{
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();

        if (B <= 0 && H >= 0){
            flag = true;
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }


    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
