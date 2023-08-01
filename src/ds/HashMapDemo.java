package ds;

import java.lang.reflect.Array;
import java.util.*;

public class HashMapDemo {
    public void basicOperations(){
//        Map<String, String > mapStud = new LinkedHashMap<>();
        Map<String, String > mapStud = new TreeMap<>();
        mapStud.put("Aman","Ranchi");
        mapStud.put("Rajesh","Markapur");
        mapStud.put("Debasmita","Rourkela");
        mapStud.put("Kedar","Pune");
        mapStud.put("Pranjal","Pune");
        System.out.println(mapStud);
        //{Aman=Ranchi, Rajesh=Markapur, Debasmita=Rourkela, Kedar=Pune}
    }
    public void basicOperation(){
        Map<String, Integer> mapData = new HashMap<>();
        mapData.put("alpha",1);
        mapData.put("beta",3);
        mapData.putIfAbsent("beta",5);// inserts value only if given key is not present
        System.out.println(mapData);
        mapData.put("beta",7);//
        System.out.println(mapData);
        System.out.println(mapData.get("alpha"));
//        Map<int,String> mao ;
    }
    public void basicOps(){
//        Map<String, Integer> mapSch = new HashMap<>();
        Map<String, Integer> mapSch = new TreeMap<>();

        Map<String, Integer> mapColl = new HashMap<>();

        mapSch.put("class1",1);
        mapSch.put("class2",2);
        mapSch.put("cs",3);
        mapColl.put("cs",4);
        mapColl.put("bca",3);
        System.out.println(mapSch.hashCode());
        System.out.println(mapColl.hashCode());
        mapSch.putAll(mapColl);
        System.out.println(mapSch);
    }
    public void basicTraversal(){
        Map<String, Integer> mapColl = new HashMap<>();
        mapColl.put("class1",1);
        mapColl.put("class2",2);
        mapColl.put("cs",3);
        mapColl.put("bca",3);
        Iterator itr = mapColl.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    // how to traverse over the elements of a HashMap
    public void demoEntrySet(){
        String[] strArr = new String[]{"a","sd","ew","bca"};
        for(String str  :strArr){// for each loop
            System.out.println(str);
        }
        Map<String, Integer> mapColl = new HashMap<>();
        mapColl.put("class1",1);
        mapColl.put("class2",2);
        mapColl.put("cs",3);
        mapColl.put("bca",3);
        // mapColl.entrySet   --- gives us set of all the entries
        for(Map.Entry mapEntry: mapColl.entrySet()){
            System.out.println(mapEntry);
        }
    }

    public static void main(String[] args) {
        HashMapDemo hmdObj = new HashMapDemo();
//        hmdObj.demoEntrySet();
//        hmdObj.basicTraversal();
        hmdObj.basicOps();
//        hmdObj.basicOperations();
//        hmdObj.basicOperation();
    }
}
