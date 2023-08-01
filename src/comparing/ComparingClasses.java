package comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingClasses implements Comparable<Employee>{

    @Override
    public int compareTo(Employee empObj) {
        Employee emp = new Employee("Amn",23);
        int result = empObj.name.compareTo(emp.name);
        return result;
    }

    public static void main(String[] args) {
        ComparingClasses comparingClassesObj = new ComparingClasses();
//        Employee empObj = new Employee("Aman",26);
        // create a list of Employees
        List<Employee> empList = new ArrayList<>();
        Employee empObj1 = new Employee("Sowmya",24);
        Employee empObj2 = new Employee("Kedar",25);
        Employee empObj3 = new Employee("Seema",22);
        Employee empObj4 = new Employee("Aman",29);
        empList.add(empObj1);
        empList.add(empObj2);
        empList.add(empObj3);
        empList.add(empObj4);
//        empList.sort(comparingClassesObj);
//        int res = comparingClassesObj.compareTo(empObj);
//        System.out.println(res);// -13
    }
}
