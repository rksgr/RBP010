package p2;

import  p1.PublicDemo;
import p1.ProtectedDemo;

public class AccessVariables {

    public static void main(String[] args) {
        PublicDemo pdObj = new PublicDemo();
        String name = pdObj.name;
        System.out.println(name);

//        int age = pdObj.age;// CTE

        ProtectedDemo protObj = new ProtectedDemo();
//        int dinAge = protObj.ageOfDin;
    }
}
