public class Shop {

    String shopName;
    String itemsSold;
    String shopOwner;
    int idNumber;
    boolean isOpen;
    int ratingNumbers = 0;
    double shopRating;
    boolean validRate;

    //constructor
    public Shop (String name, String items, String owner, int number ,boolean open, double rating) {
        shopName = name;
        itemsSold = items;
        shopOwner = owner;
        idNumber = number;
        isOpen = open;
        shopRating = rating;
    }

    //rating method for shops
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

    //Main method

    public static void main (String[] args) {
        Shop playingForFun = new Shop("Play for fun", "games", "Martin Mystère", 666, true, 0);
        Shop cookieShop = new Shop("The tasty Cookie", "cookies", "Maïte", 3, true, 0);
        Shop potionShop = new Shop("Potions for all", "magic potions", "Henry Podbeurre", 33, false, 0);
        Shop sportWear = new Shop("La poule sportive", "sports wear", "Mickael Zidane", 23, true, 0);

        playingForFun.rateShop(3);
        playingForFun.rateShop(2);
        playingForFun.rateShop(7);

        System.out.println(playingForFun);
    }

    public String toString(){
        return "This shop is the \"" + shopName + "\". It sells " + itemsSold + " and it's owned by " + shopOwner + ". " +
                "It has the number " + idNumber + " and it's rated " + shopRating + "/5.";
    }
}
