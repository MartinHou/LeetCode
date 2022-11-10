import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        String[] arr = in.split(",");
        int[] input = new int[arr.length];
        for (int i=0;i<arr.length;++i){
            input[i]=Integer.parseInt(arr[i]);
        }
        System.out.println(Arrays.toString(productExceptSelf(input)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        int tmp=1;
        for (int i = 0; i < n; i++) {
            res[i]=tmp;
            tmp*=nums[i];
        }
        tmp=1;
        for (int i = n-1; i >= 0 ; i--) {
            res[i]*=tmp;
            tmp*=nums[i];
        }
        return res;
    }
}
