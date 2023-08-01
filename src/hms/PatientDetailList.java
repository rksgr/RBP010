package hms;

import java.util.ArrayList;
import java.util.List;

public class PatientDetailList {
    private  List<Patient> patList                 = new ArrayList<>();
    // List<Integer>   <String>     <Patient>

    public  List<Patient> getPatList() {
        return patList;
    }

    public  void setPatList(List<Patient> patList) {
        this.patList = patList;
    }
}
