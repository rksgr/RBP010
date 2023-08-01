package hms;

public class Patient{
    private String name,city,state,dept;
    private int age;
    private long phoneNumber;
    // Getters and setters
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public void setName(String nameP){
        this.name = nameP;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //    public Patient(String name, String city, String state, String dept, int age, long phoneNumber) {
//        this.name = name;
//        this.city = city;
//        this.state = state;
//        this.dept = dept;
//        this.age = age;
//        this.phoneNumber = phoneNumber;
//    }
}
