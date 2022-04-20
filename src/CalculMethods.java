import java.util.ArrayList;

public class CalculMethods {

    ArrayList <Integer> randomIntegerList = new ArrayList<>();


    CalculMethods (){

    }

    public int random1To10(){
        return  (int)(Math.random()*10)+1;
    }

    public double random0To10(){
        return Math.random()*10;
    }


    public static void main (String[] args){
        CalculMethods newCalculMethod = new CalculMethods();

        //create ArrayList of 30 random int from 1 to 10
        int numOne = newCalculMethod.random1To10();
        int count = 1;

        while (count <= 30){
            newCalculMethod.randomIntegerList.add(numOne);
            numOne = newCalculMethod.random1To10();
            count ++;
        }

        //!!!!!!!!!!!!!!!!count the number of the smallest value // FIX THIS METHOD !!!!!!!!!!!!!!!!!!!!!
        int countMin = 0;
        int minNum = 0;
        for (int i = 0; i < newCalculMethod.randomIntegerList.size(); i++){
            int num = newCalculMethod.randomIntegerList.get(i);
            if(num <= minNum){
                minNum = num;
                countMin ++;
            }
        }

        System.out.println("This Array list contain " + newCalculMethod.randomIntegerList.size() + " items.");
        System.out.println(newCalculMethod.randomIntegerList);
        System.out.println("The minimum number is " + minNum + " and it occurs " + countMin + " times");

    }
}
