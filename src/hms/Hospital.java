package hms;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    String hospName;
    // Refactoring code
    List<Patient> patientList = new ArrayList<>();

    public Hospital(String hospName, List<Patient> patientList) {
        this.hospName = hospName;
        this.patientList = patientList;
    }

    public Patient createPatient(String name, String city, String state,
                                 String dept, int age, long phoneNumber) {
        Patient patObj = new Patient();
        patObj.setName(name);
        patObj.setCity(city);
        patObj.setState(state);
        patObj.setDept(dept);
        patObj.setAge(age);
        patObj.setPhoneNumber(phoneNumber);
//        System.out.println(patObj.getName());// alpha
//        Patient teestPatientObj = new Patient();
//        System.out.println(teestPatientObj.getName());// null
        patientList.add(patObj);
        System.out.println(patientList.size());
        String patname = patientList.get(0).getName();
        return patObj;//
    }
}
