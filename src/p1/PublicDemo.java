package p1;

public class PublicDemo extends PrivateDemo {
    public String name = "Altaf";

    private int age = 25;



    public static void main(String[] args) {
        PrivateDemo prDemObj = new PrivateDemo();
//        prDemObj.ageOfKedar;
        PublicDemo pubDemObj = new PublicDemo();
//        pubDemObj.ageOfKedar;
        int age = pubDemObj.ageOfAman;
    }
}
