package jvm;

public class GarbageCollectorDemo {
    public  void gcDemo(){
        String str = "Prashant";
        str.concat("Kumar");// a new string object is created --- garbage collector
        System.out.println(str);// Prashant
        String strNew = str.concat("Kumar");
        System.out.println(strNew);// PrashantKumar
    }

    public static void main(String[] args) {
        GarbageCollectorDemo gcdObj = new GarbageCollectorDemo();
        gcdObj.gcDemo();
    }
}
