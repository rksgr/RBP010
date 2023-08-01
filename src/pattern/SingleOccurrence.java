package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SingleOccurrence {
    public static  void checkSingleOccurrence(){
//        Pattern pattern = Pattern.compile("^([a]{1})");
        Pattern pattern = Pattern.compile("(?=[#]{1})");
        Matcher matcher = pattern.matcher("##");
        boolean found = matcher.find();
        System.out.println(found);
    }

    public static void main(String[] args) {
        checkSingleOccurrence();
    }
}
