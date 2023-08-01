package comparing;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// Leetcode 23-07-23 Accepted
public class SplitStrings {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> strLst = new ArrayList<>();
        StringBuilder sbsplitter = new StringBuilder("\\");
        sbsplitter.append(separator);
        String splitter = sbsplitter.toString();
        System.out.println();
        for(String str: words){
            String[] tempStrArr = str.split(splitter);
//            strLst.addAll(Arrays.asList(tempStrArr));
            for(String tempStr: tempStrArr){
                if (tempStr.length() != 0){
                    strLst.add(tempStr);
                }
            }
        }
        System.out.println(3);
        return strLst;
    }

    public static void main(String[] args) {
//        List<String> words = Arrays.asList("one.two.three","four.five","six");

        List<String> words = Arrays.asList("$easy$","$problem$");
//        List<String> words = Arrays.asList("|||");
        char separator = '$';
        SplitStrings sst = new SplitStrings();
        List<String> strList = sst.splitWordsBySeparator(words,separator);
        for(String str: strList){
//            System.out.println(4);
            System.out.println(str);
        }
    }
}