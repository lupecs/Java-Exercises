package hackerrank.InterviewChallenges.TwoDArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HourGlass2DArray {
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(-9);
        row1.add(-9);
        row1.add(-9);
        row1.add(1);
        row1.add(1);
        row1.add(1);

        List<Integer> row2 = new ArrayList<>();
        row1.add(0);
        row1.add(-9);
        row1.add(0);
        row1.add(4);
        row1.add(3);
        row1.add(2);

        List<Integer> row3 = new ArrayList<>();
        row1.add(-9);
        row1.add(-9);
        row1.add(-9);
        row1.add(1);
        row1.add(2);
        row1.add(3);

        List<Integer> row4 = new ArrayList<>();
        row1.add(0);
        row1.add(0);
        row1.add(8);
        row1.add(6);
        row1.add(6);
        row1.add(0);

        List<Integer> row5 = new ArrayList<>();
        row1.add(0);
        row1.add(0);
        row1.add(0);
        row1.add(-2);
        row1.add(0);
        row1.add(0);

        List<Integer> row6 = new ArrayList<>();
        row1.add(0);
        row1.add(0);
        row1.add(1);
        row1.add(2);
        row1.add(4);
        row1.add(0);

        arr.add(row1);
        arr.add(row2);
        arr.add(row3);
        arr.add(row4);
        arr.add(row5);
        arr.add(row6);

        System.out.println(hourglassSum(arr));


    }
    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    private static final int ROWS_IN_HOUR_GLASS = 3;
    private static final int COLUMNS_IN_HOUR_GLASS = 3;

    public static int hourglassSum(List<List<Integer>> arr) {
        final int totalStartHourGlassRows = arr.size()-ROWS_IN_HOUR_GLASS+1;
        final int totalStartHourGlassCols = arr.get(0).size()-COLUMNS_IN_HOUR_GLASS+1;

        Integer currMax = null;
        for(int rowIdx=0; rowIdx<totalStartHourGlassRows; rowIdx++) {
            for(int colIdx=0; colIdx<totalStartHourGlassCols; colIdx++) {
                final Integer val1 = arr.get(rowIdx).get(colIdx);
                final Integer val2 = arr.get(rowIdx).get(colIdx+1);
                final Integer val3 = arr.get(rowIdx).get(colIdx+2);
                final Integer val4 = arr.get(rowIdx+1).get(colIdx+1);
                final Integer val5 = arr.get(rowIdx+2).get(colIdx);
                final Integer val6 = arr.get(rowIdx+2).get(colIdx+1);
                final Integer val7 = arr.get(rowIdx+2).get(colIdx+2);
                final Integer sum = val1+val2+val3+val4+val5+val6+val7;
                if(currMax==null || sum > currMax)
                    currMax = sum;
            }
        }

        return currMax;
    }
}
