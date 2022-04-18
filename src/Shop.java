//Import Arrays methods from JAVA
import java.util.Arrays;

public class Shop {

    String shopName;
    String itemsSold;
    String shopOwner;
    int idNumber;
    boolean isOpen;
    int ratingNumbers = 0;
    double shopRating;
    boolean validRate;

    //Array test
    String[] randomArray = {"Chat", "Chien", "Poussin"};
    int[] randomNumbers = new int[5];


    //constructor
    public Shop (String name, String items, String owner, int number ,boolean open, double rating) {
        shopName = name;
        itemsSold = items;
        shopOwner = owner;
        idNumber = number;
        isOpen = open;
        shopRating = rating;
    }

    //rating method for shops - if rate is between 0 & 5 ->
    public void rateShop(double rate) {
        double newRate = rate;
        if (newRate > 5 || newRate <= 0) {
            validRate = false;
            System.out.println("Your rate should be between 0 and 5.");
        } else {
            validRate = true;
            ratingNumbers++;
            System.out.println("Your rating is valid. Thanks for doing it.");
            shopRating = (shopRating + newRate) / ratingNumbers;
            System.out.println("This shop is now rated :" + shopRating + "/5.");
        }
    }

    public void printRandomArray(){
        for (int i = 0; i < randomArray.length; i++){
            System.out.println("An element of the random list : " + randomArray[i]);
        }
    }

    public void addNumbersInRandomNumbers(int number){
        int randomNumbersLength = randomNumbers.length;
        randomNumbers[1] = number;
        System.out.println("Longueur du tableau : " + randomNumbersLength);
    }


    //Main method

    public static void main (String[] args) {

        //creating new Shops
        Shop playingForFun = new Shop("Play for fun", "games", "Martin Mystère", 666, true, 0);
        Shop cookieShop = new Shop("The tasty Cookie", "cookies", "Maïte",  3, true, 0);
        Shop potionShop = new Shop("Potions for all", "magic potions", "Henry Podbeurre",  33, false, 0);
        Shop sportWear = new Shop("La poule sportive", "sports wear", "Mickael Zidane", 23, true, 0);

        //creating Array with shops


        //rating some Shops
        playingForFun.rateShop(3);
        playingForFun.rateShop(2);
        playingForFun.rateShop(7);

        //print Shops String
        Shop[] shopsList = {playingForFun, cookieShop, potionShop, sportWear};
        for (int i = 0; i < shopsList.length; i++){
            System.out.println(shopsList[i]);
        }

        //Test on printing ARRAYS
        sportWear.printRandomArray();
        System.out.println(Arrays.toString(playingForFun.randomArray));

        //add numbers in randomNumbers ARRAY
        sportWear.addNumbersInRandomNumbers(2);

    }
    //Create a String value for every Shop Class
    public String toString(){
        return "This shop is the \"" + shopName + "\". It sells " + itemsSold + " and it's owned by " + shopOwner + ". " +
                "It has the number " + idNumber + " and it's rated " + shopRating + "/5. (number of rates: " + ratingNumbers + ")";
    }
}
