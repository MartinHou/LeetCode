import java.util.Scanner;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] str = next.split(",");
        int[] input = new int[str.length];
        for(int i=0;i<str.length;++i)
            input[i]=Integer.parseInt(str[i]);
        int k=scanner.nextInt();
        System.out.println(splitArray(input,k));
    }

    private static int splitArray(int[] nums, int k){
        int sum=0,max=0;
        for(int num:nums){
            sum+=num;
            max=Math.max(max,num);
        }
        if(k==1)return sum;
        int l=max,r=sum;
        while(l<=r){    // why < wont work ==> last round could be l=mid+1, so mid changed
            int mid = (l+r)/2;
            if(valid(nums,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    private static boolean valid(int[] nums,int k,int mid){
        int sum=0,count=1;
        for(int num : nums){
            if(sum+num<=mid){
                sum+=num;
            }else{
                sum=num;
                count++;
                if(count>k)return false;// mid needs to be increased
            }
        }
        return true;//mid can be decreased
    }
}
