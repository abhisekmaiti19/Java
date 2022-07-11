package Recursion;

public class firstIndex {

    public static int firstIndex(int[] arr, int n, int ind)
    {
        if(ind == arr.length-1) return -1;

        if(arr[ind] == n)
        {
            return ind;
        }

        return firstIndex(arr,n,ind+1);

    }
    public static void main(String[] args) {

        int arr[] = {1,3,2,5,6,2};
        System.out.println(firstIndex(arr,2,0));

    }
}
