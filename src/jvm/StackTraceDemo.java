package jvm;

public class StackTraceDemo {
    public void display(){
        display2();
    }
    public void display2(){
        System.out.println("Inside display2 method");
        int num = 1/0;
    }

    public static void main(String[] args) {
        StackTraceDemo stdObj = new StackTraceDemo();
        stdObj.display();

    }
}
