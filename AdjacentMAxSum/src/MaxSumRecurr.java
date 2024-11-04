public class MaxSumRecurr {
    public static void main(String[] args) {
        int[] values={2,1,4,9};
        System.out.println(maxSum(values.length-1,values));
    }

    private static int maxSum(int index, int[] values)
    {
        if(index==0) return values[0];
        //
        int pick=values[index];
        if(index-2>=0)
             pick+=maxSum(index-2,values);
        int notPick=0+maxSum(index-1,values);
        return Math.max(pick,notPick);
    }
}
