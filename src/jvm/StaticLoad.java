package jvm;

public class StaticLoad {
    static {
        System.out.println("first static block");
        displaySchoolName();
    }
    static void  displaySchoolName(){
        System.out.println(schoolName);// null
    }
    static void willItExecute(){
        // local variable --- stack area
        int age = 10;
        System.out.println("Yes executed");
    }
    // schoolname - static variable -- method area
    static String schoolName = "Kendriya vidyalaya";// schoolname allocated memory , value set as null
    // studName - instance variable -- heap memory
    String studName = "Kedar";

    static {
        System.out.println("second static block");
        System.out.println(schoolName);
    }

    public static void main(String[] args) {

    }
}
