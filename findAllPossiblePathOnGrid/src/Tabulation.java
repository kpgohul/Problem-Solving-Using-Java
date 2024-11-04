public class Tabulation {
    public static void main(String[] args) {
        int[][] dp=new int[3+1][3+1];
        for(int i=1;i<=3;i++)
        {
            dp[1][i]=1;
            dp[i][1]=1;
        }
        for(int i=2;i< dp.length;i++)
        {
            for (int j=2;j< dp.length;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[3][3]);
    }
}
