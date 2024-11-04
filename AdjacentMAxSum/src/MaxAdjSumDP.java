import java.util.Arrays;

public class MaxAdjSumDP {
    public static void main(String[] args) {
        int[] values={2,1,4,9};
        int[] dp=new int[values.length];
        Arrays.fill(dp,-1);
        System.out.println(maxSum(values.length-1,values,dp));
    }

    private static int maxSum(int index, int[] values,int[] dp)
    {
        if(index==0) return values[0];
        //
        if(dp[index]!=-1) return dp[index];
        int pick=values[index];
        if(index-2>=0)
            pick+=maxSum(index-2,values,dp);
        int notPick=0+maxSum(index-1,values,dp);
        return dp[index]=Math.max(pick,notPick);
    }
}
