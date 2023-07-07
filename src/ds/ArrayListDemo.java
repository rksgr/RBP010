package ds;

import java.util.ArrayList;

public class ArrayListDemo {
    public void basicOps(){
        ArrayList<Integer> arrListInt = new ArrayList<>();
        System.out.println(arrListInt.isEmpty());// true
        arrListInt.add(12);// 1
        arrListInt.add(23);// 2
//        System.out.println(arrListInt.size());// 2
        arrListInt.add(21);// 3
        arrListInt.remove(2);//12  23   21
//        System.out.println(arrListInt.size());// 2

//        System.out.println(arrListInt.get(0));//12
        arrListInt.set(1,33);
//        System.out.println(arrListInt.get(1));// 33
        System.out.println(arrListInt.isEmpty());// false
    }

    public void learnConcept(){
        int num = 5;
        //Integer IntegerObj = Integer.valueOf(num); int to Integer
        ArrayList<Integer> arrLstInteger = new ArrayList<>();
        arrLstInteger.add(num);
        int result = arrLstInteger.get(0);
        //ArrayList<int> arrLstint = new ArrayList<>();

    }

    public static void main(String[] args) {
        ArrayListDemo arListDemoObj = new ArrayListDemo();
        arListDemoObj.basicOps();
    }
}

class ArrayDemo{
    public void arrayOps(){
        int[] intArr =  new int[] {1,2,3,4,5,6,7,8,9,0,23};
//        intArr[12] = 78;// ArrayIndexOutOfBounds
    }

    public static void main(String[] args) {
        ArrayDemo arDemObj = new ArrayDemo();
        arDemObj.arrayOps();
    }
}