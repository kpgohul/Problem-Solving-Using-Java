public class NthStairRecurr {
    public static void main(String[] args) {
        System.out.println(noOfWays(4));
    }
    public static int noOfWays(int step)
    {
        if(step==1) return 1;
        if(step==0) return 0;//if needed!!
        if(step==2) return 2;
        int singleStep=noOfWays(step-1);//1
        int doubleStep=0;
        if(step>2) doubleStep=noOfWays(step-2);
        return singleStep+doubleStep;
    }
}
