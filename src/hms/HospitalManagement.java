package hms;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class HospitalManagement {

//    List<Hospital> hospitalList = new ArrayList<>();
        static Map<String,List<Patient>> mapHospPat = new HashMap<>();
    //        this.name = name;
//        this.city = city;
//        this.state = state;
//        this.dept = dept;
//        this.age = age;
//        this.phoneNumber = phoneNumber;

    public void addHospitalToMap(String hospName, List<Patient> patientList){
        mapHospPat.put(hospName,patientList);
//        System.out.println(mapHospPat);

    }
//    public void createHospital(String hospitName,List<Patient> listPatients){
//        Map<String,List<Patient>> mapHospPat = new HashMap<>();
//        //{ "H1": [P1,P2] , "H2": [P11,P12]  }
//        // P1 : Alpha","Ahmedabad","Gujarat","Angioplasty",73, 99999999L
//        // key: hospital name , value: list of patients
//        mapHospPat.put(hospitName, listPatients);
//        System.out.println(mapHospPat);
//    }

    public static void main(String[] args) {
        HospitalManagement hmObj = new HospitalManagement();
        String hospName = "Narayana";
        List<Patient> patList1 = new ArrayList<>();
//        hmObj.addHospitalToMap(hospName,patList1);
        Hospital hospital1 = new Hospital(hospName, patList1);
        Patient patientObj1 = hospital1.createPatient("Alpha","Ahmedabad","Gujarat","Angioplasty",
                73, 99999999L);
        Patient patientObj2 = hospital1.createPatient("Beta","Calcutta","West Bengal",
                "Opthalmology",71, 99889999L);
        System.out.println(hospital1.hospName);

        String patName2 = hospital1.patientList.get(1).getName();
//        System.out.println(patName2);
        // Add hospital to the map
        hmObj.addHospitalToMap(hospName,patList1);


        String hospName2 = "Apollo";
        // Each hospital has its own list of patients
        List<Patient> patList2 = new ArrayList<>();
        Hospital hospital2 = new Hospital(hospName2, patList2);
        hospital2.createPatient("Gamma","Patna","Bihar","Neurology",
                61,45634634634L);
        String patDept = hospital2.patientList.get(0).getDept();
//        System.out.println(patDept);
        // Add hospital to the map
        hmObj.addHospitalToMap(hospName2,patList2);

        // get the list containing name of hospitals
//        System.out.println(mapHospPat.keySet());

        // get the name of first patient of Apollo hospital
        System.out.println(mapHospPat.get("Apollo").get(0).getName());

//        Patient patientObj1 = hmObj.createPatient("Alpha","Ahmedabad","Gujarat","Angioplasty",
//                73, 99999999L);
//        Patient patientObj2 = hmObj.createPatient("Beta","Calcutta","West Bengal",
//                "Opthalmology",71, 99889999L);
        // Add patients to the list containing patient details
//        patientList.add(patientObj1);
//        patientList.add(patientObj2);

        //Associate patient list to the hospital
//        hmObj.createHospital("Narayana",patientList);
        //{Narayana=[hms.Patient@6d03e736, hms.Patient@568db2f2]}
    }

}
