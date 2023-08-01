package exception;

public class ArrayException {
    public void showException(){
        int[] arrInt = new int[]{1,4,9};
//        ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        try{
//            System.out.println(arrInt[4]);
            int num = 1/0;// Arithmetic Exception
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
//        catch(ArithmeticException e){
//            System.out.println(e);
//        }
        arrInt[1] = 5;
        arrInt[0] = 2;
//        arrInt[9] = 0;
        System.out.println(arrInt[1]);//5
    }
    public void checkedException(){
//        System.out.println(null);
    }
    public void unCheckedException(){
        try{
            int num = 1/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("It will print definitely");
        }
//        Arithmetic Exception : divide by zero
        System.out.println(1/0);
    }

    public void classCastException(){
        String str = "kedar";
//        int num = (Integer) str;
    }

    public static void main(String[] args) {
        ArrayException arExObj = new ArrayException();
//        arExObj.showException();
        arExObj.unCheckedException();
    }
}
