package org.example;

import java.util.Arrays;


public class FindNthFibRecur {
    public static void main(String[] args) {
        int[] dp=new int[5+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(5,dp));
    }
    public static int fib(int n,int[]dp)
    {
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
}
