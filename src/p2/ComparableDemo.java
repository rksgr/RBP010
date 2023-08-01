package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        int[] arrInt = new int[] {1,8,2,0,-5};
        Arrays.sort(arrInt);
        for (int i : arrInt) {
//            System.out.println(i);
        }
        Employee[] empArr = new Employee[3];
        empArr[0] = new Employee("Kedar",25000);
        empArr[1] = new Employee("Seema",23000);
        empArr[2] = new Employee("Dewan",26000);
        Arrays.sort(empArr);
        for (Employee emp: empArr){
//            System.out.println(emp.name + " "+ emp.salary);
        }

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ashok",25000));
        employeeList.add(new Employee("Seema",23000));
        employeeList.add(new Employee("Altaf",23000));

        Collections.sort(employeeList);
        for (Employee emp: employeeList){
            System.out.println(emp.name + " "+ emp.salary);
        }
    }
}
class Employee implements  Comparable<Employee>{
    String name;
    int salary;

//    @Override
//    public int compareTo(Employee emp){
//        int compareSal = this.salary - emp.salary;
//        return compareSal;
//    }
    @Override
    public int compareTo(Employee emp){
        int compareName = this.name.compareTo(emp.name);
        return compareName;
    }
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

