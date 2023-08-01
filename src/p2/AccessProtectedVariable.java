package p2;

//import p1.*;
import p1.ProtectedDemo;

public class AccessProtectedVariable extends ProtectedDemo{

    public static void main(String[] args) {
        ProtectedDemo protDemObj = new ProtectedDemo();
//        protDemObj.ageOfDin;

        AccessProtectedVariable accessProtVarObj = new AccessProtectedVariable();
        int dinAge = accessProtVarObj.ageOfDin;
        System.out.println(dinAge);
    }
}
