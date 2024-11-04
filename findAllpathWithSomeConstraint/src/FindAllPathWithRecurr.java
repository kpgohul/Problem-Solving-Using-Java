public class FindAllPathWithRecurr {


    public static void main(String[] gohul) {
        int[][] grid={{0,0,0},{0,-1,0},{0,0,0}};
        System.out.println(findAllPath(grid.length-1,grid[0].length-1,grid));
    }

    private static int findAllPath(int row, int col,int[][] grid)
    {
        if(row==0&&col==0) return 1;
        if(row<0||col<0) return 0;
        if(row<grid.length&&col<grid[0].length&&grid[row][col]==-1) return 0;
        int top=findAllPath(row-1,col,grid);
        int left=findAllPath(row,col-1,grid);
        return top+left;

    }
}

