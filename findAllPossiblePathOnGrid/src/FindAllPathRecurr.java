public class FindAllPathRecurr {
    public static void main(String[] gohul) {
        System.out.println(findAllPath(3,3));
    }

    private static int findAllPath(int row, int col)
    {
        if(row==1&&col==1) return 1;
        if(row<=0||col<=0) return 0;
        int top=findAllPath(row-1,col);
        int left=findAllPath(row,col-1);
        return top+left;

    }
}
