package other;

import java.util.Scanner;

public class SumDigitsInAnInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer to sum the digits: ");
        long intToSum = input.nextLong();

        System.out.println("The sum of digits in integer is: " + sumDigits(intToSum));
    }

    public static int sumDigits(long n){

        int temp = (int)Math.abs(n);
        int sum = 0;

        while (temp != 0){
            sum += (temp % 10);
            temp = temp / 10;
        }

        return sum;
    }
}
