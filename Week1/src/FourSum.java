import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] str = next.split(",");
        int[] input = new int[str.length];
        for (int i=0;i<str.length;++i){
            input[i]=Integer.parseInt(str[i]);
        }
        int target = scanner.nextInt();
        System.out.println(fourSum(input,target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-3;++i){
            for(int j=i+1;j<nums.length-2;++j){
                long aim =(long) target-(long) nums[i]-(long) nums[j];
                int l=j+1,r = nums.length-1;
                while(l<r){
                    if(nums[l]+nums[r]== aim){
                        ArrayList<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[l]);
                        tmp.add(nums[r]);
                        res.add(tmp);
                        while(l<r && nums[l]==tmp.get(2))l++;
                        while(l<r && nums[r]== tmp.get(3))r--;
                    } else if (nums[l] + nums[r] < aim) {
                        l++;
                    }else r--;
                }
                while(j<nums.length-2&&nums[j]==nums[j+1])j++;
            }
            while(i<nums.length-1&&nums[i]==nums[i+1])i++;
        }
        return new ArrayList<>(res);
    }
}

/*
1,0,-1,0,-2,2
0
 */