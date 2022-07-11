package Recursion;


public class isSorted {


    public static boolean isSorted(int[] arr, int si)
    {
        // check that i am ind at my array or not - if yes that means yes this array sorted

        if( si == arr.length - 1)
        {
            return true;
        }

//        check to my adjecant element is bigger than me or not;
        if(arr[si] > arr[si+1])
        {
            return false;
        }
        else
        {
            boolean result = isSorted(arr,si+1);
            return result;
        }
    }


    public static void main(String[] args) {

        int[] arr = {2,3,8,9,10};
        System.out.println(isSorted(arr,0));

    }
}
