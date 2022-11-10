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
        int n=nums.length;
        int[] min = new int[n];
        int[] max = new int[n];
        int cur_min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            cur_min = Math.min(cur_min, nums[i]);
            min[i]=cur_min;
        }
        int cur_max=Integer.MIN_VALUE;
        for (int i = n-1; i >= 0 ; i--) {
            cur_max = Math.max(cur_max, nums[i]);
            max[i]=cur_max;
        }
        for (int i = 1; i < n-1; i++) {
            if(min[i]!=nums[i]&&max[i]!=nums[i])return true;
        }
        return false;
    }
}
