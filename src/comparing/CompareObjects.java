package comparing;

public class CompareObjects {


    public static void main(String[] args) {
        Student stud1 = new Student("Altaf",12,7);
        Student stud2 = new Student("Asok",13,6);
//        boolean result = stud1.equals(stud2);
//        System.out.println(result);// false

        Student stud3 = new Student("Altesh",12,7);
//        boolean result = stud1.equals(stud3);
//        System.out.println(result);// false

        Student stud4 = new Student("Asok",13,6);
        boolean result = stud2.equals(stud4);
        System.out.println(result);// true
    }
}
class Student{
    String name;
    int age;
    int classroom;

    public boolean equals(Student stud){
        boolean ifEqualAge = (stud.age == this.age);
        boolean ifSameName = stud.name.equals(this.name);
        boolean ifSameClass = (stud.classroom == this.classroom);
        boolean result = ifEqualAge && ifSameName && ifSameClass;
        return result;
    }

    public Student(String name, int age, int classroom) {
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }
}
