//Monster --> Zombie
public class Zombie extends Monster {

    //Constructor for Zombie class
    public Zombie(){
        super("Zombie", "???", 20, 15, 10, 10, 90);
    }

    //Method "fall"
    public void fall(Monster monster){
        speed = 0;
        System.out.println("This zombie has fallen ! His speed is now : " + monster.speed);
    }

    //Method "raise"
    public void raise(){
        speed = 10;
        System.out.println("This zombie just stood up ! His speed is now : " + this.speed);
    }

}
