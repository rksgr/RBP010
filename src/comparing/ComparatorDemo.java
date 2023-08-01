package comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{

    public static void main(String[] args) {
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

        // Passing an instance of a class which is implementing comparator interface
        CompareByName compNameObj = new CompareByName();
        empList.sort(compNameObj);

        CompareByAge compAgeObj = new CompareByAge();
//        empList.sort(compAgeObj);

        for (Employee emp: empList){
            System.out.println(emp.name);
        }
    }
}
class CompareByAge implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2){
        int result = emp1.age - emp2.age;
        return result;
    }
}
class CompareByName implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        int result = emp1.name.compareTo(emp2.name);
        return result;
    }
}
