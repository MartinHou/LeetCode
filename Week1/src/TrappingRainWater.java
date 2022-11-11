import java.util.Scanner;

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
        int res=0,lastNoneZero=-2;
        while(lastNoneZero!=-1){
            lastNoneZero=-1;
            for (int i = 0; i < height.length; i++) {
                if(height[i]!=0){
                    if(lastNoneZero==-1)lastNoneZero=i;
                    else{
                        res+=i-lastNoneZero-1;
                        lastNoneZero=i;
                    }
                    height[i]--;
                }
            }
        }
        return res;
    }
}
