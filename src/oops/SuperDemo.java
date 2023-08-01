package oops;

public class SuperDemo {
}
class Department{
    String deptName = "MEch";
    int deptStrength = 10;
}
class CSEDepartment extends Department{
    String deptName = "CSE";
    public void showDepartmentName(){
        System.out.println(deptName);// cse
        System.out.println(super.deptName);// MEch
    }

    public static void main(String[] args) {
        CSEDepartment cseObj = new CSEDepartment();
        cseObj.showDepartmentName();
    }
}

class Employee{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class SpecialEmployee extends  Employee{
    String name;
    int age;
    int bonus;
    public SpecialEmployee(String name, int age, int bonus){
        super(name,age);
        this.bonus = bonus;
    }


}














