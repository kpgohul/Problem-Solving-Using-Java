package org.example;

public class FrogJumpWithMemOptimization {
    public static void main(String[] args) {
        int[] jumps={30,10,60,60,50};
        int pre1=0;
        int pre2=0;
        for (int i = 1; i < jumps.length; i++) {
            int single=Math.abs(jumps[i]-jumps[i-1])+pre1;
            int dble=Integer.MAX_VALUE;
            if(i>1) dble=Math.abs(jumps[i]-jumps[i-2])+pre2;
            int curr=Math.min(single,dble);
            pre2=pre1;
            pre1=curr;
        }
        System.out.println(pre1);
    }
}
