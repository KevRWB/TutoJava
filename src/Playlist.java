import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlayList = new ArrayList <>();

        desertIslandPlayList.add("No woman no cry");
        desertIslandPlayList.add("Il en faut peu pour être heureux");
        desertIslandPlayList.add("Poker Face");
        desertIslandPlayList.add("Sultans of Swing");
        desertIslandPlayList.add("Slim Shady");
        desertIslandPlayList.add("Mon vieux");

        int desertIslandPlayListSize = desertIslandPlayList.size();
        System.out.println(desertIslandPlayListSize);
        System.out.println(desertIslandPlayList);

        desertIslandPlayList.remove(2);
        desertIslandPlayListSize = desertIslandPlayList.size();
        System.out.println(desertIslandPlayListSize);
        System.out.println(desertIslandPlayList);

        int songAindex = desertIslandPlayList.indexOf("No woman no cry");
        int songBindex = desertIslandPlayList.indexOf("Il en faut peu pour être heureux");
        String tempA = desertIslandPlayList.get(songAindex);
        String tempB = desertIslandPlayList.get(songBindex);
        desertIslandPlayList.set(songAindex, tempB );
        desertIslandPlayList.set(songBindex, tempA );

        System.out.println(desertIslandPlayList);
    }
}
