package org.example;

public class FindNthFib {
    public static void main(String[] args) {
        int n=5;
        int first =0;
        int second=1;
       // System.out.print(first+" "+second);
        for(int i=2;i<=n;i++)
        {
            int temp=first+second;
           // System.out.print(" "+temp);
            first=second;
            second=temp;
        }
        System.out.println(second);
    }
}
