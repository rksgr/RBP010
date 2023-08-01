package ds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RenameItLater {
    public void countTotalStudents(){
        // football
        // hockey
        String [] footballPlayers = new String[]{"a","b","c","d","e","f","g","h","i","j","k"};
        String [] hockeyPlayers = new String[]{"c","e","g","i","j","l","m","n","o","p"};
        String [] hockeNFootball = new String[]{"c","e","g","i","j"};
        // total students = total players
        // 10 + 11 - 5 = 16 mathematical ---- programming
        // Array --- List
        List<String> footballPlayersList = Arrays.asList(footballPlayers);
        List<String> hockeyPlayersList = Arrays.asList(hockeyPlayers);

        Set<String> setStud = new HashSet<>();// empty set
        setStud.addAll(footballPlayersList);// all elements added
//        setStud.addAll(hockeyPlayersList);// union
//        System.out.println(setStud.size());// 16
        // find players playing only football
        setStud.removeAll(hockeyPlayersList);
        System.out.println(setStud);
    }

    public static void main(String[] args) {
        RenameItLater rilObj = new RenameItLater();
        rilObj.countTotalStudents();
    }
}
