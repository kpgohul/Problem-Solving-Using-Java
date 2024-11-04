public class MemoryOptimization {

    public static void main(String[] args) {
        int[][] grid={{0,0,0},{0,-1,0},{0,0,0}};
        int[] dp=new int[grid.length];
        for(int i=0;i<grid.length;i++)
        {
            dp[i]=1;
        }
        for(int i=1;i< dp.length;i++)
        {
            for (int j=1;j< dp.length;j++)
            {
                if(grid[i][j]==-1)  dp[j]=0;
                else dp[j]=dp[j]+dp[j-1];
            }
        }
        System.out.println(dp[grid.length-1]);
    }
}
