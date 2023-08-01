package workshop;

import java.util.ArrayList;
import java.util.List;

public class StudentDataManipulation {
    List<Student> studList = new ArrayList<>();

    public void addStudent(Student stud){
        System.out.println(studList.size());// 0
        studList.add(stud);
        System.out.println(studList.size());// 1
    }
   public void searchStudent(Student stud){
//        boolean isDebaPresent = studList.contains("Debasmita");// false
       boolean isDebaPresent = studList.contains(stud);//true
       System.out.println(isDebaPresent);//
    }
    public void searchStudentByName(String studName){
        boolean isDebaPresent = studList.contains("Debasmita");// false
//        System.out.println(isDebaPresent);
        String studName1 = studList.get(0).getName();
//        System.out.println(studName1);// Debasmita
        int studAge = studList.get(0).getAge();
//        System.out.println(studAge);// 21

        int studRollNo = studList.get(0).getRollNo();
//        System.out.println(studRollNo);

        String studName2 = studList.get(1).getName();
//        System.out.println(studName2);
        boolean isStudentPresent = false;
        for( int i = 0; i < studList.size(); i++){

            String name = studList.get(i).getName();// Debasmita
            // equals method to compare two strings
//            name.equalsIgnoreCase()
            if(name.equals(studName)){
                isStudentPresent = true;
                System.out.println(studName + " found");
            }
        }// ! inversion operator
        if(!isStudentPresent){
            System.out.println(studName + " not found.");
        }
    }

    public static void main(String[] args) {
        Student studDeba = new Student("Debasmita", 21, 1001);
        Student studKeda = new Student("Kedar", 22, 1002);

        StudentDataManipulation studDetObj = new StudentDataManipulation();
//        studList.add(studDeba);
        studDetObj.addStudent(studDeba);// add Debasmita obj
        studDetObj.addStudent(studKeda);// add Kedar obj
//        studDetObj.searchStudent(studDeba);
        studDetObj.searchStudentByName("Kedar");// kedar found
        studDetObj.searchStudentByName("Sowmya");// kedar found
    }

}
