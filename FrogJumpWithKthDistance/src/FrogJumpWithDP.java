import java.util.Arrays;

public class FrogJumpWithDP {
    public static void main(String[] args) {
        int[] jumps={30,10,60,60,50};
        int[] dp=new int[jumps.length];
        Arrays.fill(dp,-1);
        int k=3;
        System.out.println(minJump(jumps.length-1,jumps,k,dp));
    }


    private static int minJump(int step, int[] jumps,int k,int[] dp) {
        if(step==0) return 0;
        int minDis=Integer.MAX_VALUE;
        if(dp[step]!=-1) return dp[step];
        for(int i=1;i<=k;i++)
        {
            int min=Integer.MAX_VALUE;
            if(step-i>=0)
                min=minJump(step-i,jumps,k,dp)+Math.abs(jumps[step]-jumps[step-i]);
            minDis=Math.min(minDis,min);
        }
        return dp[step]=minDis;
    }
}
