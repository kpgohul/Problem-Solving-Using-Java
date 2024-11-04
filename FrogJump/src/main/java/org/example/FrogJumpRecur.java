package org.example;

public class FrogJumpRecur {
    public static void main(String[] args) {
        int[] jumps={30,10,60,60,50};
        System.out.println(frogJump(4,jumps));
    }
    public static int frogJump(int index,int[] arr)
    {
        if(index==0) return 0;
        int single=Math.abs(arr[index]-arr[index-1])+frogJump(index-1,arr);
        int doub=Integer.MAX_VALUE;
        if (index>1)
            doub=Math.abs(arr[index]-arr[index-2])+frogJump(index-2,arr);
        return Math.min(single,doub);
    }
}
