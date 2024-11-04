import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfItems {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfDrinks = s.nextInt();
        int noOfCustomer = s.nextInt();
        s.nextLine();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (noOfCustomer-- > 0) {
            String[] vals = s.nextLine().replace(" ", "").replace("[","").replace("]","").split(",");
            ArrayList<Integer> temp = new ArrayList<>();
            for (String i : vals) {
                temp.add(Integer.parseInt(i));
            }
            list.add(temp);
        }
        System.out.println(findCount(list, list.size(), noOfDrinks));
    }

    private static int findCount(ArrayList<ArrayList<Integer>> list, int size, int noOfDrinks) {
        int[][] table = toDo(list, size, noOfDrinks);
        int customerSatisfy=size;
        int count=0;
        List<Integer> drinks=new ArrayList<>();// if needed!!
        while(customerSatisfy>0)
        {
              int max=0;
              int index=-1;
              for(int i=0;i<noOfDrinks;i++)
              {
                  if(max<table[i][size])
                  {
                      max=table[i][size];
                      index=i;
                  }
              }
              customerSatisfy-=max;// reduce the customer satisfaction (ie you have have to satisfy the remaining customer !!)
              count++;// Increment the no. of drinks needed;
              drinks.add(index);// add the type of drinks needed!!  // if needed!!
              for(int i=0;i<size;i++)
              {
                  if(table[index][i]==1)
                  {
                      for(int j=0;j<noOfDrinks;j++)
                      {
                          if(table[j][i]==1)
                          {
                              table[j][i]=0;
                              table[j][size]-=1;
                          }
                      }
                  }
              }


        }
     return count;
    }

    private static int[][] toDo(ArrayList<ArrayList<Integer>> list, int size, int noOfDrinks) {
        int[][] temp = new int[noOfDrinks][size+1];
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.get(i).size();j++)
            {
                temp[list.get(i).get(j)][i]=1;
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            int sum=0;
            for(int j:temp[i])
            {
                sum+=j;
            }
            temp[i][size]=sum;
        }
        return temp;
    }
}
