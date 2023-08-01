package lambda;

public class InterfaceDemo implements RBP{
    @Override
    public void dispSomName() {
    }
    @Override
    public void dispAmeName() {
    }
}

interface RBP{
    void dispSomName();
    void dispAmeName();

    static void dispDinName(){
        System.out.println("Dinesh");
    }
}
@FunctionalInterface
interface RBP010{
//    void displKedName();

    void dispSeemName();
}















