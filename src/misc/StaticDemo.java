package misc;

public class StaticDemo {
    static {
//        System.out.println(name);
        displayName();
    }
    static String name = "Dinesh";// declaration and assignment
    public static  void displayName(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.println("Kedar");
        StaticDemo staticDemoObj = new StaticDemo();
        staticDemoObj.displayName();
    }
    static {
        System.out.println("Sowmya");
    }
}
/**
 *          null
 *         Sowmya
 *         Kedar
 *         Dinesh
 */

class Student {
    static String schoolName = "KV";
    String name;
    int age;
    static String city = "Hyderabad";

    public Student(String schoolName, String name, int age, String city) {
        this.schoolName = schoolName;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student studentObj1 = new Student("KV","Ashok",12,"Hyderabad");
        Student studentObj2 = new Student("KV","Alok",11,"Hyderabad");
        Student studentObj3 = new Student("KV","Ashokan",13,"Hyderabad");
        Student studentObj4 = new Student("KV","Abhik",12,"Hyderabad");
        Student studentObj5 = new Student("KV","Abhishek",10,"Hyderabad");
        // 800 students
        // 800 objects 800 X 4 blocks of memory
        // schoolname and city is same for all the students of the school
        // after static , 800 X 2 blocks of memory + 2


    }
}








