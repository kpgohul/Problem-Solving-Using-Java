public class Tabulation {
    public static void main(String[] args) {
        int step=4;
        int[] dp=new int[step+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=step;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[step]);
    }
}
