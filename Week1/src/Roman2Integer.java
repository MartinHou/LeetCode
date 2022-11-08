import java.util.HashMap;
import java.util.Scanner;

public class Roman2Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(romanToInt(next));
    }

    public static int romanToInt(String s) {
        HashMap<String, Integer> prioritMap = new HashMap<>();
        prioritMap.put("IV",4);
        prioritMap.put("IX",9);
        prioritMap.put("XL",40);
        prioritMap.put("XC",90);
        prioritMap.put("CD",400);
        prioritMap.put("CM",900);
        HashMap<Character, Integer> secondaryMap = new HashMap<>();
        secondaryMap.put('I',1);
        secondaryMap.put('V',5);
        secondaryMap.put('X',10);
        secondaryMap.put('L',50);
        secondaryMap.put('C',100);
        secondaryMap.put('D',500);
        secondaryMap.put('M',1000);
        int i=0,res=0;
        while(i<s.length()){
            if(i+1<s.length()&& prioritMap.containsKey(s.substring(i,i+2))){
                res+=prioritMap.get(s.substring(i,i+2));
                i+=2;
            }else{
                res+=secondaryMap.get(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}
