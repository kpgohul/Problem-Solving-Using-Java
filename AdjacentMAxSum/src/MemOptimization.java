public class MemOptimization {
    public static void main(String[] args) {
        int[] values={2,1,4,9};
        int pre1=values[0];
        int pre2=0;
        for(int i=1;i< values.length;i++) {
            int pick = values[i] + pre2;

            int notPick = 0 + pre1;
            int currMAx = Math.max(pick, notPick);
            pre2 = pre1;
            pre1 = currMAx;
        }
        System.out.println(pre1);
    }
}
