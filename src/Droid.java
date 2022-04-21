public class Droid {
    //Initlializing instances valraibles
    final private String name;
    private int batteryLevel;

    //Constructor
    public Droid(String droidName){
        this.name = droidName;
        batteryLevel = 100;
    }

    //Method "performing task" --> String task + lower "batteryLevel" of 10
    private void performTask(String task){
        System.out.println(name + " is performing: " + task);
        batteryLevel -= 10;
    }
    //Method "energyReport" --> returning energyLevel
    private void energyReport(){
        System.out.println("My energy level is now : " + batteryLevel);
    }

    //MAIN METHOD
    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.performTask("Cleaning kitchen");
        Codey.energyReport();
    }

    //toString method of the Droid class
    public String toString(){
        return "Hello, this Droid name is " + name;
    }

}
