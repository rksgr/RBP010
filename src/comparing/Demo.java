package comparing;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Demo  {
    public void findMostOccurring(){
        String str = "today is thursday";
        Map<String, Integer> lettFreq = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            String letter = str.charAt(i) + "";
            if(lettFreq.containsKey(letter)){
                int times = lettFreq.get(letter);
                lettFreq.put(letter, times + 1);
            }else{
                lettFreq.put(letter,1);
            }
        }
        int max = -1;
        String maxLett = "";
        for(Map.Entry<String, Integer> element: lettFreq.entrySet()){
            if(element.getValue() > max){
                max = element.getValue();
                maxLett  = element.getKey();
            }
        }


    }

    public void findMostOccurringLett(){
        String str = "today is nott thursday";
        // 't':2   y: 2     d:2   i:1
        Map<String, Integer> map = new HashMap<>();
        String[] strArr = str.split("");
        for(String string: strArr){// t:1
            if( map.containsKey(string)){
                int value = map.get(string);
                map.put( string, value + 1);
            }else{
                map.put(string, 1);
            }
        }

        // find the maximum occurring letter "" 0
        int maxFreq = -1;
        String letter = "";
        // traverse loop through a map
        for(Map.Entry<String, Integer>  element : map.entrySet()){
            if(element.getValue() > maxFreq){
                maxFreq = element.getValue();
                letter = element.getKey();
            }
        }
        System.out.println("Most frequently occurring letter: " + letter);

    }
    public void maxFreqLetter(){
        String str = "thursdayy";
        Map<Character, Integer> map = new HashMap<>();
        char[] charArr = str.toCharArray();// "s"   "t"     's', 't',

        for(char c: charArr){
            map.compute(c, ((character, count) -> count == null ? 1 : ++count));
        }
//        System.out.println(map);//        {'t'= 1, 'h':1, 'y':2...}
        int maxOccur =  map.values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .max()
                            .getAsInt();

//        System.out.println(maxOccur);// 2


//        System.out.println(maxOccur);
//        int maxOccur = 0;
        // to check if its value is 2 that is maxOccur
        Set<Character> charSet = map.keySet()
                                    .stream()
                                    .filter( key -> map.get(key) == maxOccur)
                                    .collect(toSet());
        System.out.println(charSet);
//        Set<Character>

    }
    public void learnTernaryOperator(){
        int count = 9;//?
        // if count > 10 , then sattaResult = 12, else sattaResult = 8
        int sattaResult = count > 1 ? 12 : 8;
        System.out.println(sattaResult);
    }

    public static void main(String[] args) {
        Demo demoObj = new Demo();
//        demoObj.findMostOccurringLett();
//        demoObj.learnTernaryOperator();
        demoObj.maxFreqLetter();
    }




















}
