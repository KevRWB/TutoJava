public class MonsterAction {

    //"Fall" method for Monsters
    public void fall(Monster monster){
        monster.speed = 0;
        System.out.println("This monster" + monster.name +" just felt ! His speed is now : " + monster.speed);
    }
}
