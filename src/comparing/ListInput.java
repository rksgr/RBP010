package comparing;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListInput {
    public static void getListFromConsole(){
        // standard input stream
        Scanner sc = new Scanner(System.in);
        Map<String,List<Integer>> mapStrList = new HashMap<>();
        List<Integer> intList = new ArrayList<>();
        String str = "Kedar";
        // read till it gets integers only
        // InputMismatchException prevented
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            intList.add(num);
        }
        mapStrList.put(str, intList);
        System.out.println("Our List: "+ intList);
        System.out.println("Our map: "+ mapStrList);

    }
    public void dealWithTempList(){
//        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Map<String,List<Integer>> mapStrList = new HashMap<>();
        String key = sc.next();
        String list = sc.next();
        if(list.equals(integerList1)){
            mapStrList.put(key,integerList1);
        }else{
            List<Integer> newIntList = new ArrayList<>();
            mapStrList.put(key,newIntList);
        }


    }

    public static void main(String[] args) {
        getListFromConsole();//  after passing input ctrl + D
        // list ----


    }
}
