public class CreateDog {

    private String dogName;
    private String dogColor;
    private int dogAge;
    private int entranceDate;

    public CreateDog (String name, String color, int age, int date){
        dogName = name;
        dogColor = color;
        dogAge = age;
        entranceDate = date;

    }

    public void changeDogName (String newName){
        dogName = newName;
    }

    public void setEntranceDate(int date){
        entranceDate = date;
    }

    public String getDogName(){
        return dogName;
    }

    public int getEntranceDate(){
        return entranceDate;
    }

    public String getDogColor(){
        return dogColor;
    }

    public int getDogAge(){
        return dogAge;
    }

    public char initialName(){
        return dogName.charAt(0);
    }

    public String toString() {
        return "This dog is " + dogName + ". He's " + dogColor + " and " + dogAge + " years old. He enter the refuge in " + entranceDate;
    }
}
