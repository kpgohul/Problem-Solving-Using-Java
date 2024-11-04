import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] list=new int[n];
        for(int i=0;i<n;i++)
        {
            list[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(list[j]<list[j-1])
                {
                    int temp=list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                }
                else break;
            }
            for(int val:list)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
