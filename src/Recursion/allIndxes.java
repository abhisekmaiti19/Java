package Recursion;


import java.util.ArrayList;

public class allIndxes {
    static ArrayList<Integer> list = new ArrayList<>();
    static int flag = 0;

    public static int allindexes(int arr[],int si,int data)
    {
        if(arr.length-1 == si && flag>0)
        {
            return 1;
        }
         if(arr.length-1 == si && flag==0)
         {
             return -1;
         }

        if(arr[si] == data)
        {
            list.add(si);
                flag++;
        }
        return allindexes(arr,si+1,data);

    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,5,6,2,3,5,6,3,1};
        System.out.println(allindexes(arr,0,3));
        if(allindexes(arr,0,3) == 1) System.out.println(list);

    }
}
