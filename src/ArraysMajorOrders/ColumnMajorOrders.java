package ArraysMajorOrders;

import java.util.*;

public class ColumnMajorOrders {

    //Initializing "random numbers" array
    protected static int[][] randomNumbers = new int[3][3];
    //Static variables
    protected static int columnIndex;

    //MAIN METHOD
    public static void main(String[] args){
        //Creating randomNumbers array values
        int lineIndex = 0;
//TO FIX SETTING EVERY PLACE WITH A RANDOM NUMBER/////////////////////////////////////////////////////
        for(int[] line: randomNumbers){
            for(int place : line){
                int randomNumber = (int)((Math.random()*10) + 1);
                randomNumbers[lineIndex][place] = randomNumber;
            }
            lineIndex++;
        }
        System.out.println(Arrays.deepToString(randomNumbers));
    }
}
