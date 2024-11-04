import java.util.Arrays;

public class FindAllPAthWithDP {

    public static void main(String[] gohul) {
        int[][] grid={{0,0,0},{0,-1,0},{0,0,0}};
        int[][] dp=new int[grid.length][grid[0].length];
        fill(dp);
        System.out.println(findAllPath(grid.length-1,grid[0].length-1,dp,grid));

    }

    private static int findAllPath(int row, int col,int[][] dp,int[][] grid)
    {

        if(row==0&&col==0) return 1;
        if(row<0||col<0) return 0;
        if(row<grid.length&&col<grid[0].length&&grid[row][col]==-1) return 0;
        if(dp[row][col]!=-1) return dp[row][col];

        int top=findAllPath(row-1,col,dp,grid);
        int left=findAllPath(row,col-1,dp,grid);
        return dp[row][col]=top+left;

    }
    public static void fill(int[][] dp)
    {
        for(int[] temp:dp)
        {
            Arrays.fill(temp,-1);
        }
    }
}
