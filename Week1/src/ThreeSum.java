import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str = scanner.next();
        String[] strs = str.split(",");
        int[] input = new int[strs.length];
        for (int i=0;i<strs.length;++i){
            input[i] = Integer.parseInt(strs[i]);
        }
        List<List<Integer>> res = solution(input);
        System.out.println(res);

    }

    public static List<List<Integer>> solution(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<nums.length-2;++i){
            int l=i+1,r=nums.length-1;
            int aim = -nums[i];
            while(l<r){
                if(nums[l]+nums[r]==aim){
                    List<Integer> tmp = Arrays.asList(nums[i], nums[l], nums[r]);
                    res.add(tmp);
                    l++;r--;
                } else if (nums[l] + nums[r] < aim) {
                    l++;
                }else r--;
            }
        }
        return new ArrayList<>(res);
    }
}


