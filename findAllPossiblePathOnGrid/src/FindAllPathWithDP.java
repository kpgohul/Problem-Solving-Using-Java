import java.util.Arrays;

public class FindAllPathWithDP {
    public static void main(String[] gohul) {
        int[][] dp=new int[3+1][3+1];
        fill(dp);
        System.out.println(findAllPath(3,3,dp));

    }

    private static int findAllPath(int row, int col,int[][] dp)
    {
        if(row==1&&col==1) return 1;
        if(row<=0||col<=0) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        int top=findAllPath(row-1,col,dp);
        int left=findAllPath(row,col-1,dp);
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
