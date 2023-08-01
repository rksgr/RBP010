package pattern;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindString {
    public void checkString(){
        String str = "fasfdghdswdsnsfdvzscvszvsdgbndscdsbgsdsdgsvwrwertetgscznfxgbzdbdf";
        String search = "d";
//        boolean ifLetterPresent = str.contains("dsd");
        int indx = str.indexOf("f");// first instance
        int lastIndx = str.lastIndexOf("f");// last instance
        System.out.println(indx);// 0
        System.out.println(lastIndx);// 64
        System.out.println(str.length());// 65
//        System.out.println(ifLetterPresent);
    }
    public void checkStringExists(){
//        String str = "fasfdghdswdsnsfdvzscvszvsdgbndscdsbgsdsdgsvwrwertetgscznfxgbzdbdf";
        String str = "bnds";
        Pattern p = Pattern.compile("bnds");//
        Matcher m = p.matcher(str);
//        boolean ifMatches = m.matches();
        boolean ifMatches = Pattern.matches("bnds",str);// can also be used
        // repeated matches --- compiled pattern reuse not there
        System.out.println(ifMatches);
    }
    public void differenceMatchesLookingAt(){
        String str = "fasfdghdswdsnsfdvzscvszvsdgbndscdsbgsdsdgsvwrwertetgscznfxgbzdbdf";
//        String str = "bnds";
        Pattern p = Pattern.compile("fasfdghd");//
        Matcher m = p.matcher(str);
        boolean ifMatches = m.matches();// matches entire sequence
        System.out.println(ifMatches);// false
        boolean ifLookingAt = m.lookingAt();// starts from the beginning
        System.out.println(ifLookingAt);
    }

    public void findMethod(){
        String str = "Today is saturday. Next saturday, we will go for picnic.";
        Pattern p = Pattern.compile("sat");
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
//        boolean ifFound = m.find();
//        System.out.println(ifFound);
        while(m.find()){
            System.out.println("sat occurs from " + m.start() + " to "+ m.end());
        }
    }
    public void checkMetacharacters(){
        String str = "thisisbatch";
        Pattern p = Pattern.compile("[^[a-y]]");// false
        Matcher m = p.matcher(str);
        boolean ifPresent = m.find();
        System.out.println(ifPresent);
    }
    public void checkIfMetacharacters(){
        String str = "this is rbp010 batch";
        Pattern p = Pattern.compile("[0-9]");// false
        Matcher m = p.matcher(str);
        boolean ifPresent = m.find();
        System.out.println(ifPresent);
    }
    public void checkQuantifiers(){
        String str = "this is rbp010 444 batch";
        Pattern p = Pattern.compile("[4]?");//should occur once or not at all
//        Pattern p = Pattern.compile("[4]+");//should occur at least once
        Matcher m = p.matcher(str);
        boolean ifPresent = m.find();
        System.out.println(ifPresent);
    }
    public void checkZeroOrMoreTimes(){
        String str = "this is rbp010 batch";
        Pattern p = Pattern.compile("[4]*");//zero or more times
        Matcher m = p.matcher(str);
        boolean ifPresent = m.find();
        System.out.println(ifPresent);
    }
    public void checkOnlyTwoTimes(){
        String str = "this is rbp010 4444 batch";
        Pattern p = Pattern.compile("[4]{2,}");//should occur only twice
        Matcher m = p.matcher(str);
        boolean ifPresent = m.find();
        System.out.println(ifPresent);
    }
    public static void main(String[] args) {
        FindString fdStringObj = new FindString();
//        fdStringObj.checkString();
//        FindString.checkString();
//        fdStringObj.checkStringExists();
//            fdStringObj.differenceMatchesLookingAt();
//            fdStringObj.findMethod();
//        fdStringObj.checkMetacharacters();
//        fdStringObj.checkIfMetacharacters();
        fdStringObj.checkQuantifiers();
//        fdStringObj.checkZeroOrMoreTimes();
//        fdStringObj.checkOnlyTwoTimes();
    }
}
