public class NinjaTrainingRecurr {
    public static void main(String[] args) {
        int[][] days={{10,50,1},{5,100,11},{10,20,30}};
        System.out.println(maxPossible(days.length-1,days,-1));
    }
    public static int maxPossible(int index,int[][] days,int preTaskIndex)
    {
        if(index<0) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<days[index].length;i++)
        {
            if(i==preTaskIndex) continue;
            int task=days[index][i]+maxPossible(index-1,days,i);
            max=Math.max(max,task);
        }
        return max;
    }
}
