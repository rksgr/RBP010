import java.util.ArrayList;
import java.util.List;
public class TypeTension {
    public void checkArrayTypeSafe(){
        String[] strArr = new String[12];
        strArr[9] = "Jre";
//        strArr[8] = new Character('d');
    }
    public void entryOfGenerics(){
        List<String> amanList = new ArrayList<>();
        amanList.add("Aman");
//        amanList.add(32);// can't add Integer
//        amanList.add(false);
        amanList.add("Ranchi");
    }
    public void noTypecasting(){
        List seemaList = new ArrayList();
        seemaList.add(43); // Object
        seemaList.add("Seema");
        Integer num = (Integer) seemaList.get(0);
        String str = (String) seemaList.get(1);

        List<Integer> seemaIntList = new ArrayList<>();
        seemaIntList.add(65);
//        seemaIntList.add("Seema");// compile time error
        Integer numS = seemaIntList.get(0);
    }
    public void noTension(){
        List amanList = new ArrayList();
        amanList.add("Aman");
//        amanList.add(32);
//        amanList.add(true);

        Object obj1 =(Object) "Aman";
        System.out.println(obj1.getClass());
        System.out.println(amanList.get(0).getClass());

        Object obj2 =(Object)  32;
//        System.out.println(obj2 instanceof Integer);
        System.out.println(amanList instanceof ArrayList<?>);
        }
        public int getSquareOfNum(int num){
            return num * num;
        }
//        public int getSquare(){
//            Math.sqrt(88);
//            return 88 * 88;
//        }
//        public int getSquareNum(){
//            Math.sqrt(34);
//            return 34 * 34;
//        }
//        public int getSquNum(){
//            Math.sqrt(98);
//            return 98 * 98;
//        }
    public <E> void displayArrayElements(E[] arr){
        for(E element: arr){
            System.out.println(element);
        }
    }
    public void displayIntArrayElements(int[] intArr){
//        System.out.println(intArr);
        for(int i: intArr){
            System.out.println(i);
        }
    }
    public void displayStringArrayElements(String[] strArr){
//        System.out.println(intArr);
        for(String str: strArr){
            System.out.println(str);
        }
    }
    public void displayBoolArrayElements(boolean[] boolArr){
//        System.out.println(intArr);
        for(boolean b: boolArr){
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        TypeTension ttObj = new TypeTension();
//        ttObj.noTension();
//        ttObj.getSquareOfNum(43);
//        int[] arrInt = new int[]{1,4,2,0,8};
        Integer[] arrInt = new Integer[]{1,4,2,0,8};
//        ttObj.displayArrayElements(arrInt);
//        ttObj.displayArrayElements(arr);
        String[] arrStr = new String[]{"a","p","l"};
//        ttObj.displayArrayElements(arrStr);
//        ttObj.displayStringArrayElements(arrStr);
        Boolean[] boolArray = new Boolean[]{true, true, false, true, true, true};
//        ttObj.displayBoolArrayElements(boolArray);
        ttObj.displayArrayElements(boolArray);
    }
}
