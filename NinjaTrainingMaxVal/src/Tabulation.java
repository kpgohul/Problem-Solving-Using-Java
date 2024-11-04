public class Tabulation {
    public static void main(String[] args) {
        int[][] days = {{10, 50, 1}, {5, 100, 11},{10,20,30}};
        int max = Integer.MIN_VALUE;
        int[][] tabulation = new int[days.length][days[0].length + 1];
        fillBaseCase(days, tabulation);
        int preTaskIndex = tabulation[0].length;
        for (int day = 1; day < days.length; day++) {

            for (int task = 0; task < days[0].length; task++) {
                int trackLastTaskIndex=-1;
                for (int preDayTask = 0; preDayTask < days[0].length; preDayTask++) {
                    if (preDayTask == task) continue;
                    int curr = days[day][task] + days[day - 1][preDayTask];
                    if (curr > max) {max = curr;trackLastTaskIndex=preDayTask;}
                    }
                preTaskIndex=trackLastTaskIndex;
                }
            }
        System.out.println(max);
        }

    public static void fillBaseCase(int[][] days,int[][] tabulation)
    {
        for(int task=0;task< days[0].length;task++)
        {
            tabulation[0][task]=days[0][task];
        }
    }
}
