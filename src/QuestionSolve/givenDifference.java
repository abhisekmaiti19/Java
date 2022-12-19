package QuestionSolve;
import java.sql.SQLOutput;
import java.util.*;

public class givenDifference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int diff = scn.nextInt();
        int[] arr = new int[n];


        for(int i = 0; i<n; i++)
        {
            arr[i]= scn.nextInt();
        }

        for(int i = 0; i<n; i++)
        {
            int find = arr[i] - diff ;
            if((Arrays.binarySearch(arr,find) >0))
            {
                System.out.println(1); return;
            }
        }

        System.out.println(-1);


    }
}
