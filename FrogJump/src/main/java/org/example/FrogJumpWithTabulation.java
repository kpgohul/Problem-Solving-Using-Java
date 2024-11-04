package org.example;

public class FrogJumpWithTabulation {
    public static void main(String[] args) {
        int[] jumps={30,10,60,60,50};
        int[] minJump=new int[jumps.length];
        minJump[0]=0;
        for(int i=1;i< jumps.length;i++)
        {
            int single=Math.abs(jumps[i]-jumps[i-1])+minJump[i-1];//single jump
            int dble=Integer.MAX_VALUE;
            if(i>1) dble=Math.abs(jumps[i]-jumps[i-2])+minJump[i-2];//double jump
            minJump[i]=Math.min(single,dble);//minimum jumped distance
        }
        System.out.println(minJump[minJump.length-1]);
    }
}
