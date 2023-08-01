package lambda;

public class LambdaExpressionDemo {
//    public void displayName(String name){
//        System.out.println("Hi, " + name);
//    }
    public void dispNameAge(String name, int age){
        System.out.println("Hi "+ name + " "+ age);
    }

    public static void main(String[] args) {
//        LambdaExpressionDemo ledObj = new LambdaExpressionDemo();
//        ledObj.displayName("Kedar");
        NameDisplay namDisp = name -> System.out.println("Hi, " + name);
//        namDisp.dispName("Aman");
        NameAgeDisplay namAgDisp = (name,age)  -> System.out.println("Hi "+ name + " "+ age);
        namAgDisp.dispNameAg("Seema",23);
    }
}
@FunctionalInterface
interface NameDisplay{
    void dispName(String name);
}
@FunctionalInterface
interface NameAgeDisplay{
    void dispNameAg(String name, int age);
}
