public class myHouse {

    private CreateDog Booby;
    private CreateDog Jul;

    public myHouse (){
        Booby = new CreateDog("Booby", "Brown", 6, 2020);
        Jul = new CreateDog("Jul", "White", 7, 2018);
    }

    public static void main(String[] args){
        myHouse house = new myHouse();

        house.Booby.changeDogName("Roger");
        String newBobbyName = house.Booby.getDogName();
        System.out.println("Bobby is now called : " + newBobbyName);
    }
}
