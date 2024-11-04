public class MemoryOptimization {
    public static void main(String[] args) {
        int[] dp=new int[3+1];
        for(int i=1;i<=3;i++)
        {
            dp[i]=1;
        }
        for(int i=2;i< dp.length;i++)
        {
            for (int j=2;j< dp.length;j++)
            {
                dp[j]=dp[j]+dp[j-1];
            }
        }
        System.out.println(dp[3]);
    }
}
