package org.example;

import java.util.Arrays;

public class FrogJumpWithDP {
    public static void main(String[] args) {
        int[] jumps={30,10,60,60,50};
        int[] dp=new int[jumps.length+1];
        Arrays.fill(dp,-1);
        System.out.println(frogJump(4,jumps,dp));
    }
    public static int frogJump(int index,int[] arr,int[] dp)
    {
        if(index==0) return 0;
        if(dp[index]!=-1) return dp[index];
        int single=Math.abs(arr[index]-arr[index-1])+frogJump(index-1,arr,dp);
        int doub=Integer.MAX_VALUE;
        if (index>1)
            doub=Math.abs(arr[index]-arr[index-2])+frogJump(index-2,arr,dp);
        return dp[index]=Math.min(single,doub);
    }
}
