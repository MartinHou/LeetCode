import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        String[] arr = in.split(",");
        int[] input = new int[arr.length];
        for (int i=0;i<arr.length;++i){
            input[i]=Integer.parseInt(arr[i]);
        }
        System.out.println(increasingTriplet(input));
    }

    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= max1) max1 = n;
            else if(n <= max2) max2 = n;
            else return true;
        }
        return false;
    }
}
