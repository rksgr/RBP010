package comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        Employee [] empArr = new Employee[3];
        empArr[2] = new Employee("Aman",23);
        empArr[1] = new Employee("Debasmita",21);
        empArr[0] = new Employee("Seema",25);
        Arrays.sort(empArr);

        for(Employee emp: empArr){
            System.out.println(emp.name);
        }


        Employee empAman = new Employee("Aman",23);
        Employee empDeba = new Employee("Debasmita",21);
//        boolean ifEqual = empAman.equals(empDeba);
//        System.out.println(ifEqual);// false

        Employee empSeema = new Employee("Seema",25);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(empAman);
        employeeList.add(empDeba);
        employeeList.add(empSeema);
        Collections.sort(employeeList);
//        employeeList.sort();
//        boolean checkEquality = empSeema.equals(empDeba);
//        System.out.println(checkEquality);// false

//        Employee empAmanOnly = new Employee("Aman",23);
//        boolean chechForEquality = empAman.equals(empAmanOnly);
//        System.out.println(chechForEquality);// false

        // All four are different objects
//        System.out.println(empAman.hashCode());
//        System.out.println(empAmanOnly.hashCode());
//        System.out.println(empDeba.hashCode());
//        System.out.println(empSeema.hashCode());
    }
}
class Employee implements Comparable<Employee>{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
