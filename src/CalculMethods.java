public class CalculMethods {

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

        int numOne = newCalculMethod.random1To10();
        int count = 1;

        while (numOne != 5 && count < 30){
            System.out.println(numOne);
            numOne = newCalculMethod.random1To10();
            count ++;
        }

        double numTwo = newCalculMethod.random0To10();
        int count2 = 1;

        while (numTwo != 5 && count2 < 30){
            System.out.println(count2 + " : " + numTwo);
            numTwo = newCalculMethod.random0To10();
            count2 ++;
        }

    }
}
