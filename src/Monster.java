public class Monster extends MonsterAction{

    //Static variables
    protected static int id = 2;
    protected static String gender = "Monster";
    protected static boolean isScary = true;

    //Non-static Variables
    String type;
    String name;
    int health;
    int att;
    int speed;
    int initiative;
    int moral;

    //Constructor for Monster
    public Monster(String type, String name, int health, int att, int speed, int initiative, int moral){
        this.type = type;
        this.name = name;
        this.health = health;
        this.att = att;
        this.speed = speed;
        this.initiative = initiative;
        this.moral = moral;
    }

    //Method setRidiculous --> change isScary to "false"
    public void setRidiculous(){
        isScary = false;
    }


    //Main method
    public static void main(String[] args){
        //create a new Creeper (Monster --> Zombie)
        Creeper creeperOne = new Creeper();
        //Print creeperOne attributes
        System.out.println(creeperOne);

        //Make "fall" creeperOne
        creeperOne.fall(creeperOne);
        //Raise creeperOne
        creeperOne.raise();


    }


    //toString method to print Monster(s) attributes
    public String toString(){
        return "This monster is a " + this.name + ". Type : " + this.type + ", Health : " + this.health +
                ", Att : " + this.att + ", Speed : " + this.speed + ", Initiative : " + this.initiative +
                ", Moral : " + this.moral;
    }
}
