package hackerrank;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        int testcases = input.nextInt();

        for (int i = 0; i < testcases; i++) {

            try {
                long x = input.nextLong();
                System.out.println(x + " can be fitted in: ");
                //byte
                if (x >= -128 && x <= 127) {
                    System.out.println(" * byte");
                }
                //short
                if (x >= -32768 && x <= 32768) {
                    System.out.println(" * short");
                }
                //int
                if (x >= -2147483648 && x <= 2147483647){
                    System.out.println(" * int");
                }
                //long
                if (x >= -9223372036854775808L && x <= 9223372036854775807L){
                    System.out.println(" * long");
                }

            } catch (Exception e) {
                System.out.println(input.next() + " cannot be fitted anywhere");
            }
        }
    }
}
