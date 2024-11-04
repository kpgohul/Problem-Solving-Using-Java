public class Tabulation {
    public static void main(String[] args) {
        int[] jumps={30,10,60,60,50};
        int k=9;
        int[] minJump=new int[jumps.length];
        minJump[0]=0;
        for(int step=1;step<jumps.length;step++)
        {
            int min=Integer.MAX_VALUE;
            for(int i=1;i<=k;i++)
            {
                if(step-i>=0)
                     min=Math.min(min,minJump[step-i]+Math.abs(jumps[step]-jumps[step-i]));
            }
            minJump[step]=min;
        }
        System.out.println(minJump[jumps.length-1]);
    }
}
