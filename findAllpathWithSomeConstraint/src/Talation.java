public class Talation {
    public static void main(String[] args) {
        int[][] grid={{0,0,0},{0,-1,0},{0,0,0}};
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            dp[0][i]=1;
            dp[i][0]=1;
        }
        for(int i=1;i< dp.length;i++)
        {
            for (int j=1;j< dp.length;j++)
            {
                if(grid[i][j]==-1)  dp[i][j]=0;
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[grid.length-1][grid[0].length-1]);
    }
}
