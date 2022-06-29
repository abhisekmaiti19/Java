package SearChing_Sorting;
import java.util.*;

public class searching {

    public static int LinearSearch(int data, int[] arr)
    {
        //order of O(n) is time complexity
        int index = -1;
        for(int i =0 ; i<arr.length; i++)
        {
            if(arr[i] == data)
            {
                return i;
            }
        }
        return index;
    }

    public static int BinarySearch(int data, int[] arr)
    {
        //order of O(n) is time complexity
        int index = -1;
        int left = 0 ;
        int right = arr.length-1;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(arr[mid] == data)
            {
                return mid;
            }
            else if(arr[mid] > data)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }

        return index;
    }

    public static void main(String [] args)
    {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++)
            {
                arr[i] = scn.nextInt();
            }
            int data = scn.nextInt();
        int geting = LinearSearch(data,arr);
        int geting2 = BinarySearch(data,arr);
        System.out.println("Peye gechi ei to "+ geting2+" ei position e");

    }
}
