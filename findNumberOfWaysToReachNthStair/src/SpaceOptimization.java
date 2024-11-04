public class SpaceOptimization {
    public static void main(String[] args) {
        int step=5;
        int pre1=1;
        int pre2=2;
        for(int i=3;i<=step;i++)
        {
//            System.out.println(pre1+" "+pre2);
            int curr=pre1+pre2;
            pre1=pre2;
            pre2=curr;
        }
        System.out.println(step==1?pre1:pre2);
    }
}
