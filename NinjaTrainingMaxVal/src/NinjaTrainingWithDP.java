import java.util.Arrays;

public class NinjaTrainingWithDP
{
    public static void main(String[] args) {
        int[][] days={{10,50,1},{5,100,11}};
        int[][] dp=new int[days.length][days[0].length+1];
        fill(dp);
        System.out.println(maxPossible(days.length-1,days,3,dp));
    }
    public static int maxPossible(int index,int[][] days,int preTaskIndex,int[][] dp)
    {
        if(index<0) return 0;
        if(dp[index][preTaskIndex]!=-1) return dp[index][preTaskIndex];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<days[index].length;i++)
        {
            if(i==preTaskIndex) continue;
            int task=days[index][i]+maxPossible(index-1,days,i,dp);
            max=Math.max(max,task);
        }
        return dp[index][preTaskIndex]=max;
    }
    public static void fill(int[][] dp)
    {
        for(int[] temp:dp)
        {
            Arrays.fill(temp,-1);
        }
    }
}
