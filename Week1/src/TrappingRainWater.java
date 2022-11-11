import java.util.Scanner;
import java.util.Stack;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] str = next.split(",");
        int[] input = new int[str.length];
        for(int i=0;i<str.length;++i)
            input[i]=Integer.parseInt(str[i]);
        System.out.println(trap(input));
    }

    public static int trap(int[] height) {
        Stack<Integer> stk = new Stack<>();
        int res=0,i=0;
        while(i<height.length){
            if(stk.isEmpty()||height[i]<height[stk.peek()]){
                stk.push(i++);
            }else{
                int bot=stk.pop();
                int vol = stk.isEmpty()?0:(Math.min(height[stk.peek()],height[i])-height[bot])*(i-stk.peek()-1);
                res+=vol;
            }
        }
        return res;
    }
}
