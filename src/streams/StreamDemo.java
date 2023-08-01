package streams;

import java.util.Arrays;

public class StreamDemo {
    public void generateStream(){
        int[] intArr = {1,3,4,5,0};
        Arrays.stream(intArr);
    }
    public void getFirstOddNumber(){
        int[] intArr = {12,30,41,5,0};
        int firstOddNumber = Arrays.stream(intArr)
                                    .filter(element -> element % 2 == 1)
                                    .findFirst()
                                    .getAsInt();
        System.out.println(firstOddNumber);

    }
    public void doubleEachElement(){
        int[] intArr = {12,30,41,5,0};
        Arrays.stream(intArr)
                .map(element -> element * 2)
                .forEach(System.out::println);
    }
    public void squareEachElement(){
        int[] intArr = {6,30,4,5,0};
        Arrays.stream(intArr)
                .map(element -> element * element)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        StreamDemo streamDemoObj = new StreamDemo();
//        streamDemoObj.getFirstOddNumber();
//        streamDemoObj.doubleEachElement();
        streamDemoObj.squareEachElement();
    }

}
