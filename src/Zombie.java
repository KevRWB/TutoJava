public class Zombie extends Monster {

    //Constructor for Zombie
    public Zombie(){
        super("Zombie", "???", 20, 15, 10, 90);
    }

    //Set new Name Method
    public void setName(String name){
        if(name.length() >= 20){
            System.out.println("This name is too long, please enter a name of 20 caracters maximum");
        } else{
            this.name = name;
        }
    }
}
