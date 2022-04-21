public class ObjAsParameter {

    String name;
    int age;

    public ObjAsParameter(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void switchPersons(ObjAsParameter person1, ObjAsParameter person2){
        person1.name = person2.name;
        person1.age = person2.age;
    }

    public static void main(String[] args){

        ObjAsParameter Roger = new ObjAsParameter("Roger", 55);
        ObjAsParameter Nadine = new ObjAsParameter("Nadine", 32);

        Roger.switchPersons(Roger, Nadine);

        System.out.println("Roger is now " + Roger.name + " and is " + Roger.age + " years old" );
    }
}
