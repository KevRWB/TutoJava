//Program determinating if there is protein in a strand of DNA
//Protein qualities : Begins with "ATG" / Ends with "TGA".

public class DNA {

    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna1;
        int dnaLength = dna.length();
        System.out.println(dnaLength);

        int indexOfATG = dna.indexOf("ATG");
        int indexOfTGA = dna.indexOf("TGA");


        if(indexOfATG == -1 || indexOfTGA == -1){
            System.out.println("Not a protein : no ATG or DNA in this strand");
        } else {
            boolean isDivisibleBy3 = dna.substring(indexOfATG, indexOfTGA).length() % 3 == 0;

            if(isDivisibleBy3){
                System.out.println("It is a protein !!!");
            } else {
                System.out.println("Not a protein...");
            }
        }
    }
}