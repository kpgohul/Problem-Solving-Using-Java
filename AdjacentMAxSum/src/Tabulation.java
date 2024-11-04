import java.util.Arrays;

public class Tabulation {
    public static void main(String[] args) {
        int[] values={2,1,4,9};
        int[] dp=new int[values.length];
        dp[0]=values[0];
        for(int i=1;i< values.length;i++)
        {
            int pick=values[i];
            if(i-2>=0)
                   pick+=dp[i-2];
            int notPick=0+dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
      //  System.out.println(Arrays.toString(dp));
        System.out.println(dp[dp.length-1]);
    }
}
