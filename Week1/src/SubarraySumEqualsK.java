import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] str = next.split(",");
        int[] input = new int[str.length];
        for(int i=0;i<str.length;++i)
            input[i]=Integer.parseInt(str[i]);
        int k=scanner.nextInt();
        System.out.println(subarraySum(input,k));
    }

    public static int subarraySum(int[] nums, int k) {
        int[] sums = new int[nums.length+1];
        sums[0]=0;
        for (int i = 1; i < sums.length; i++) {
            sums[i]=sums[i-1]+nums[i-1];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int res=0;
        for (int i = 1; i < sums.length; i++) {
            int aim=sums[i]-k;
            if(map.get(aim)!=null){
                int tmp = map.get(aim);
                res+=tmp;
            }
            map.put(sums[i],map.getOrDefault(sums[i],0)+1);
        }
        return res;
    }
}
