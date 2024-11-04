public class FrogJumpRcurr {
    public static void main(String[] args) {
        int[] jumps={30,10,60,60,50};
        int k=3;
        System.out.println(minJump(jumps.length-1,jumps,k));
    }


    private static int minJump(int step, int[] jumps,int k) {
        if(step==0) return 0;
        int minDis=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++)
        {
            int min=Integer.MAX_VALUE;
            if(step-i>=0)
                  min=minJump(step-i,jumps,k)+Math.abs(jumps[step]-jumps[step-i]);
            minDis=Math.min(minDis,min);
        }
        return minDis;
    }
}
