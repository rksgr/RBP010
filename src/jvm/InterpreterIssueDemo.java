package jvm;

public class InterpreterIssueDemo {
    public void displayName(){
        System.out.println("Seema");
    }
    public void displayNameMultipleTimes(){
        int num = 500;
        for(int i = 0; i < num; i++){
            displayName();
        }
    }

    public static void main(String[] args) {
        InterpreterIssueDemo idObj = new InterpreterIssueDemo();
        idObj.displayNameMultipleTimes();
    }
}
