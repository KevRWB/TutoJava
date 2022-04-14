public class Test {
    //create car constructor

    String carName;
    String carColor;
    int carYear;
    boolean carIsRunning;

    public Test(String name, String color, int year, boolean isRunning) {
        System.out.println("A new car is created");
        carName = name;
        carColor = color;
        carYear = year;
        carIsRunning = isRunning;
    }

    public static void main(String[] args) {
        Test Fiesta = new Test("Fiesta", "white", 2008, true);

        System.out.println("This car is a " + Fiesta.carYear + " from " + Fiesta.carYear + ". His color is " + Fiesta.carColor);
    }
}
