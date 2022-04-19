import java.util.ArrayList;

public class Detectives {

    public static void main(String[] args){


        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Print the size of each ArrayList below:


        // Print the name of the detective with the larger to-do list:
        System.out.println("Sherlocks to do list : " + sherlocksToDos + ". That makes " + sherlocksToDos.size() + " things to do.");
        System.out.println(poirotsToDos.size());

        //Print evrey item of the list with a FOR loop
        for (int i = 0; i < sherlocksToDos.size(); i ++ ){
            int index = i+ 1;
            System.out.println("Number " + index  + ": " + sherlocksToDos.get(i));
        }
    }
}
