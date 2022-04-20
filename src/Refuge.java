public class Refuge {

    private String owner;

    private CreateDog Cookie;
    private CreateDog Smoothie;
    private CreateDog Rookie;

    public Refuge(){
        Cookie = new CreateDog("Cookie", "White", 5, 2020);
        Smoothie = new CreateDog("Smoothie", "Grey", 2, 2021);
        Rookie = new CreateDog("Rookie", "Brown", 4, 2019);

    }

    public static void main(String[] args){
        Refuge firstRefuge = new Refuge();

        firstRefuge.Cookie.changeDogName("Chase");
        System.out.println(firstRefuge.Cookie.getDogName());
        System.out.println(firstRefuge.Cookie.toString());

        String rookieColor = firstRefuge.Smoothie.getDogColor();
        System.out.println("Rookie is " + rookieColor);

        firstRefuge.Smoothie.setEntranceDate(2005);
        int smoothieEntrencedate = firstRefuge.Smoothie.getEntranceDate();
        System.out.println("Smoothie enter the refuge in " + smoothieEntrencedate);
    }

}
