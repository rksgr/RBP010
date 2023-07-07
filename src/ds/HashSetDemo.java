package ds;

import java.util.*;

public class HashSetDemo {
    public void basicHashSetOperations(){
        Set<String> setStr = new HashSet<>();
        setStr.add("Debasmita");// 12 - hashcode
        System.out.println(setStr.add("Aman"));// element gets added to the set, returns true
        // hashcode of AMan - 16
        setStr.add("Kedar"); // 14
//        System.out.println(setStr);

        System.out.println(setStr.add("Aman"));// element doesn't get added to the set, returns false
        System.out.println(setStr);

    }
    public void checkStrings(){
        String str1 = new String("Kedar");
        String str2 = new String("Seema");
//        System.out.println(str1.equals(str2));// false
        String str3 = new String("Kedar");
//        System.out.println(str1.equals(str3));//
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
    public void createList(){
        Set<String> setStr = new HashSet<>();
        setStr.add("Alok");
        String[] strArr = new String[]{"Kedar","Seema","Alok"};
        List<String> lstStr = Arrays.asList(strArr); // to convert an array into a list
//        setStr.add("Soumya");

        // add the elements of the list to the set
        setStr.addAll(lstStr);

        String[] arrStr = new String[]{"Dinesh","Sowmya","Aman","Alok"};
        List<String> lstStud = Arrays.asList(arrStr);
        setStr.addAll(lstStud);// union operation related to set
        System.out.println(setStr);

        // remove the elements present in second list from the first list
        setStr.removeAll(lstStud);// subtraction operation
        System.out.println(setStr);
    }

    public static void main(String[] args) {
        HashSetDemo hsdObj = new HashSetDemo();
//        hsdObj.basicHashSetOperations();
//        hsdObj.checkStrings();
        hsdObj.createList();
    }
}
