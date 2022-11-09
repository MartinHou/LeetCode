import java.util.HashSet;
import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next1 = scanner.next();
        String next2 = scanner.next();
        String[] strs1 = next1.split(",");
        String[] strs2 = next2.split(",");
        int[] gas = new int[strs1.length];
        int[] cost = new int[strs2.length];
        for (int i = 0; i < gas.length; ++i) {
            gas[i] = Integer.parseInt(strs1[i]);
            cost[i] = Integer.parseInt(strs2[i]);
        }
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        for (int i = 0; i < gas.length; i++) {
            sum+=gas[i]-cost[i];
        }
        if(sum<0)return -1;
        sum=0;
        int start=0;
        for (int i = 0; i < gas.length; i++) {
            int gain=gas[i]-cost[i];
            if(sum+gain<0){
                sum=0;
                start=i+1;
            }else sum+=gain;
        }
        return start;
    }
}
/*
1,2,3,4,5
3,4,5,1,2

*/