package Recursion;

public class bubbleSort {


    public static void bubble(int arr[], int si, int li)
    {
        // check that i have done with whole array that means li is at the end or not
        if(li == 0)
        {
            return;
        }

        // check wheather my current element is at last poisition or at perfect position or no
        if(li == si)
        {
            bubble(arr,0,li-1);
            return;
        }



        // do my task - > check wheather my adjecent element bigger or not if no then swap

        if(arr[si]>arr[si+1])
        {
            //doing swap
            int temp  = arr[si];
            arr[si] = arr[si+1];
            arr[si+1] = temp;
        }
        bubble(arr,si+1,li);
    }

    public static void main(String[] args) {
        int arr[] = {3,8,6,1,9,7};
        bubble(arr,0,arr.length-1);
        for (int i = 0; i<arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
