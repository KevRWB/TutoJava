public class BasicCalcul {

    public BasicCalcul(){
    }
    //addition method
    public int add(int a, int b){
        return a + b;
    }
    //subraction method
    public int subtract(int a, int b){
        return a - b;
    }
    //multiplication method
    public int multiply(int a, int b){
        return a * b;
    }
    //division method
    public int divide(int a, int b){
        return a / b;
    }
    //modulo method
    public int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] argd){
        //create myCalculator Instance of Calculator
        BasicCalcul myCalculator = new BasicCalcul();

        //calling calcul methods
        int add = myCalculator.add(5, 7);
        int subtract = myCalculator.subtract(45, 11);
        int multiply = myCalculator.multiply(3, 5);
        int divide = myCalculator.divide(24, 4);
        int modulo = myCalculator.modulo(56, 5);

        //Printing results
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

    }

}
