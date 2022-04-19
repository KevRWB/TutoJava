public class addNumbers {


    public addNumbers(){

    }

    public int add(int numberOne, int numberTwo){

        int result = numberOne + numberTwo;
        return result;
    }

    //main method
    public static void main (String[] args){
        addNumbers numberOne = new addNumbers();

        int resultAddMethod = numberOne.add(1, 2);
        System.out.println(resultAddMethod);

        if (args.length == 1){
            System.out.println(args[0]);
        } else {
            System.out.println("No argument");
        }

    }


}
