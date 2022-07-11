package Recursion;

public class lastInd {


    public static int firstIndex(int[] arr, int n, int ind)
    {
        if(ind == arr.length-1) return -1;

        int index =  firstIndex(arr,n,ind+1);

        if(index == -1)
        {
            if(arr[ind] == n)
            {
                return ind;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return index;
        }


    }
    public static void main(String[] args) {

        int arr[] = {1,3,2,5,2,2};
        System.out.println(firstIndex(arr,2,0));

    }

}
