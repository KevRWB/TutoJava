public class Continents {
    // print out a continent and the largest city in that continent, based on the value of an integer
    public static void main(String[] args) {
        int continent = 4;

        switch(continent){
            case 1 :
                System.out.println("North America : Mexico City, Mexixo");
                break;
            case 2 :
                System.out.println("South America : Sao Paulo, Brazil");
                break;
            case 3 :
                System.out.println("Europe : Moscow, Russia");
                break;
            case 4 :
                System.out.println("Africa : Lagos, Nigeria");
                break;
            case 5 :
                System.out.println("Asia : Shangai, China");
                break;
            case 6 :
                System.out.println("Oceania : Sydney, Australie");
                break;
            case 7 :
                System.out.println("Antartica : MsMurdo Station, US");
                break;
            default :
                System.out.println("Indefined continent");
        }


    }

}
