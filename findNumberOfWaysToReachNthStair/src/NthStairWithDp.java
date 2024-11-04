import java.util.Arrays;

public class NthStairWithDp {
    public static void main(String[] args) {
        int[] dp=new int[4+1];
        Arrays.fill(dp,-1);
        System.out.println(noOfWays(4,dp));
    }
    public static int noOfWays(int step,int[] dp)
    {
        if(step==1) return 1;
        if(step==0) return 0;//if needed!!
        if(step==2) return 2;
        if(dp[step]!=-1) return dp[step];
        int singleStep=noOfWays(step-1,dp);//1
        int doubleStep=0;
        if(step>2) doubleStep=noOfWays(step-2,dp);//the condition also not needed!!
        return dp[step]=singleStep+doubleStep;
    }
}
