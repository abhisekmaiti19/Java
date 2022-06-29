package SearChing_Sorting;
import java.util.*;

public class Sorting {

    public static void BubbleSort(int [] arr)
    {
        for(int counter = 0; counter<arr.length-1;counter++)
        {
            for(int j  = 0 ; j<arr.length-1-counter;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void Selection(int [] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {

            int min = i;

            for(int j = i+1; j<=arr.length-1; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]= temp;

        }
    }

    public static void InsertionSort(int [] arr)
    {
        for (int i = 1; i <= arr.length-1; i++) {

            int val = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>val)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;

        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

//        BubbleSort(arr);
        Selection(arr);
//        InsertionSort(arr);

        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
