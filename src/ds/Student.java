package ds;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student studDin = new Student("Dinesh",21);
        Student studSeema = new Student("Seema",20);
        Student studDine = new Student("Dinesh",21);// different object
//        boolean result = studSeema.equals(studDin);
//        System.out.println(result);
        boolean result1 = studDin.equals(studDine);
//        System.out.println(result1);
        int hs1 = studDin.hashCode();// treturns an int value
        int hs2 = studDine.hashCode();
        System.out.println(hs1+ "   "+ hs2);
    }
}
