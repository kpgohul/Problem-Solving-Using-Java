package org.example;

public class FibonacciSeries {
//0 1 1 2 3 ........
public static void main(String[] args) {
    int n=5;
    int first =0;
    int second=1;
    System.out.print(first+" "+second);
    for(int i=1;i<=n-2;i++)
    {
        int temp=first+second;
        System.out.print(" "+temp);
        first=second;
        second=temp;
    }
}
}
