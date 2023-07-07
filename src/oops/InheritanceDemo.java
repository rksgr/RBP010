package oops;

public class InheritanceDemo {
}
class A{
    public void action() {
        System.out.println("dancing");
    }
}
class B extends A {
    public void action() {
        System.out.println("sleeping");
    }
    public static void main(String[]args){
        B bObj = new B();// object of child class
//        bObj.action();//sleeping
        A aObj = new A();// object of parent class
//        aObj.action();
        A aObjN = new B();
        aObjN.action();//
        A objN1 = new C();
        A aObjN2 = new D();
//        C cObj = new D();// CTE
//        C cObj = new A();// CTE
    }
}
class C extends A{

}
class D extends A{

}