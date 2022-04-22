public class Monster {

    //Static variables
    protected static int id = 2;
    protected static String gender = "Monster";
    protected static boolean isScary = true;

    //Non-static Variables
    String type;
    String name;
    int health;
    int att;
    int initiative;
    int moral;

    //Constructor for Monster
    public Monster(String type, String name, int health, int att, int initiative, int moral){
        this.type = type;
        this.name = name;
        this.health = health;
        this.att = att;
        this.initiative = initiative;
        this.moral = moral;
    }

    //Method setRidiculous --> change isScary to "false"
    public void setRidiculous(){
        isScary = false;
    }


    //Main method
    public static void main(String[] args){
        Zombie creeper = new Zombie();
        creeper.setName("Creeper");
        System.out.println(creeper);
    }


    //toString method to print Monster(s) attributes
    public String toString(){
        return "This monster is a " + this.name;
    }
}
