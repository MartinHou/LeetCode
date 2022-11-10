import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(isHappy(input));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true){
            set.add(n);
            n = fun(n);
            if(n==1)return true;
            if(set.contains(n))return false;
        }
    }

    public static int fun(int a){
        int res=0;
        while(a>0){
            res+=Math.pow(a%10,2);
            a/=10;
        }
        return res;
    }
}
