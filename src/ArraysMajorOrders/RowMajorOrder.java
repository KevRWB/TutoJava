package ArraysMajorOrders;

import java.util.*;

public class RowMajorOrder {

    public static void main(String[] args){

        int[][] numbers = {{6, 7, 8}, {4, 3, 9}};
        System.out.println("Array : " + Arrays.deepToString(numbers));


        int count;

        for (int i = 0;  i < numbers.length; i++){

            count = 0;
            int rowIndex = i+1;

            System.out.println("Row " + rowIndex);

            for(int j = 0; j < numbers[i].length; j++){
                System.out.print(j + " ");
                count += numbers[i][j];
            }
            System.out.println("\nRow sum = " + count + "\n");

        }
    }
}
