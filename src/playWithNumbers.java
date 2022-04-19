import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
public class playWithNumbers {



    //main method
    public static void main(String[] args){
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        int numberListSize = numbersList.size();

        System.out.println(numberListSize);

        if (args.length != 0){
            for (String arg : args){
                String str = arg;
                int num = Integer.parseInt(str);

                numbersList.add(num);

                System.out.println(numbersList);
            }
        }else {
            System.out.println("No Argument");
        }
    }

}

