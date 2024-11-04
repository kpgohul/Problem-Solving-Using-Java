import java.util.Arrays;

public class MemoryOptimization {
    public static void main(String[] args) {
        int[] jumps = {30, 10, 60, 60, 50};
        int k=3;
        int[] dp=new int[k];
        Arrays.fill(dp,-1);
        dp[0]=0;
        System.out.println(Arrays.toString(dp));
        for(int step=1;step<jumps.length;step++)
        {
            int min=Integer.MAX_VALUE;
            for(int i=0;i<k;i++)
            {
                if(step-i-1>=0)
                    min=Math.min(min,dp[i]+Math.abs(jumps[step]-jumps[step-i-1]));
            }

            shift(dp);
            dp[0]=min;
            System.out.println(Arrays.toString(dp));
        }
        System.out.println(dp[0]);
    }

    private static void shift(int[] dp) {
//        System.out.println(Arrays.toString(dp));
        for(int i=dp.length-2;i>=0;i--)
        {
            dp[i+1]=dp[i];
        }

    }
}
