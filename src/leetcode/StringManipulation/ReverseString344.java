package leetcode.StringManipulation;

public class ReverseString344 {

    public static void reverseString(char[] s) {
       int left = 0;
       int end = s.length - 1;

       while (left < end) {
           //swap
           char temp = s[left];
           s[left] = s[end];
           s[end] = temp;

           left++;
           end--;
       }
    }

    public static void main(String[] args) {
        char[] arr = {'H', 'a', 'n', 'n', 'a', 'h'};

        char[] arr2 = {'h', 'e', 'l', 'l', 'o'};

        char[] arr3 = {'p', 'o', 't', 'a', 't', 'o'};

        reverseString(arr);
        reverseString(arr2);
        reverseString(arr3);

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr3);
    }

}
