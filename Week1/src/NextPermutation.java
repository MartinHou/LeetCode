import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] strs = next.split(",");
        int[] input = new int[strs.length];
        for (int i = 0; i < input.length; ++i) {
            input[i]=Integer.parseInt(strs[i]);
        }
        nextPermutation(input);
        System.out.println(Arrays.toString(input));
    }

    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n==1)return;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1])i--;
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i])j--;
            swap(nums,i,j);
        }
        reverse(nums, i + 1, n - 1);
    }

    public static void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void reverse(int[] nums,int l,int r){
        while(l<r)swap(nums,l++,r--);
    }
}
