package p1;

public class NotAChildClass {
    public static void main(String[] args) {
        PrivateDemo prDemObj = new PrivateDemo();
        int age = prDemObj.ageOfAman;

        ProtectedDemo protectedDemoObj = new ProtectedDemo();
        int dinAge = protectedDemoObj.ageOfDin;
    }
}
